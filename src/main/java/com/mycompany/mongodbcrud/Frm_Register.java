package com.mycompany.mongodbcrud;


import com.mycompany.mongodbcrud.Frm_Login;
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author One and Only
 */
public class Frm_Register extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Register
     */
    public Frm_Register() {
        
        this.getContentPane().setBackground(new Color(203, 247, 247));
        initComponents();
        txtPass.setEchoChar((char)0);
        txtPass2.setEchoChar((char)0);
        chkShow.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbSpecial = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbjava = new javax.swing.JRadioButton();
        rbPython = new javax.swing.JRadioButton();
        cmbGender = new javax.swing.JComboBox<>();
        chk3 = new javax.swing.JCheckBox();
        chk1 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        txtPass2 = new javax.swing.JPasswordField();
        txtAddress = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        LoginClick = new javax.swing.JLabel();
        chkShow = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setName("Register Form"); // NOI18N

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("Confirm Password");

        jLabel4.setText("Last name:");

        jLabel5.setText("First name:");

        jLabel6.setText("Address:");

        jLabel7.setText("Gender:");

        jLabel8.setText("Skills:");

        jLabel9.setText("Specialization:");

        rbSpecial.add(rbjava);
        rbjava.setText("Java");

        rbSpecial.add(rbPython);
        rbPython.setText("Python");

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        cmbGender.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        chk3.setText("Team Lead");

        chk1.setText("Programming");

        chk4.setText("UI/UX Design");

        chk2.setText("Visual Graphics");

        txtPass2.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        txtPass2.setForeground(new java.awt.Color(204, 204, 204));
        txtPass2.setText("confirm password");
        txtPass2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPass2FocusLost(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(204, 204, 204));
        txtAddress.setText("address");
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(204, 204, 204));
        txtUsername.setText("username");
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });

        txtFirstname.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        txtFirstname.setForeground(new java.awt.Color(204, 204, 204));
        txtFirstname.setText("firstname");
        txtFirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstnameFocusLost(evt);
            }
        });

        txtLastname.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        txtLastname.setForeground(new java.awt.Color(204, 204, 204));
        txtLastname.setText("lastname");
        txtLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastnameFocusLost(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("password");
        txtPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("REGISTRATION FORM");

        btnSubmit.setBackground(new java.awt.Color(0, 153, 255));
        btnSubmit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");

        jLabel11.setText("Have an account already?");

        LoginClick.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LoginClick.setText("<html><u><font color='blue'>Log in</font></u></html>");
        LoginClick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginClickMouseClicked(evt);
            }
        });

        chkShow.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        chkShow.setForeground(new java.awt.Color(102, 102, 102));
        chkShow.setText("show");
        chkShow.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkShowItemStateChanged(evt);
            }
        });
        chkShow.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkShowStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("*");

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*");

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*");

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoginClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbjava)
                                .addGap(32, 32, 32)
                                .addComponent(rbPython))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chk1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chk2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chk3)
                                        .addGap(18, 18, 18)
                                        .addComponent(chk4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtUsername)
                                                .addComponent(txtPass)
                                                .addComponent(txtPass2)
                                                .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkShow)))))))
                .addGap(26, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkShow)
                    .addComponent(jLabel13))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chk1)
                    .addComponent(chk2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk3)
                    .addComponent(chk4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbjava)
                    .addComponent(rbPython))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(LoginClick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        txtUsername.setForeground(Color.black);
        txtUsername.selectAll();
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
        String user = txtUsername.getText().trim();
        if(user.isEmpty()){
            txtUsername.setForeground(Color.LIGHT_GRAY);
            txtUsername.setText("username");
        }
        
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        // TODO add your handling code here:
        txtPass.setForeground(Color.black);
        txtPass.selectAll();
        if(!chkShow.isSelected()){
            txtPass.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        // TODO add your handling code here:
        char [] pass = txtPass.getPassword();
        if(pass.length == 0){
            txtPass.setForeground(Color.LIGHT_GRAY);
            txtPass.setText("password");
            txtPass.setEchoChar((char)0);
        }
        
        
    }//GEN-LAST:event_txtPassFocusLost

    private void chkShowStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkShowStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chkShowStateChanged

    private void chkShowItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkShowItemStateChanged
        // TODO add your handling code here:
        if(chkShow.isSelected()){
            txtPass.setEchoChar((char)0);
            txtPass2.setEchoChar((char)0);
        }else{
            txtPass.setEchoChar('\u2022');
            txtPass2.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_chkShowItemStateChanged

    private void txtPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusGained
        // TODO add your handling code here:
        txtPass2.setForeground(Color.black);
        txtPass2.selectAll();
        if(!chkShow.isSelected()){
            txtPass2.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_txtPass2FocusGained

    private void txtPass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusLost
        // TODO add your handling code here:
        char [] pass = txtPass2.getPassword();
        if(pass.length == 0){
            txtPass2.setForeground(Color.LIGHT_GRAY);
            txtPass2.setText("confirm password");
            txtPass2.setEchoChar((char)0);
        }
    }//GEN-LAST:event_txtPass2FocusLost

    private void txtFirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusGained
        // TODO add your handling code here:
        txtFirstname.setForeground(Color.black);
        txtFirstname.selectAll();
    }//GEN-LAST:event_txtFirstnameFocusGained

    private void txtFirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstnameFocusLost
        // TODO add your handling code here:
        String first = txtFirstname.getText().trim();
        if(first.isEmpty()){
            txtFirstname.setForeground(Color.LIGHT_GRAY);
            txtFirstname.setText("firstname");
        }
    }//GEN-LAST:event_txtFirstnameFocusLost

    private void txtLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusGained
        // TODO add your handling code here:
        txtLastname.setForeground(Color.black);
        txtLastname.selectAll();
    }//GEN-LAST:event_txtLastnameFocusGained

    private void txtLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastnameFocusLost
        // TODO add your handling code here:
        String last = txtLastname.getText().trim();
        if(last.isEmpty()){
            txtLastname.setForeground(Color.LIGHT_GRAY);
            txtLastname.setText("lastname");
        }
    }//GEN-LAST:event_txtLastnameFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        // TODO add your handling code here:
        txtAddress.setForeground(Color.black);
        txtAddress.selectAll();
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        // TODO add your handling code here:
        String address = txtAddress.getText().trim();
        if(address.isEmpty()){
            txtAddress.setForeground(Color.LIGHT_GRAY);
            txtAddress.setText("address");
        }
    }//GEN-LAST:event_txtAddressFocusLost

    private void LoginClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginClickMouseClicked
        // TODO add your handling code here:
        Frm_Login x = new Frm_Login();
        x.show();
        this.hide();
    }//GEN-LAST:event_LoginClickMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginClick;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chkShow;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbPython;
    private javax.swing.ButtonGroup rbSpecial;
    private javax.swing.JRadioButton rbjava;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}