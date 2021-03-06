package teachers;

import static db.DBConnection.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teacher {

    private final int id;
    private String name;
    private String phone;

    public Teacher(int id) throws SQLException {
        String query = "Select * from teacher where teacher_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        this.name = rs.getString("teacher_name");
        this.phone = rs.getString("teacher_phone");
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) throws SQLException {
        String query = "Update teacher set teacher_name=? where teacher_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();

        this.name = name;
    }

    public void setPhone(String phone) throws SQLException {
        String query = "Update teacher set teacher_phone=? where teacher_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setString(1, phone);
        ps.setInt(2, id);
        ps.executeUpdate();

        this.phone = phone;
    }

    public void delete() throws SQLException {
        String query = "Delete from teacher where teacher_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        this.name = null;
        this.phone = null;
    }

    public ResultSet getCoursesId() throws SQLException {
        String query = "Select course_id from teacher_courses where teacher_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        return ps.executeQuery();
    }

    public void enrollToCourse(int courseId, double staticPrice) throws SQLException {
        String query = "Insert into teacher_courses values(?,?,?)";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        ps.setInt(2, courseId);
        ps.setDouble(3, staticPrice);
        ps.executeUpdate();
    }

    public void enrollToCourse(int courseId, boolean isStatic, double price) throws SQLException {
        if (isStatic) {
            String query = "Insert into teacher_courses(teacher_id,course_id,teach_price) "
                    + "values(?,?,?)";
            PreparedStatement ps = getConnection().prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, courseId);
            ps.setDouble(3, price);
            ps.executeUpdate();
        } else {
            String query = "Insert into teacher_courses"
                    + "(teacher_id,course_id,teach_price,static_price_status) "
                    + "values(?,?,?,?)";
            PreparedStatement ps = getConnection().prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, courseId);
            ps.setDouble(3, price);
            ps.setBoolean(4, false);
            ps.executeUpdate();
        }
    }

    public ResultSet getCoursesIdAndName() throws SQLException {
        String query = "Select CONCAT('(',c.course_id,') ',c.course_name) as '(Course Id) & Name' "
                + "from teacher_courses tc,course c "
                + "where tc.teacher_id=? and tc.course_id=c.course_id";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        return ps.executeQuery();
    }

    public void removeFromCourse(int courseId) throws SQLException {
        String query = "Delete from teacher_courses where teacher_id=? and course_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        ps.setInt(2, courseId);
        ps.executeUpdate();
    }

    public void giveMoney(double price) throws SQLException {
        String query = "Insert into teacher_purchases(teacher_id,purchase_price) values(?,?)";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        ps.setDouble(2, -price);
        ps.executeUpdate();
    }

    public ResultSet getPurchasesIdAndPrice() throws SQLException {
        String query = "Select CONCAT('id:(',purchase_id,'), "
                + "price:(',CONVERT(purchase_price USING utf8),')') AS 'Purchase' "
                + "from teacher_purchases where teacher_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        return ps.executeQuery();
    }

    public void removeGivenMoney(int purchaseId) throws SQLException {
        String query = "Delete from teacher_purchases where teacher_id=? and purchase_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        ps.setInt(2, purchaseId);
        ps.executeUpdate();
    }

    public ResultSet getCoursesFormated() throws SQLException {
        String query = "Select CONCAT('(',c.course_id,') ',c.course_name) AS 'Course',"
                + "CONCAT(tc.teach_date) as 'Date',"
                + "IF(tc.static_price_status=1,"
                + "CONCAT(tc.teach_price),CONCAT(tc.teach_price,'%')) as 'Money' "
                + "from teacher_courses tc,course c "
                + "where tc.teacher_id=? and tc.course_id=c.course_id;";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        return ps.executeQuery();
    }

    public ResultSet getBalance() throws SQLException {
        String query = "Select CONCAT('(',teacher_id,') ',teacher_name) AS 'Teacher',"
                + "CONVERT(Money USING utf8),Date,Description "
                + "from teachers_financial where teacher_id=?";
        PreparedStatement ps = getConnection().prepareStatement(query);
        ps.setInt(1, id);
        return ps.executeQuery();
    }
}
