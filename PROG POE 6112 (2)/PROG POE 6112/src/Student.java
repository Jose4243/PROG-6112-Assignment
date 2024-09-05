    import javax.swing.*;

    class Student {

        private String id;
        private String name;
        private static int age;
        private String email;
        private String course;

        //Constructor
        public Student(String id, String name, int age, String email, String course) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.email = email;
            this.course = course;

        }

        //Getter methods.
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }

        public String getCourse() {
            return course;
        }

        //method to display student details.
        @Override
        public String toString() {
            return"\nID: " + id + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email + "\nCourse: " + course;
        }

        //Method to prompt user for student details.
        public static void addStudent() {
            String id = JOptionPane.showInputDialog("Enter Student ID:");
            String name = JOptionPane.showInputDialog("Enter Student Name:");

            //boolean to check for relevant student age.
            boolean checkAge = true;
            do {
                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Student Age:"));
                if (age <= 16) {
                    JOptionPane.showMessageDialog(null, "You have entered an incorrect student age! please re-enter the student age.");
                    checkAge = false;
                } else {
                    String email = JOptionPane.showInputDialog(null, "Enter Student email:");
                    String course = JOptionPane.showInputDialog(null, "Enter student course:");
                    main.students.add(new Student(id, name, age, email, course));
                    JOptionPane.showMessageDialog(null, "Student added successfully!");
                    break;
                }
            } while (!checkAge);
        }

        //Method to allow user to search for a student via their student ID.
        public static void searchStudent() {
            String id = JOptionPane.showInputDialog("Enter Student ID to search:");
            for (Student student : main.students) {
                if (student.getId().equals(id)) {
                    JOptionPane.showMessageDialog(null, student.toString());
                    return;
                }
            }
            JOptionPane.showMessageDialog(null, "Student not found.");
        }

        //Method to prompt user to delete a student using their student ID.
        public static void DeleteStudent() {
            String id = JOptionPane.showInputDialog("Enter Student ID to delete: ");
            String confirm = JOptionPane.showInputDialog(null, "Are you sure you wish to delete student: " + id + " from the system? Yes(Y) to delete.");
            //If statement for confirmation to delete student.
            if (confirm.equals("Y")) {
                for (int i = 0; i < main.students.size(); i++) {
                    if (main.students.get(i).getId().equals(id)) {
                        main.students.remove(i);
                        JOptionPane.showMessageDialog(null, "Student with student ID: " + id + " was deleted successfully!");
                        return;
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Student not deleted.");
            }
        }

        //Method to print all student information.
            public static void StudentReport() {
                StringBuilder report = new StringBuilder(("Student Report: \n"));
                for (Student student : main.students) {
                    report.append(student.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, report.toString());
            }
    }





