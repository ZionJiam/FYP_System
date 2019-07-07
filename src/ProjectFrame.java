
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2014p
 */
public class ProjectFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProjectFrame
     */
    public ProjectFrame() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentInfo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        statButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        supervisorLabel = new javax.swing.JLabel();
        schoolLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Students:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Supervisor:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("School:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("Title:");

        studentInfo.setBackground(new java.awt.Color(240, 240, 240));
        studentInfo.setColumns(20);
        studentInfo.setFont(new java.awt.Font("Calibri", 0, 23)); // NOI18N
        studentInfo.setRows(5);
        studentInfo.setBorder(null);
        jScrollPane1.setViewportView(studentInfo);
        jScrollPane1.setBorder(null);
        studentInfo.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Final Year Project System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel1.setText("Projects");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel2.setText("School");

        schoolComboBox.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        schoolComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolComboBoxActionPerformed(evt);
            }
        });

        printButton.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        printButton.setText("Save");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        projectComboBox.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        projectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectComboBoxActionPerformed(evt);
            }
        });

        statButton.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        statButton.setText("Statistics");
        statButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statButtonActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel9.setText("Search");

        addButton.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        addButton.setText("Edit Project");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(projectComboBox, 0, 154, Short.MAX_VALUE)
                            .addComponent(schoolComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(statButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(projectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(schoolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        titleLabel.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N

        supervisorLabel.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N

        schoolLabel.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(supervisorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(titleLabel)
                    .addComponent(schoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(supervisorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statButtonActionPerformed
        ProjectStatisticsFrame projStats = new ProjectStatisticsFrame();
        projStats.setVisible(true);
        ProjectFrame.this.setVisible(false);
    }//GEN-LAST:event_statButtonActionPerformed

    //For every selection of Projects in the combo box, change the details in the Information text box
    private void projectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectComboBoxActionPerformed
        //For every change to projectComboBox, change textbox information
        resetIcons();
        String info = "";
        try {
            info = setLabels(projectComboBox.getSelectedItem().toString());
        } catch (NullPointerException e) {
        }
        studentInfo.setText(info);
    }//GEN-LAST:event_projectComboBoxActionPerformed

    //Print button pressed, output file created in file directory as output.txt
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        String comboVal = "";
        ProjectCollection projectList = null;
        boolean hasSelected = false;
        //Validate for no selection of project from user
        if (projectComboBox.getSelectedItem() != null) {
            comboVal = projectComboBox.getSelectedItem().toString();
            projectList = ProjectFile.extractProjectDataFromFile();
            hasSelected = true;
        }

        if (hasSelected) {
            String output = ProjectFile.getOutput(projectList, comboVal);
            // Split each line for output to be executable
            String[] printOutput = output.split("\n"); //split method
            printOutput[0] = "Title:           " + printOutput[0];
            printOutput[1] = "School:          " + printOutput[1];
            printOutput[2] = "Supervisor:      " + printOutput[2];
            printOutput[3] = "Students:        " + printOutput[3];
            try {
                ProjectFile.printDesiredOutput(printOutput); //Print to output.txt, creates a file called output.txt if file not found
                JOptionPane.showMessageDialog(null, "Successfully printed", "Print", JOptionPane.INFORMATION_MESSAGE); //Successful Message when printed
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
            } // Error Message when not printed
        } else {
            JOptionPane.showMessageDialog(null,
                    "No project was selected, Please try again", "ERROR",
                    JOptionPane.ERROR_MESSAGE); //Successful Message when printed
        }
    }//GEN-LAST:event_printButtonActionPerformed

    //For every change in school selected, change the Projects Combo box for selection
    private void schoolComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolComboBoxActionPerformed
        resetIcons();
        String school = schoolComboBox.getSelectedItem().toString();
        List<Project> projectList;
        List<String> newList = new ArrayList<>();
        //Add projects into projectComboBox based on selected school
        projectList = userSearchResult(school);
        projectComboBox.removeAllItems();

        for (int i = 0; i < projectList.size(); i++) {
            if (!newList.contains(projectList.get(i).getTitle())) {
                newList.add(projectList.get(i).getTitle());
                projectComboBox.addItem(projectList.get(i).getTitle());
            }
        }

        //Make textbox and combobox empty for every change
        projectComboBox.setSelectedIndex(-1);
        resetLabels();
    }//GEN-LAST:event_schoolComboBoxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

//Set labels for display for each respective labels
    private String setLabels(String project) {
        resetIcons();
        String studInfo = "";
        ProjectCollection studentProject = ProjectFile.extractProjectDataFromFile();
        boolean change = false; //Boolean to properly format names of student
        //Set labels for project name, school and supervisor
       for(int x =0; x<studentProject.getNumOfProjects();x++) {
                Project temp = (Project) studentProject.getProject(x);
            if (temp.getTitle().equals(project) && change == false) {
                Student[] tempp = temp.getStudent();
                titleLabel.setText(temp.getTitle());
                schoolLabel.setText(temp.getSchool());
                supervisorLabel.setText(temp.getSupervisor());
                for(int i=0;i<tempp.length;i++){
                    if(change == false){
                //set textbox for students information
                studInfo += tempp[0].displayStudentInfo();
                change = true;
                    } else {
                studInfo += tempp[i].displayStudentInfo();
                    }
            }
            }
            for(int i =0; i<studentProject.getNumOfProjects();i++) {
                Project temp2 = (Project) studentProject.getProject(i);
                if (temp2.getTitle().equals(project)) {
                    for(int y=0;y<temp2.getStudent().length;y++){
                    try {
                        switch (y) {
                            case 0:
                                System.out.println("1st "+temp2.getStudent()[y].getadminNum());
                                img1.setIcon(getIcon(temp2.getStudent()[y].getadminNum()));
                                break;
                            case 1:
                                System.out.println("2nd "+temp2.getStudent()[y].getadminNum());
                                img2.setIcon(getIcon(temp2.getStudent()[y].getadminNum()));
                                break;
                            case 2:
                                System.out.println("3rd "+temp2.getStudent()[y].getadminNum());
                                img3.setIcon(getIcon(temp2.getStudent()[y].getadminNum()));
                                break;
                        }
                    }catch(Exception ex){}
                    }
                }
            }
        }
        //return student information to set textbox
        return studInfo;
    }

    private Icon getIcon(String substring) {
        //This is assuming you pass in the substring from input.
        File file = new File("C:/Users/2014p/Documents/GitHub/FYP_System/src/img/"); //Change this to the directory you want to search in.
        Icon img = null;
        if (file.exists() && file.isDirectory()) {
            String[] files = file.list(); //get the files in String format.
            for (String fileName : files) {
                if (fileName.contains(substring)) //Get image with the same admin id as student
                {
                    img = new ImageIcon("C:/Users/2014p/Documents/GitHub/FYP_System/src/img/" + fileName);
                }
            }
        }

        return img; //return the list of filenames containing substring.
    }

    private void resetIcons() {
        img1.setIcon(null);
        img2.setIcon(null);
        img3.setIcon(null);
    }

    public void resetLabels() {
        titleLabel.setText("");
        schoolLabel.setText("");
        supervisorLabel.setText("");
        img1.setIcon(null);
        img2.setIcon(null);
        img3.setIcon(null);
    }

    // Return List object of user chosen School
    public static List<Project> userSearchResult(String schName) {
        ProjectCollection studentProject = ProjectFile.extractProjectDataFromFile();
        List<Project> studentProjectResult = new ArrayList<>();
        
        //Return All "Any" || Some when user selects a school
        if (schName.equals("Any")) {
            for(int i =0; i<studentProject.getNumOfProjects();i++){
            Project temp = (Project) studentProject.getProject(i);
            studentProjectResult.add(temp);
            }
        } else {
            for(int i =0; i<studentProject.getNumOfProjects();i++) {
                Project temp = (Project) studentProject.getProject(i);
                if (temp.getSchool().equals(schName)) {
                    studentProjectResult.add(temp);
                }
            }
        }

        //Find projects based on the school
        return studentProjectResult;
    }

    //Method to populate the Projects ComboBox
    public static void populateProjects(ProjectCollection allStudents) {
        List<String> newList = new ArrayList<>();

        for (int i=0;i<allStudents.getNumOfProjects();i++) {
            Project temp = (Project) allStudents.getProject(i);
            if (!newList.contains(temp.getTitle())) {
                newList.add(temp.getTitle());
                projectComboBox.addItem(temp.getTitle());
            }
            //Make combo box empty
            projectComboBox.setSelectedIndex(-1);
        }
    }
//Method to populate the School ComboBox

    public static void populateSchools(ProjectCollection allStudents) {
        schoolComboBox.addItem("Any");
        List<String> newList = new ArrayList<>();

        for (int i=0;i<allStudents.getNumOfProjects();i++) {
            Project temp = (Project) allStudents.getProject(i);
            if (!newList.contains(temp.getSchool())) {
                newList.add(temp.getSchool());
                schoolComboBox.addItem(temp.getSchool());
            }
        }
    }

    //Main method calls for methods to populate the combo boxes at the start of the program
    public static void main(String[] args) {
        ProjectCollection allStudents = ProjectFile.extractProjectDataFromFile();
        populateProjects(allStudents);
        populateSchools(allStudents);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectFrame().setVisible(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton printButton;
    private static final javax.swing.JComboBox<String> projectComboBox = new javax.swing.JComboBox<>();
    private static final javax.swing.JComboBox<String> schoolComboBox = new javax.swing.JComboBox<>();
    private javax.swing.JLabel schoolLabel;
    private javax.swing.JButton statButton;
    private javax.swing.JTextArea studentInfo;
    private javax.swing.JLabel supervisorLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
