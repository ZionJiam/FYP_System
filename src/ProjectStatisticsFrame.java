
import java.util.*;

public class ProjectStatisticsFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProjectStatisticsFrame
     */
    public ProjectStatisticsFrame() {
        initComponents();
        statsOutput.setText(outputProjectStatistics());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        statsOutput = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statistics");

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N

        statsOutput.setBackground(new java.awt.Color(240, 240, 240));
        statsOutput.setColumns(20);
        statsOutput.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        statsOutput.setRows(5);
        statsOutput.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statsOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(null);
        statsOutput.setEditable(false);

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProjectFrame pf = new ProjectFrame();
        pf.setVisible(true);
        ProjectStatisticsFrame.this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static String outputProjectStatistics() {

        Project[] allStudents = ProjectFile.extractProjectDataFromFile();
        Set<String> schoolSet = new LinkedHashSet<>();
        List<String> schoolList = new ArrayList<>();
        String stats = "";

        for (int i = 0; i < allStudents.length; i++) {
            schoolList.add(allStudents[i].getSchool());
        }
        
        // Remove duplicate using Hashset
        schoolSet.addAll(schoolList);
        schoolList.clear();
        schoolList.addAll(schoolSet);

        int[] countStudent = new int[schoolList.size()];
        int[] countProject = new int[schoolList.size()];

        // Count number of student
        for (int k = 0; k < schoolList.size(); k++) {
            for (int i = 0; i < allStudents.length; i++) {
                if (allStudents[i].getSchool().equals(schoolList.get(k))) {
                    countStudent[k] += 1;
                } //if
            } //for
        } //for
        
        //Count number of project
        for (int k = 0; k < schoolList.size(); k++) {
            for (int i = 0; i < allStudents.length - 1; i++) {
                if (allStudents[i].getSchool().equals(schoolList.get(k))) {
                    String projName = allStudents[i].getTitle();
                    String nextproj = allStudents[i + 1].getTitle();
                    if (!(projName.equals(nextproj) && allStudents[i].getSchool().equals(allStudents[i + 1].getSchool()))) {
                        if (!(projName.equals(nextproj)) && i == allStudents.length - 2) {
                            countProject[schoolList.size() - 1] += 1;
                        } //if
                        countProject[k] += 1;
                    } //if
                } //if
            } //for
        } //for

        for (int k = 0; k < countProject.length; k++) {
            stats += schoolList.get(k) + ":\n" + "   No. of Project: " + countProject[k] + "\n   No. of Students: " + countStudent[k] + "\n\n";
        }

        return stats;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea statsOutput;
    // End of variables declaration//GEN-END:variables
}
