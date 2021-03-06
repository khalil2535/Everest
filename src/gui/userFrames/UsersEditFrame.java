package gui.userFrames;

import gui.loginFrames.Login;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.naming.NoPermissionException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import users.User;
import static users.UserUtil.deleteUser;
import static users.UserUtil.getUser;
import static users.UserUtil.getUsersFromated;
import static users.UserUtil.setUserPrivilege;
import static utils.ExceptionUtil.printEx;
import static utils.Strings.EVEREST_TITLE;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.gui.GUI_Util.buildTableModel;

public final class UsersEditFrame extends javax.swing.JFrame {

    private User selectedUser;

    public UsersEditFrame() {
        initComponents();
        try {
            this.usersTbl.setModel(buildTableModel(getUsersFromated(Login.user)));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        } catch (NoPermissionException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usersSP = new javax.swing.JScrollPane();
        usersTbl = new javax.swing.JTable();
        dataPnl = new javax.swing.JPanel();
        userNameLbl = new javax.swing.JLabel();
        userPrivilegeTf = new javax.swing.JTextField();
        userIdTf = new javax.swing.JTextField();
        userIdLbl = new javax.swing.JLabel();
        userPrivilegeLbl = new javax.swing.JLabel();
        userNameTf = new javax.swing.JTextField();
        ButtonsPnl = new javax.swing.JPanel();
        setPasswordBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        setUserNameBtn = new javax.swing.JButton();
        setPrivilegeBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        usersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "username", "privilege"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usersTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        usersTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTblMouseClicked(evt);
            }
        });
        usersSP.setViewportView(usersTbl);

        dataPnl.setBackground(new java.awt.Color(255, 255, 255));
        dataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        userNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        userNameLbl.setText("Username :");

        userPrivilegeTf.setEditable(false);

        userIdTf.setEditable(false);

        userIdLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userIdLbl.setForeground(new java.awt.Color(0, 51, 153));
        userIdLbl.setText("User ID :");

        userPrivilegeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userPrivilegeLbl.setForeground(new java.awt.Color(0, 51, 153));
        userPrivilegeLbl.setText("privilege :");

        userNameTf.setEditable(false);

        javax.swing.GroupLayout dataPnlLayout = new javax.swing.GroupLayout(dataPnl);
        dataPnl.setLayout(dataPnlLayout);
        dataPnlLayout.setHorizontalGroup(
            dataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPnlLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(dataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userPrivilegeLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIdLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(dataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(userIdTf)
                    .addComponent(userPrivilegeTf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataPnlLayout.setVerticalGroup(
            dataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPnlLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(dataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(dataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLbl)
                    .addComponent(userNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(dataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPrivilegeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPrivilegeLbl))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        ButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        setPasswordBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPasswordBtn.setText("Set Password");
        setPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPasswordBtnActionPerformed(evt);
            }
        });

        deleteUserBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteUserBtn.setText("Delete User");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        setUserNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setUserNameBtn.setText("Set Username");
        setUserNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUserNameBtnActionPerformed(evt);
            }
        });

        setPrivilegeBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPrivilegeBtn.setText("Set Privilege");
        setPrivilegeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPrivilegeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(setUserNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPrivilegeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUserBtn)
                    .addComponent(setPasswordBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setUserNameBtn)
                    .addComponent(setPrivilegeBtn))
                .addContainerGap(42, Short.MAX_VALUE))
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
                    .addComponent(dataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(usersSP, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(usersSP, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTblMouseClicked
        int i = usersTbl.getSelectedRow();
        TableModel tableModel = usersTbl.getModel();
        try {
            selectedUser = getUser(Login.user, tableModel.getValueAt(i, 1).toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        } catch (NoPermissionException ex) {
            JOptionPane.showMessageDialog(rootPane, "Selected User Doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_usersTblMouseClicked

    private void setPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPasswordBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String pass = JOptionPane.showInputDialog(rootPane, "New Password :", DISPOSE_ON_CLOSE);

        if (pass == null) {
            return;
        }

        if (pass.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Can't set Password as an empty text");
            return;
        }
        try {
            selectedUser.setPassword(pass);
            JOptionPane.showMessageDialog(rootPane, "Password Changed Successfully");
            updateTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_setPasswordBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane.showConfirmDialog(
                rootPane,
                "Are you sure you want delete User " + selectedUser.getUsername() + " ?",
                "Delete User",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }

        try {
            deleteUser(Login.user, selectedUser);
            updateTable();
            JOptionPane.showMessageDialog(rootPane, "User Deleted Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        } catch (NoPermissionException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void setUserNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setUserNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }

        String username = (String) JOptionPane.showInputDialog(
                rootPane, "New Username :", "Set Username",
                JOptionPane.QUESTION_MESSAGE, null, null, selectedUser.getUsername());

        if (username == null) {
            return;
        }
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Username can't be an empty text");
            return;
        }
        try {
            selectedUser.setUsername(username);
            JOptionPane.showMessageDialog(rootPane, "Username Changed Successfully");
            updateTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        } catch (IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
            updateTable();
        }
    }//GEN-LAST:event_setUserNameBtnActionPerformed

    private void setPrivilegeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPrivilegeBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        int choice = JOptionPane.showOptionDialog(rootPane, "Select User new privilege ",
                "Set User Privilege", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Admin", "Normal User"}, "Admin");

        if (choice < 0) { // nothing selected
            return;
        }
        try {
            if (choice == 0) {
                setUserPrivilege(Login.user, selectedUser, "Admin");
            } else {
                setUserPrivilege(Login.user, selectedUser, "Normal User");
            }
            updateTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        } catch (NoPermissionException ex) {
            JOptionPane.showMessageDialog(this, ex);
            updateTable();
        }
    }//GEN-LAST:event_setPrivilegeBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JPanel dataPnl;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton setPasswordBtn;
    private javax.swing.JButton setPrivilegeBtn;
    private javax.swing.JButton setUserNameBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    private javax.swing.JLabel userIdLbl;
    private javax.swing.JTextField userIdTf;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTf;
    private javax.swing.JLabel userPrivilegeLbl;
    private javax.swing.JTextField userPrivilegeTf;
    private javax.swing.JScrollPane usersSP;
    private javax.swing.JTable usersTbl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.usersTbl.setModel(buildTableModel(getUsersFromated(Login.user)));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        } catch (NoPermissionException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        if (selectedUser == null) {
            userIdTf.setText("");
            userNameTf.setText("");
            userPrivilegeTf.setText("");
        } else {
            userIdTf.setText(Integer.toString(selectedUser.getUserId()));
            userNameTf.setText(selectedUser.getUsername());
            userPrivilegeTf.setText(selectedUser.getPrivilege());
        }
    }

    private boolean isBadSelection() throws HeadlessException {
        if (selectedUser == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose a User to make this opreation !");
            return true;
        }
        return false;
    }

}
