import javax.swing.*;
import java.util.ArrayList;

public class main {

    //ArrayList used to store students.
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        //Main method used to run program menu
        while (true) {
            String[] options = {"(1) Capture a new Student", "(2) Search Student", "(3) Delete a student","(4) Print student report ","(5) Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Student Information System",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                Student.addStudent();
            } else if (choice == 1) {
                Student.searchStudent();
            }else if (choice == 2){
                Student.DeleteStudent();
            } else if(choice == 3) {
                Student.StudentReport();
            }else{
                break;
            }
        }
    }
}








