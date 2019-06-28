package gui.mainFrames;

import gui.bookFrames.BookAddFrame;
import gui.userFrames.UserAddFrame;
import gui.bookFrames.BooksEditFrame;
import gui.bookFrames.BooksSoldOutDisplayFrame;
import gui.courseFrames.CourseAddFrame;
import gui.courseFrames.CoursesEditFrame;
import gui.examFrames.ExamsEditFrame;
import gui.userFrames.UsersEditFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import gui.examFrames.ExamAddFrame;
import gui.studentFrames.StudentAddFrame;
import gui.studentFrames.StudentsEditFrame;
import gui.teacherFrames.TeacherAddFrame;
import gui.teacherFrames.TeachersEditFrame;
import static utils.gui.GUI_Util.link_frame_to_button;

public class AdminMainFrame extends JFrame {

    final JFrame root;

    public AdminMainFrame(JFrame root) {
        root.setVisible(false);
        this.root = root;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        content_jPanel = new javax.swing.JPanel();
        studentsPnl = new javax.swing.JPanel();
        studentTitleLbl = new javax.swing.JLabel();
        studentAddBtn = new javax.swing.JButton();
        studentsInfoBtn = new javax.swing.JButton();
        booksPnl = new javax.swing.JPanel();
        bookLbl = new javax.swing.JLabel();
        bookAddBtn = new javax.swing.JButton();
        booksSoldoutDisplayBtn = new javax.swing.JButton();
        booksDisplayBtn = new javax.swing.JButton();
        contentTitleLbl = new javax.swing.JLabel();
        usersPnl = new javax.swing.JPanel();
        userLbl = new javax.swing.JLabel();
        usersEditBtn = new javax.swing.JButton();
        userAddBtn = new javax.swing.JButton();
        examsPnl = new javax.swing.JPanel();
        examsLbl = new javax.swing.JLabel();
        examAddBtn = new javax.swing.JButton();
        examEditBtn = new javax.swing.JButton();
        coursesPnl = new javax.swing.JPanel();
        coursesTitleLbl = new javax.swing.JLabel();
        courseAddBtn = new javax.swing.JButton();
        editCoursesBtn = new javax.swing.JButton();
        teachersPnl = new javax.swing.JPanel();
        teacherLbl = new javax.swing.JLabel();
        teachersEditBtn = new javax.swing.JButton();
        teacherAddBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(710, 560));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Everest Training Center");
        titleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLbl.setInheritsPopupMenu(false);

        logoutBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(0, 51, 153));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logoutBtn.setText("Log out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgLbl)
                .addGroup(titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn)
                        .addContainerGap())
                    .addGroup(titlePnlLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(logoutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content_jPanel.setBackground(new java.awt.Color(255, 255, 255));
        content_jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 171, 112)));
        content_jPanel.setToolTipText("");
        content_jPanel.setPreferredSize(new java.awt.Dimension(573, 450));

        studentsPnl.setBackground(new java.awt.Color(255, 255, 255));
        studentsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        studentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentTitleLbl.setText("Students");
        studentTitleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        studentAddBtn.setText("new student");
        studentAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAddBtnActionPerformed(evt);
            }
        });

        studentsInfoBtn.setText("student's Information");
        studentsInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentsPnlLayout = new javax.swing.GroupLayout(studentsPnl);
        studentsPnl.setLayout(studentsPnlLayout);
        studentsPnlLayout.setHorizontalGroup(
            studentsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentsPnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(studentsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentsInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        studentsPnlLayout.setVerticalGroup(
            studentsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsPnlLayout.createSequentialGroup()
                .addComponent(studentTitleLbl)
                .addGap(30, 30, 30)
                .addComponent(studentAddBtn)
                .addGap(30, 30, 30)
                .addComponent(studentsInfoBtn)
                .addGap(30, 30, 30))
        );

        booksPnl.setBackground(new java.awt.Color(255, 255, 255));
        booksPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        bookLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookLbl.setForeground(new java.awt.Color(0, 51, 153));
        bookLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookLbl.setText("Books");
        bookLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        bookAddBtn.setText("new book");
        bookAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAddBtnActionPerformed(evt);
            }
        });

        booksSoldoutDisplayBtn.setText("Display Sold Out Books");
        booksSoldoutDisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksSoldoutDisplayBtnActionPerformed(evt);
            }
        });

        booksDisplayBtn.setText("Edit available Books");
        booksDisplayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksDisplayBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout booksPnlLayout = new javax.swing.GroupLayout(booksPnl);
        booksPnl.setLayout(booksPnlLayout);
        booksPnlLayout.setHorizontalGroup(
            booksPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(booksPnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(booksPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksSoldoutDisplayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksDisplayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        booksPnlLayout.setVerticalGroup(
            booksPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(booksPnlLayout.createSequentialGroup()
                .addComponent(bookLbl)
                .addGap(17, 17, 17)
                .addComponent(bookAddBtn)
                .addGap(17, 17, 17)
                .addComponent(booksDisplayBtn)
                .addGap(17, 17, 17)
                .addComponent(booksSoldoutDisplayBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        contentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentTitleLbl.setText("Admin Main Page");
        contentTitleLbl.setToolTipText("");
        contentTitleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        usersPnl.setBackground(new java.awt.Color(255, 255, 255));
        usersPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        userLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userLbl.setForeground(new java.awt.Color(0, 51, 153));
        userLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLbl.setText("Users");
        userLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        usersEditBtn.setText("Edit Users");
        usersEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersEditBtnActionPerformed(evt);
            }
        });

        userAddBtn.setText("Add User");
        userAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAddBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usersPnlLayout = new javax.swing.GroupLayout(usersPnl);
        usersPnl.setLayout(usersPnlLayout);
        usersPnlLayout.setHorizontalGroup(
            usersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(usersPnlLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(usersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        usersPnlLayout.setVerticalGroup(
            usersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersPnlLayout.createSequentialGroup()
                .addComponent(userLbl)
                .addGap(11, 11, 11)
                .addComponent(userAddBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersEditBtn)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        examsPnl.setBackground(new java.awt.Color(255, 255, 255));
        examsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        examsLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examsLbl.setForeground(new java.awt.Color(0, 51, 153));
        examsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        examsLbl.setText("Exams");
        examsLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        examAddBtn.setText("new exam");
        examAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examAddBtnActionPerformed(evt);
            }
        });

        examEditBtn.setText("edit exams");
        examEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examEditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout examsPnlLayout = new javax.swing.GroupLayout(examsPnl);
        examsPnl.setLayout(examsPnlLayout);
        examsPnlLayout.setHorizontalGroup(
            examsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(examsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(examsPnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(examsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(examEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(examAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        examsPnlLayout.setVerticalGroup(
            examsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examsPnlLayout.createSequentialGroup()
                .addComponent(examsLbl)
                .addGap(30, 30, 30)
                .addComponent(examAddBtn)
                .addGap(30, 30, 30)
                .addComponent(examEditBtn)
                .addGap(30, 30, 30))
        );

        coursesPnl.setBackground(new java.awt.Color(255, 255, 255));
        coursesPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        coursesTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        coursesTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        coursesTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coursesTitleLbl.setText("Courses");
        coursesTitleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        courseAddBtn.setText("New course");
        courseAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseAddBtnActionPerformed(evt);
            }
        });

        editCoursesBtn.setText("Edit courses");
        editCoursesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCoursesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coursesPnlLayout = new javax.swing.GroupLayout(coursesPnl);
        coursesPnl.setLayout(coursesPnlLayout);
        coursesPnlLayout.setHorizontalGroup(
            coursesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursesTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coursesPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(coursesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editCoursesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        coursesPnlLayout.setVerticalGroup(
            coursesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesPnlLayout.createSequentialGroup()
                .addComponent(coursesTitleLbl)
                .addGap(11, 11, 11)
                .addComponent(courseAddBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editCoursesBtn)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        teachersPnl.setBackground(new java.awt.Color(255, 255, 255));
        teachersPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        teacherLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacherLbl.setText("Teachers");
        teacherLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        teachersEditBtn.setText("Edit Teachers");
        teachersEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersEditBtnActionPerformed(evt);
            }
        });

        teacherAddBtn.setText("Add Teacher");
        teacherAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAddBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teachersPnlLayout = new javax.swing.GroupLayout(teachersPnl);
        teachersPnl.setLayout(teachersPnlLayout);
        teachersPnlLayout.setHorizontalGroup(
            teachersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teacherLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(teachersPnlLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(teachersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teacherAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teachersEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        teachersPnlLayout.setVerticalGroup(
            teachersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachersPnlLayout.createSequentialGroup()
                .addComponent(teacherLbl)
                .addGap(11, 11, 11)
                .addComponent(teacherAddBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teachersEditBtn)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout content_jPanelLayout = new javax.swing.GroupLayout(content_jPanel);
        content_jPanel.setLayout(content_jPanelLayout);
        content_jPanelLayout.setHorizontalGroup(
            content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_jPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usersPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teachersPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        content_jPanelLayout.setVerticalGroup(
            content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content_jPanelLayout.createSequentialGroup()
                .addComponent(contentTitleLbl)
                .addGap(20, 20, 20)
                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(examsPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(booksPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentsPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(content_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usersPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teachersPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(content_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void examEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examEditBtnActionPerformed
        JFrame frame = new ExamsEditFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, examEditBtn);
    }//GEN-LAST:event_examEditBtnActionPerformed

    private void examAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examAddBtnActionPerformed
        ExamAddFrame frame = new ExamAddFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, examAddBtn);
    }//GEN-LAST:event_examAddBtnActionPerformed

    private void userAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAddBtnActionPerformed
        UserAddFrame s = new UserAddFrame();
        s.setVisible(true);
    }//GEN-LAST:event_userAddBtnActionPerformed

    private void usersEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersEditBtnActionPerformed
        JFrame frame = new UsersEditFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, usersEditBtn);
    }//GEN-LAST:event_usersEditBtnActionPerformed

    private void booksDisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksDisplayBtnActionPerformed
        BooksEditFrame bj = new BooksEditFrame();
        bj.setVisible(true);
        link_frame_to_button(bj, booksDisplayBtn);
    }//GEN-LAST:event_booksDisplayBtnActionPerformed

    private void bookAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAddBtnActionPerformed
        BookAddFrame bookJFrame = new BookAddFrame();
        bookJFrame.setVisible(true);
        link_frame_to_button(bookJFrame, bookAddBtn);
    }//GEN-LAST:event_bookAddBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        root.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(
                rootPane, "Are You Sure to Close Application?",
                "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void courseAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAddBtnActionPerformed
        CourseAddFrame frame = new CourseAddFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, courseAddBtn);
    }//GEN-LAST:event_courseAddBtnActionPerformed

    private void editCoursesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCoursesBtnActionPerformed
        CoursesEditFrame frame = new CoursesEditFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, editCoursesBtn);
    }//GEN-LAST:event_editCoursesBtnActionPerformed

    private void teachersEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersEditBtnActionPerformed
        TeachersEditFrame frame = new TeachersEditFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, teachersEditBtn);
    }//GEN-LAST:event_teachersEditBtnActionPerformed

    private void teacherAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAddBtnActionPerformed
        TeacherAddFrame frame = new TeacherAddFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, teacherAddBtn);
    }//GEN-LAST:event_teacherAddBtnActionPerformed

    private void studentAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAddBtnActionPerformed
        StudentAddFrame frame = new StudentAddFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, studentAddBtn);
    }//GEN-LAST:event_studentAddBtnActionPerformed

    private void studentsInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsInfoBtnActionPerformed
        StudentsEditFrame frame = new StudentsEditFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, studentsInfoBtn);
    }//GEN-LAST:event_studentsInfoBtnActionPerformed

    private void booksSoldoutDisplayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksSoldoutDisplayBtnActionPerformed
        BooksSoldOutDisplayFrame frame = new BooksSoldOutDisplayFrame();
        frame.setVisible(true);
        link_frame_to_button(frame, booksSoldoutDisplayBtn);
    }//GEN-LAST:event_booksSoldoutDisplayBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookAddBtn;
    private javax.swing.JLabel bookLbl;
    private javax.swing.JButton booksDisplayBtn;
    protected javax.swing.JPanel booksPnl;
    private javax.swing.JButton booksSoldoutDisplayBtn;
    protected javax.swing.JLabel contentTitleLbl;
    protected javax.swing.JPanel content_jPanel;
    private javax.swing.JButton courseAddBtn;
    protected javax.swing.JPanel coursesPnl;
    private javax.swing.JLabel coursesTitleLbl;
    private javax.swing.JButton editCoursesBtn;
    private javax.swing.JButton examAddBtn;
    private javax.swing.JButton examEditBtn;
    private javax.swing.JLabel examsLbl;
    protected javax.swing.JPanel examsPnl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton studentAddBtn;
    private javax.swing.JLabel studentTitleLbl;
    private javax.swing.JButton studentsInfoBtn;
    protected javax.swing.JPanel studentsPnl;
    private javax.swing.JButton teacherAddBtn;
    private javax.swing.JLabel teacherLbl;
    private javax.swing.JButton teachersEditBtn;
    protected javax.swing.JPanel teachersPnl;
    private javax.swing.JLabel titleLbl;
    protected javax.swing.JPanel titlePnl;
    private javax.swing.JButton userAddBtn;
    private javax.swing.JLabel userLbl;
    private javax.swing.JButton usersEditBtn;
    protected javax.swing.JPanel usersPnl;
    // End of variables declaration//GEN-END:variables
}
