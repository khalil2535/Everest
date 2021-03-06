package gui.teacherFrames;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import teachers.Teacher;
import static teachers.TeacherUtil.getTeachersFormated;
import static utils.ExceptionUtil.printEx;
import static utils.Strings.EVEREST_TITLE;
import static utils.Strings.PHONE_FORMAT;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.link_frame_to_button;
import static utils.gui.GUI_Util.promoteFormatedTextField;

public class TeachersEditFrame extends javax.swing.JFrame {

    private Teacher selectedTeacher;

    public TeachersEditFrame() {
        initComponents();
        try {
            this.teachersTbl.setModel(buildTableModel(getTeachersFormated()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teachersSPnl = new javax.swing.JScrollPane();
        teachersTbl = new javax.swing.JTable();
        teacherDataPnl = new javax.swing.JPanel();
        teacherNameLbl = new javax.swing.JLabel();
        teacherIdTf = new javax.swing.JTextField();
        teacherIdLbl = new javax.swing.JLabel();
        teacherPhoneLbl = new javax.swing.JLabel();
        teacherNameTf = new javax.swing.JTextField();
        teacherPhoneFtf = new javax.swing.JFormattedTextField();
        ButtonsPnl = new javax.swing.JPanel();
        setNameBtn = new javax.swing.JButton();
        setPhoneBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        otherOperationsBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        teachersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        teachersTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        teachersTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersTblMouseClicked(evt);
            }
        });
        teachersSPnl.setViewportView(teachersTbl);

        teacherDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        teacherDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        teacherDataPnl.setPreferredSize(new java.awt.Dimension(315, 235));

        teacherNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherNameLbl.setText("Teacher name :");

        teacherIdTf.setEditable(false);

        teacherIdLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherIdLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherIdLbl.setText("Teacher ID   :");

        teacherPhoneLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherPhoneLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherPhoneLbl.setText("Teacher phone :");

        teacherNameTf.setEditable(false);

        teacherPhoneFtf.setEditable(false);
        try {
            teacherPhoneFtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout teacherDataPnlLayout = new javax.swing.GroupLayout(teacherDataPnl);
        teacherDataPnl.setLayout(teacherDataPnlLayout);
        teacherDataPnlLayout.setHorizontalGroup(
            teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherDataPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDataPnlLayout.createSequentialGroup()
                        .addComponent(teacherIdLbl)
                        .addGap(19, 19, 19)
                        .addComponent(teacherIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDataPnlLayout.createSequentialGroup()
                        .addComponent(teacherNameLbl)
                        .addGap(12, 12, 12)
                        .addComponent(teacherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDataPnlLayout.createSequentialGroup()
                        .addComponent(teacherPhoneLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teacherPhoneFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        teacherDataPnlLayout.setVerticalGroup(
            teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherDataPnlLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherPhoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherPhoneFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        ButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        ButtonsPnl.setAlignmentX(0.0F);
        ButtonsPnl.setAlignmentY(0.0F);
        ButtonsPnl.setPreferredSize(new java.awt.Dimension(315, 126));

        setNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setNameBtn.setText("Set Name");
        setNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNameBtnActionPerformed(evt);
            }
        });

        setPhoneBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPhoneBtn.setText("Set Phone");
        setPhoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPhoneBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteBtn.setText("Delete Teacher");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        otherOperationsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        otherOperationsBtn.setText("Other Operations");
        otherOperationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherOperationsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setPhoneBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherOperationsBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameBtn)
                    .addComponent(setPhoneBtn))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(otherOperationsBtn))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText(EVEREST_TITLE);

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addComponent(imgLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(teachersSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teacherDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(teachersSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teachersTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersTblMouseClicked
        int i = teachersTbl.getSelectedRow();
        TableModel tableModel = teachersTbl.getModel();
        try {
            selectedTeacher = new Teacher(Integer.parseInt(tableModel.getValueAt(i, 0).toString()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Selected Teacher doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_teachersTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String teacherName = (String) JOptionPane.showInputDialog(rootPane, "New Teacher Name:",
                "Set Teacher Name", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedTeacher.getName());

        if (teacherName == null) {
            return;
        } else if (teacherName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    rootPane, "Teacher name can't be nothing");
            return;
        }

        try {
            selectedTeacher.setName(teacherName);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        updateTable();
    }//GEN-LAST:event_setNameBtnActionPerformed

    private void setPhoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPhoneBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        link_frame_to_button(promoteFormatedTextField("Change Teacher Phone",
                "Teacher New Phone :", PHONE_FORMAT, "Set Teacher Phone", (phone) -> {
                    try {
                        if (phone.trim().length() < 12) {
                            JOptionPane.showMessageDialog(rootPane,
                                    "Please enter a valid phone number");
                            return false;
                        }
                        selectedTeacher.setPhone(phone);
                        updateTable();
                        JOptionPane.showMessageDialog(rootPane, "Phone number change successfully");
                        return true;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                }), setPhoneBtn);
    }//GEN-LAST:event_setPhoneBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane.showConfirmDialog(rootPane,
                "Are you sure you want delete Teacher " + teacherNameTf.getText() + " ?",
                "Teacher Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedTeacher.delete();
            selectedTeacher = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        updateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void otherOperationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherOperationsBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        JFrame frame = new TeacherOperationsFrame(selectedTeacher);
        link_frame_to_button(frame, otherOperationsBtn);
        frame.setVisible(true);
    }//GEN-LAST:event_otherOperationsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton otherOperationsBtn;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPhoneBtn;
    private javax.swing.JPanel teacherDataPnl;
    private javax.swing.JLabel teacherIdLbl;
    private javax.swing.JTextField teacherIdTf;
    private javax.swing.JLabel teacherNameLbl;
    private javax.swing.JTextField teacherNameTf;
    private javax.swing.JFormattedTextField teacherPhoneFtf;
    private javax.swing.JLabel teacherPhoneLbl;
    private javax.swing.JScrollPane teachersSPnl;
    private javax.swing.JTable teachersTbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.teachersTbl.setModel(buildTableModel(getTeachersFormated()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        if (selectedTeacher == null) {
            teacherIdTf.setText("");
            teacherNameTf.setText("");
            teacherPhoneFtf.setText("");
        } else {
            teacherIdTf.setText(String.valueOf(selectedTeacher.getId()));
            teacherNameTf.setText(selectedTeacher.getName());
            teacherPhoneFtf.setText(selectedTeacher.getPhone());
        }
    }

    private boolean isBadSelection() throws HeadlessException {
        if (selectedTeacher == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose a Teacher to make this opreation !");
            return true;
        }
        return false;
    }
}
