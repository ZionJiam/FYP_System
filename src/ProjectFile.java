
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

    public static ProjectCollection extractProjectDataFromFile() {
        // Phliip: C:/Users/2014p/Documents/GitHub/FYP_System/projects.txt
        String filePath = "C:/Users/2014p/Documents/GitHub/FYP_System/projects.txt";
        String val;
        BufferedReader br;
        List<String> projectData = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((val = br.readLine()) != null) {
//                System.out.println(val);
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

    public static ProjectCollection createProjectObject(List<String> data) {
        ProjectCollection output = new ProjectCollection();
        Project[] project = new Project[Integer.parseInt(data.get(0))];
//        System.out.println(project.length);
        List<List<String>> projectData = new ArrayList<>();

        // Split element of array to become 2D Array
        for (int i = 1; i < project.length+1; i++) {
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
                project[i] = new Project(students, title, school, supervisor);
                output.addProject(project[i]);
            }
    
        return output;
    }

    //Get String output to be used for printing to output.txt
    public static String getOutput(ProjectCollection projectList, String project) {
        String output = "";
        boolean change = false; //Boolean to properly format names of student

        for (int i=0;i<projectList.getNumOfProjects();i++) {
            Project temp = (Project) projectList.getProject(i);
            if (temp.getTitle().equals(project) && change == false) {
                output = temp.getTitle() + "\n" + temp.getSchool() + "\n" + temp.getSupervisor() + "\n" + temp.getStudent()[0].getName();
                change = true;
            } else if (temp.getTitle().equals(project) && change == true) {
                for(int x =1; i<temp.getStudent().length;x++)
                output += " ==> " + temp.getStudent()[i].getName();
            }
        }

        return output;
    }

    public static void printDesiredOutput(String[] desiredOutput) {
        //Philip： C:/Users/2014p/Documents/GitHub/FYP_System/output.txt
        String filePath = "C:/Users/2014p/Documents/GitHub/FYP_System/output.txt";
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
