/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import models.TaskManagementModel;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author eboka
 */
public class UserDashboard extends javax.swing.JPanel {

    /**
     * Creates new form UserDashboardTest
     */
    public UserDashboard() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UserDashboad_View_Jpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserDashboad_Create_Jpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createTask = new javax.swing.JButton();
        UserDashboad_Edit_Jpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UserDashboad_Delete_Jpanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("User Dashboard");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 180, 20));

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 0, 22, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Task Management");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jTextField1.setBackground(new java.awt.Color(45, 118, 232));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 334, 25));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 348, -1));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 100));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("System");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 113, 50, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 240));

        jPanel3.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("Download");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/download_52px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 140, 120));

        UserDashboad_View_Jpanel.setBackground(java.awt.SystemColor.controlHighlight);
        UserDashboad_View_Jpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserDashboad_View_JpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserDashboad_View_JpanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserDashboad_View_JpanelMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 118, 232));
        jLabel3.setText("View");

        javax.swing.GroupLayout UserDashboad_View_JpanelLayout = new javax.swing.GroupLayout(UserDashboad_View_Jpanel);
        UserDashboad_View_Jpanel.setLayout(UserDashboad_View_JpanelLayout);
        UserDashboad_View_JpanelLayout.setHorizontalGroup(
            UserDashboad_View_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDashboad_View_JpanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(UserDashboad_View_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        UserDashboad_View_JpanelLayout.setVerticalGroup(
            UserDashboad_View_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDashboad_View_JpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(UserDashboad_View_Jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 120));

        UserDashboad_Create_Jpanel.setBackground(java.awt.SystemColor.controlHighlight);
        UserDashboad_Create_Jpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserDashboad_Create_JpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserDashboad_Create_JpanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserDashboad_Create_JpanelMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 118, 232));
        jLabel5.setText("Create");

        createTask.setText("User Accessible");
        createTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserDashboad_Create_JpanelLayout = new javax.swing.GroupLayout(UserDashboad_Create_Jpanel);
        UserDashboad_Create_Jpanel.setLayout(UserDashboad_Create_JpanelLayout);
        UserDashboad_Create_JpanelLayout.setHorizontalGroup(
            UserDashboad_Create_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDashboad_Create_JpanelLayout.createSequentialGroup()
                .addGroup(UserDashboad_Create_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserDashboad_Create_JpanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(UserDashboad_Create_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(UserDashboad_Create_JpanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(createTask)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        UserDashboad_Create_JpanelLayout.setVerticalGroup(
            UserDashboad_Create_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDashboad_Create_JpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createTask)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(UserDashboad_Create_Jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 140, 120));

        UserDashboad_Edit_Jpanel.setBackground(java.awt.SystemColor.controlHighlight);
        UserDashboad_Edit_Jpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserDashboad_Edit_JpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserDashboad_Edit_JpanelMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(45, 118, 232));
        jLabel7.setText("Edit");

        javax.swing.GroupLayout UserDashboad_Edit_JpanelLayout = new javax.swing.GroupLayout(UserDashboad_Edit_Jpanel);
        UserDashboad_Edit_Jpanel.setLayout(UserDashboad_Edit_JpanelLayout);
        UserDashboad_Edit_JpanelLayout.setHorizontalGroup(
            UserDashboad_Edit_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDashboad_Edit_JpanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(UserDashboad_Edit_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        UserDashboad_Edit_JpanelLayout.setVerticalGroup(
            UserDashboad_Edit_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDashboad_Edit_JpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(UserDashboad_Edit_Jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 140, 120));

        UserDashboad_Delete_Jpanel.setBackground(java.awt.SystemColor.controlHighlight);
        UserDashboad_Delete_Jpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserDashboad_Delete_JpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserDashboad_Delete_JpanelMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 118, 232));
        jLabel9.setText("Delete");

        javax.swing.GroupLayout UserDashboad_Delete_JpanelLayout = new javax.swing.GroupLayout(UserDashboad_Delete_Jpanel);
        UserDashboad_Delete_Jpanel.setLayout(UserDashboad_Delete_JpanelLayout);
        UserDashboad_Delete_JpanelLayout.setHorizontalGroup(
            UserDashboad_Delete_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDashboad_Delete_JpanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(UserDashboad_Delete_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        UserDashboad_Delete_JpanelLayout.setVerticalGroup(
            UserDashboad_Delete_JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserDashboad_Delete_JpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel1.add(UserDashboad_Delete_Jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 140, 120));

        jPanel8.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 118, 232));
        jLabel11.setText("N/A");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 140, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        int xx = 0;
        int xy = 0;
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        int xx = evt.getX();
        int xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        setColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        resetColor(jPanel3);
    }//GEN-LAST:event_jPanel3MouseExited

    private void UserDashboad_View_JpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_View_JpanelMouseEntered
        // TODO add your handling code here:
        setColor(UserDashboad_View_Jpanel);
    }//GEN-LAST:event_UserDashboad_View_JpanelMouseEntered

    private void UserDashboad_View_JpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_View_JpanelMouseExited
        // TODO add your handling code here:
        resetColor(UserDashboad_View_Jpanel);
    }//GEN-LAST:event_UserDashboad_View_JpanelMouseExited

    private void UserDashboad_View_JpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_View_JpanelMousePressed
        // TODO add your handling code here:
        new View_Data().show();
    }//GEN-LAST:event_UserDashboad_View_JpanelMousePressed

    private void UserDashboad_Create_JpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_Create_JpanelMouseEntered
        // TODO add your handling code here:
        setColor(UserDashboad_Create_Jpanel);
    }//GEN-LAST:event_UserDashboad_Create_JpanelMouseEntered

    private void UserDashboad_Create_JpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_Create_JpanelMouseExited
        // TODO add your handling code here:
        resetColor(UserDashboad_Create_Jpanel);
    }//GEN-LAST:event_UserDashboad_Create_JpanelMouseExited

    private void UserDashboad_Create_JpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_Create_JpanelMousePressed
        // TODO add your handling code here:
        //just a sample.
        new CreateNewTaskView().show();
    }//GEN-LAST:event_UserDashboad_Create_JpanelMousePressed

    private void UserDashboad_Edit_JpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_Edit_JpanelMouseEntered
        // TODO add your handling code here
        setColor(UserDashboad_Edit_Jpanel);
    }//GEN-LAST:event_UserDashboad_Edit_JpanelMouseEntered

    private void UserDashboad_Edit_JpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_Edit_JpanelMouseExited
        // TODO add your handling code here:
        resetColor(UserDashboad_Edit_Jpanel);
    }//GEN-LAST:event_UserDashboad_Edit_JpanelMouseExited

    private void UserDashboad_Delete_JpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_Delete_JpanelMouseEntered
        // TODO add your handling code here:
        setColor(UserDashboad_Delete_Jpanel);
    }//GEN-LAST:event_UserDashboad_Delete_JpanelMouseEntered

    private void UserDashboad_Delete_JpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDashboad_Delete_JpanelMouseExited
        // TODO add your handling code here:
        resetColor(UserDashboad_Delete_Jpanel);

    }//GEN-LAST:event_UserDashboad_Delete_JpanelMouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
        setColor(jPanel8);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        // TODO add your handling code here:
        resetColor(jPanel8);
    }//GEN-LAST:event_jPanel8MouseExited

    private void createTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTaskActionPerformed
        // TODO add your handling code here:
                 JFrame createTaskFrame = new JFrame("Create New Task");
// Assistance gottent from ChatGPT
   
    createTaskFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    createTaskFrame.setSize(600, 400); 
    createTaskFrame.setLayout(new BorderLayout());


    JPanel createTaskPanel = new CreateNewTaskView();
 
    createTaskPanel.add(new JLabel("Task Name:"));
    createTaskPanel.add(new JTextField(15));
    createTaskFrame.add(createTaskPanel, BorderLayout.CENTER);

    // Make the JFrame visible
    createTaskFrame.setVisible(true);

    // Optionally, center the frame on the screen
    createTaskFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_createTaskActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserDashboad_Create_Jpanel;
    private javax.swing.JPanel UserDashboad_Delete_Jpanel;
    private javax.swing.JPanel UserDashboad_Edit_Jpanel;
    private javax.swing.JPanel UserDashboad_View_Jpanel;
    private javax.swing.JButton createTask;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel jPanel3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void resetColor(JPanel jPanel3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
