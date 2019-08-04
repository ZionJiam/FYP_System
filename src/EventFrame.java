
import javax.swing.*;

public class EventFrame extends javax.swing.JFrame {

    private EventCollection evtCollection = new EventCollection();

    public EventFrame() {
        evtCollection.readFromFile();
        initComponents();
        setupForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        eventList = new javax.swing.JList<>();
        selectedProject = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        evtDetailBox = new javax.swing.JTextArea();
        saveEvent1 = new javax.swing.JButton();
        eventPanel = new javax.swing.JPanel();
        addNewStudentLabel1 = new javax.swing.JLabel();
        eventTitleBox = new javax.swing.JTextField();
        registerEvent = new javax.swing.JButton();
        projectPanel = new javax.swing.JPanel();
        addNewStudentLabel2 = new javax.swing.JLabel();
        addProjectBox = new javax.swing.JTextField();
        addProject = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Projects");

        projectList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        projectList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                projectListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(projectList);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Event Details");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Events");

        eventList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eventList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                eventListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(eventList);

        selectedProject.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        backButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        evtDetailBox.setColumns(20);
        evtDetailBox.setRows(5);
        jScrollPane4.setViewportView(evtDetailBox);

        saveEvent1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        saveEvent1.setText("Save");
        saveEvent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEvent1ActionPerformed(evt);
            }
        });

        eventPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Event", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        addNewStudentLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addNewStudentLabel1.setText("New Event Title:");

        eventTitleBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        registerEvent.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerEvent.setText("Register Event");
        registerEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eventPanelLayout = new javax.swing.GroupLayout(eventPanel);
        eventPanel.setLayout(eventPanelLayout);
        eventPanelLayout.setHorizontalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewStudentLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eventTitleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(eventPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(registerEvent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eventPanelLayout.setVerticalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(addNewStudentLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventTitleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerEvent)
                .addGap(12, 12, 12))
        );

        projectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Project to Event", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24))); // NOI18N

        addNewStudentLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        addNewStudentLabel2.setText("Add Project:");

        addProjectBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        addProject.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addProject.setText("Add Project");
        addProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout projectPanelLayout = new javax.swing.GroupLayout(projectPanel);
        projectPanel.setLayout(projectPanelLayout);
        projectPanelLayout.setHorizontalGroup(
            projectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectPanelLayout.createSequentialGroup()
                .addGroup(projectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(projectPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(projectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addNewStudentLabel2)
                            .addComponent(addProjectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(projectPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(addProject)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        projectPanelLayout.setVerticalGroup(
            projectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addNewStudentLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addProjectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addProject)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(eventPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(projectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(selectedProject)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(saveEvent1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(selectedProject))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(eventPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(projectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveEvent1)
                            .addComponent(backButton))))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void addProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjectActionPerformed

        boolean emptyProject = addProjectBox.getText().isEmpty(), emptyEvent = eventList.getSelectedValue().isEmpty();
        // Validate form field
        if (!(emptyProject || emptyEvent)) {
            String event = eventList.getSelectedValue();
            String projectName = addProjectBox.getText();
            Project newProject = null;
            ProjectCollection studentProject = ProjectFile.extractProjectDataFromFile();
            // extract project object with respect to project to be added
            for (int i = 0; i < studentProject.getNumOfProjects(); i++) {
                Project proj = (Project) studentProject.getProject(i);
                if (projectName.equals(proj.getTitle())) {
                    newProject = proj;
                }
            }
            // extract event object to add the extracted project to event
            for (int i = 0; i < evtCollection.getNumOfEvents(); i++) {
                if (event.equals(evtCollection.getEvent(i).getEventTitle())) {
                    if (!IsDuplicate(evtCollection.getEvent(i), newProject)) {
                        evtCollection.getEvent(i).addProject(newProject);
                    }
                }
            }
            // Reset
            evtDetailBox.setText("");
            eventTitleBox.setText("");
            // Populate eventDetails 
            for (int i = 0; i < evtCollection.getNumOfEvents(); i++) {
                if (evtCollection.getEvent(i).getEventTitle().equals(event)) {
                    Event temp = evtCollection.getEvent(i);
                    setupEventDetails(temp, 1);
                }
            }
        }
        //reset
        addProjectBox.setText("");
    }//GEN-LAST:event_addProjectActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        EventFrame.this.setVisible(false);
        new ProjectFrame().setVisible(true);
        ProjectFrame.populateComboBoxes();
        ProjectFrame.resetTextFields();
    }//GEN-LAST:event_backButtonActionPerformed

    private void projectListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_projectListValueChanged
        String project = projectList.getSelectedValue();
        addProjectBox.setText(project);
    }//GEN-LAST:event_projectListValueChanged

    private void eventListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_eventListValueChanged
        String event = eventList.getSelectedValue();
        evtDetailBox.setText("");
        if (eventList.getSelectedIndex() != 0) {
            for (int i = 0; i < evtCollection.getNumOfEvents(); i++) {
                if (evtCollection.getEvent(i).getEventTitle().equals(event)) {
                    Event temp = evtCollection.getEvent(i);
                    setupEventDetails(temp, 1);
                }
            }
        } else {
            for (int i = 0; i < evtCollection.getNumOfEvents(); i++) {
                Event temp = evtCollection.getEvent(i);
                setupEventDetails(temp, i + 1);
            }
        }
    }//GEN-LAST:event_eventListValueChanged

    private void registerEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerEventActionPerformed
        String evtTitle = eventTitleBox.getText();
        Project[] proj = new Project[0];
        if (!(evtTitle.equals(""))) {
            Event event = new Event(proj, evtTitle);
            evtCollection.addEvent(event);
            //Reset
            evtDetailBox.setText("");
            eventTitleBox.setText("");
            // Populate event details
            DefaultListModel evtDemoList = new DefaultListModel();
            evtDemoList.addElement("All Events");
            for (int i = 0; i < evtCollection.getNumOfEvents(); i++) {
                Event temp = evtCollection.getEvent(i);
                setupEventDetails(temp, i + 1);
                evtDemoList.addElement(temp.getEventTitle());
            }
            eventList.setModel(evtDemoList);
            eventList.setSelectedIndex(0);
        }
    }//GEN-LAST:event_registerEventActionPerformed

    private void saveEvent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEvent1ActionPerformed
        // Save  === write to file
        evtCollection.writeToFile();
    }//GEN-LAST:event_saveEvent1ActionPerformed
    // Check duplicate project in event
    private boolean IsDuplicate(Event evt, Project proj) {
        for (int i = 0; i < evt.getProjects().length; i++) {
            if (evt.getProjects()[i].getTitle().equals(proj.getTitle())) {
                return true;
            }
        }
        return false;
    }

    public void setupForm() {
        // Project
        ProjectCollection studentProject = ProjectFile.extractProjectDataFromFile();
        DefaultListModel demoList = new DefaultListModel();
        for (int i = 0; i < studentProject.getNumOfProjects(); i++) {
            Project temp = (Project) studentProject.getProject(i);
            demoList.addElement(temp.getTitle());
        }
        projectList.setModel(demoList);

        DefaultListModel evtDemoList = new DefaultListModel();
        evtDemoList.addElement("All Events");
        // Popuate eventDetail Box
        for (int i = 0; i < evtCollection.getNumOfEvents(); i++) {
            Event temp = evtCollection.getEvent(i);
            setupEventDetails(temp, i + 1);
            evtDemoList.addElement(temp.getEventTitle());
        }
        eventList.setModel(evtDemoList);
        eventList.setSelectedIndex(0);

    }

    // populate Event detail method
    private static void setupEventDetails(Event evt, int num) {
        String evtDetails = "Event " + num + ":           " + evt.getEventTitle() + "\n";
        String projDetails = "";

        if (evt.getProjects() != null) {
            for (int i = 0; i < evt.getProjects().length; i++) {
                String projTitle = evt.getProjects()[i].getTitle();
                String projSchool = evt.getProjects()[i].getSchool();
                String projSupervisor = evt.getProjects()[i].getSupervisor();
                projDetails += "  " + (i + 1) + ":  " + projTitle + "      " + projSchool + "       " + projSupervisor + "\n";
            }
        }
        evtDetailBox.setText(evtDetailBox.getText() + (evtDetails + projDetails + "\n"));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addNewStudentLabel1;
    private javax.swing.JLabel addNewStudentLabel2;
    private javax.swing.JButton addProject;
    private javax.swing.JTextField addProjectBox;
    private javax.swing.JButton backButton;
    private static javax.swing.JList<String> eventList;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JTextField eventTitleBox;
    private static javax.swing.JTextArea evtDetailBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.PopupMenu popupMenu1;
    private static javax.swing.JList<String> projectList;
    private javax.swing.JPanel projectPanel;
    private javax.swing.JButton registerEvent;
    private javax.swing.JButton saveEvent1;
    private javax.swing.JLabel selectedProject;
    // End of variables declaration//GEN-END:variables
}
