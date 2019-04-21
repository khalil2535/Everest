package exams;

import db.DBConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam {

    private final int id;
    private String name;
    private double price;
    private Date time;

    public Exam(int exam_id) throws SQLException {
        String query = "Select * from exam where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, exam_id);
        ResultSet rs = preparedStatement.executeQuery();
        rs.next();
        this.name = rs.getString("exam_name");
        this.price = rs.getDouble("exam_price");
        this.id = exam_id;
        this.time = rs.getDate("exam_time");
    }

    Exam(int exam_id, String exam_name, double exam_price, Date exam_time) {
        this.id = exam_id;
        this.name = exam_name;
        this.price = exam_price;
        this.time = exam_time;
    }

    public int getExam_id() {
        return id;
    }

    public String getExam_name() {
        return name;
    }

    public void setExam_name(String newExamName) throws SQLException {
        String query = "Update exam set exam_name =? where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setString(1, newExamName);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.name = newExamName;
    }

    public double getExam_price() {
        return price;
    }

    public void setExam_price(double newExamPrice) throws SQLException {
        String query = "Update exam set exam_price =? where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setDouble(1, newExamPrice);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.price = newExamPrice;
    }

    public Date getExam_time() {
        return time;
    }

    public void setExam_time(Date newExamTime) throws SQLException {
        String query = "Update exam set exam_time =? where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setDate(1, newExamTime);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
        this.time = newExamTime;
    }

    public void delete() throws SQLException {
        String query = "Delete from exam where exam_id= ?";
        PreparedStatement preparedStatement
                = DBConnection.getConnection().prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        this.name = "";
        this.price = -1;
        this.time = new Date(0);
    }
}