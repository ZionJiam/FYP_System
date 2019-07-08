/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2014p
 */
public class editProjectForm extends javax.swing.JFrame {

    /**
     * Creates new form editProjectForm
     */
    public editProjectForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList<>();
        titleLabel = new javax.swing.JLabel();
        supervisorLabel = new javax.swing.JLabel();
        schoolLabel = new javax.swing.JLabel();
        titleBox = new javax.swing.JTextField();
        schoolBox = new javax.swing.JTextField();
        supervisorBox = new javax.swing.JTextField();
        nameBox = new javax.swing.JTextField();
        adminBox = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        courseBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        femaleButton = new javax.swing.JRadioButton();
        maleButton = new javax.swing.JRadioButton();
        canvas1 = new java.awt.Canvas();
        updateStudentButton = new javax.swing.JButton();
        updateProjectButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addNameBox = new javax.swing.JTextField();
        addAdminIdBox = new javax.swing.JTextField();
        addFemaleButton = new javax.swing.JRadioButton();
        addNameLabel = new javax.swing.JLabel();
        addMaleButton = new javax.swing.JRadioButton();
        addGenderLabel = new javax.swing.JLabel();
        addAdminIdLabel = new javax.swing.JLabel();
        addCourseLabel = new javax.swing.JLabel();
        addCourseBox = new javax.swing.JTextField();
        addStudentButton = new javax.swing.JButton();
        addNewStudentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Projects");

        projectList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(projectList);

        studentList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(studentList);

        titleLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        titleLabel.setText("Title");

        supervisorLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        supervisorLabel.setText("Supervisor");

        schoolLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        schoolLabel.setText("School");

        titleBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        schoolBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        schoolBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolBoxActionPerformed(evt);
            }
        });

        supervisorBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        nameBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        adminBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adminBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBoxActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nameLabel.setText("Name");

        genderLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        genderLabel.setText("Gender");

        adminLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        adminLabel.setText("Admin ID");

        courseLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        courseLabel.setText("Course");

        courseBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Remove Student");

        femaleButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        femaleButton.setText("F");

        maleButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        maleButton.setText("M");

        updateStudentButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        updateStudentButton.setText("Update Student");

        updateProjectButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        updateProjectButton.setText("Update Project");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Students");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addNameBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        addAdminIdBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addAdminIdBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminIdBoxActionPerformed(evt);
            }
        });

        addFemaleButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addFemaleButton.setText("F");

        addNameLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addNameLabel.setText("Name");

        addMaleButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addMaleButton.setText("M");

        addGenderLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addGenderLabel.setText("Gender");

        addAdminIdLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addAdminIdLabel.setText("Admin ID");

        addCourseLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addCourseLabel.setText("Course");

        addCourseBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        addStudentButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addStudentButton.setText("Add Student");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(addNameLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addAdminIdLabel)
                            .addComponent(addCourseLabel)
                            .addComponent(addGenderLabel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(addMaleButton)
                                .addGap(28, 28, 28)
                                .addComponent(addFemaleButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addAdminIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addCourseBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addStudentButton)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNameLabel)
                    .addComponent(addNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAdminIdLabel)
                    .addComponent(addAdminIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCourseBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCourseLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGenderLabel)
                    .addComponent(addMaleButton)
                    .addComponent(addFemaleButton))
                .addGap(18, 18, 18)
                .addComponent(addStudentButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        addNewStudentLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addNewStudentLabel.setText("Add new Student");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(titleLabel))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(supervisorLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(supervisorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(schoolLabel)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(titleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(schoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(updateProjectButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(nameLabel))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(adminLabel)
                                                .addComponent(courseLabel)
                                                .addComponent(genderLabel))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(41, 41, 41)
                                                    .addComponent(maleButton)
                                                    .addGap(28, 28, 28)
                                                    .addComponent(femaleButton))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(updateStudentButton)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(adminBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(courseBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1)
                                .addGap(223, 223, 223)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addNewStudentLabel)
                                .addGap(106, 106, 106)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(addNewStudentLabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleLabel)
                            .addComponent(nameLabel)
                            .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schoolLabel)
                            .addComponent(schoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminLabel)
                            .addComponent(adminBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supervisorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supervisorLabel)
                    .addComponent(courseLabel)
                    .addComponent(courseBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleButton)
                    .addComponent(femaleButton)
                    .addComponent(updateProjectButton))
                .addGap(11, 11, 11)
                .addComponent(updateStudentButton)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void schoolBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolBoxActionPerformed

    private void adminBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminBoxActionPerformed

    private void addAdminIdBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminIdBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addAdminIdBoxActionPerformed

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
            java.util.logging.Logger.getLogger(editProjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editProjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editProjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editProjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editProjectForm().setVisible(true);
            }
        });
    }
    
    public void setupForm(){
        ProjectCollection studentProject = ProjectFile.extractProjectDataFromFile();
        for(int i = 0 ; i < studentProject.getNumOfProjects();i++){
            Project temp = (Project) studentProject.getProject(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addAdminIdBox;
    private javax.swing.JLabel addAdminIdLabel;
    private javax.swing.JTextField addCourseBox;
    private javax.swing.JLabel addCourseLabel;
    private javax.swing.JRadioButton addFemaleButton;
    private javax.swing.JLabel addGenderLabel;
    private javax.swing.JRadioButton addMaleButton;
    private javax.swing.JTextField addNameBox;
    private javax.swing.JLabel addNameLabel;
    private javax.swing.JLabel addNewStudentLabel;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JTextField adminBox;
    private javax.swing.JLabel adminLabel;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField courseBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JTextField nameBox;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JList<String> projectList;
    private javax.swing.JTextField schoolBox;
    private javax.swing.JLabel schoolLabel;
    private javax.swing.JList<String> studentList;
    private javax.swing.JTextField supervisorBox;
    private javax.swing.JLabel supervisorLabel;
    private javax.swing.JTextField titleBox;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateProjectButton;
    private javax.swing.JButton updateStudentButton;
    // End of variables declaration//GEN-END:variables
}
