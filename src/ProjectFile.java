
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
        // ***Change desired file path 
        //String filePath = "C:/Modules files/Year 2/Data Structure And Algorithm/projects.txt";
        String filePath = "C:/Users/2014p/Desktop/P1829121_P1829332/projects.txt";
        String val;
        BufferedReader br;
        List<String> projectData = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(filePath));
            val = br.readLine();
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
        //Declare
        int sumOfStudent = 0, numOfStud;
        List<List<String>> projectData = new ArrayList<>();

        // Split element of array to become 2D Array
        for (int i = 0; i < data.size(); i++) {
            projectData.add(Arrays.asList(data.get(i).split(",")));
        }

        // Get sum of all student working on the project 
        // to determine number of studentProject object needed
        for (int i = 0; i < projectData.size(); i++) {
            sumOfStudent += Integer.parseInt(projectData.get(i).get(3));
        }

        //Create Project Array Object
        Project[] studentProject = new Project[sumOfStudent];

        // for loop to reference object >> int sum
        for (int i = 0; i < sumOfStudent; i++) {
            // for loop to extract data Project
            for (int x = 0; x < projectData.size(); x++) {
                int k = 0; //Reset K value
                numOfStud = Integer.parseInt(projectData.get(x).get(3)); //Get number of student in a project group
                // Loop the number of student in each project 
                while (numOfStud > 0) {
                    String title = projectData.get(x).get(0), school = projectData.get(x).get(1), supervisor = projectData.get(x).get(2), adminNum = projectData.get(x).get(4 + k), name = projectData.get(x).get(5 + k), course = projectData.get(x).get(6 + k);
                    char gender = (projectData.get(x).get(7 + k).charAt(0));
                    // Initialize studentProject
                    studentProject[i] = new Project(title, school, supervisor, adminNum, name, course, gender);

                    k += 4;
                    i += 1;
                    numOfStud--;

                } //while
            } // for
        } //for

        return studentProject;
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
        // Change desired file path 
        //String filePath = "C:/Modules files/Year 2/Data Structure And Algorithm/output.txt"
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
