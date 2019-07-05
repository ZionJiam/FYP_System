
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

public class ProjectFile {

    public static Project[] extractProjectDataFromFile() {

        String filePath = "C:/Users/2014p/Desktop/P1829121_P1829332/projects.txt";
        String val;
        BufferedReader br;
        List<String> projectData = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((val = br.readLine()) != null) {
                projectData.add(val);
            }
            br.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Text file may not exist! Please check file path again", "ERROR",
                    JOptionPane.ERROR_MESSAGE); //Successful Message when printed
        }

        return createProjectObject(projectData);
    }

    public static Project[] createProjectObject(List<String> data) {

        Project[] project = new Project[Integer.parseInt(data.get(0))];
        List<List<String>> projectData = new ArrayList<>();

        // Split element of array to become 2D Array
        for (int i = 1; i < data.size(); i++) {
            projectData.add(Arrays.asList(data.get(i).split(",")));
        }
        //New
            for (int i = 0; i < projectData.size(); i++) {

                String title = projectData.get(i).get(0), school = projectData.get(i).get(1), supervisor = projectData.get(i).get(2);
                int numOfStud = Integer.parseInt(projectData.get(i).get(3)); //Get number of student in a project group
                Student[] students = new Student[numOfStud];
                int k = 0;
                // Create array of Student object
                for (int j = 0; j < students.length; j++) {
                    String adminNum = projectData.get(i).get(4 + k),
                            name = projectData.get(i).get(5 + k),
                            course = projectData.get(i).get(6 + k);
                    char gender = projectData.get(i).get(7 + k).charAt(0);

                    students[j] = new Student(adminNum, name, course, gender);
                    k += 4;
                }
                System.out.println(supervisor +  "<<");
                project[i] = new Project(students, title, school, supervisor);
            }
     
        
        for(Project ject: project){
             for(Student stud:  ject.getStudent()){
                 System.out.println(stud.getName() + " Supervisor: " + ject.getSupervisor());
             }
        }
        
        return project;
    }

    //Get String output to be used for printing to output.txt
    public static String getOutput(Project[] projectList, String project) {
        String output = "";
        boolean change = false; //Boolean to properly format names of student

        for (Project x : projectList) {
            if (x.title.equals(project) && change == false) {
                output = x.title + "\n" + x.school + "\n" + x.supervisor + "\n" + x.name;
                change = true;
            } else if (x.title.equals(project) && change == true) {
                output += " ==> " + x.name;
            }
        }

        return output;
    }

    public static void printDesiredOutput(String[] desiredOutput) {

        String filePath = "C:/Users/2014p/Desktop/P1829121_P1829332/output.txt";
        PrintWriter printWriter;

        try {
            printWriter = new PrintWriter(new FileWriter(filePath, true));

            for (String val : desiredOutput) {
                printWriter.println(val);
            }
            printWriter.println("---------------");
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
