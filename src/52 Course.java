class Course {

    static int maxCapacity = 100;
    String courseName;

    int enrollments;

    String[] enrolledStudents;



    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }


    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        if(enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
            System.out.println(studentName + " enrolled in " + courseName);
        }else {
            System.out.println("Enrollment failed: Course is full.");

        }

    }

    void unEnrollStudent(String studentName) {
        boolean found = false;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {

                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[enrollments - 1] = null;  // Clear the last entry
                enrollments--;
                System.out.println(studentName + " has been removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found: " + studentName);
        }
    }

    public static void main(String[] args) {
        Course DSAPrep = new Course("Algorithm Preparation");

        DSAPrep.enrollStudent("Pramod");
        DSAPrep.enrollStudent("Aditya");
        DSAPrep.enrollStudent("Saurabh");

        DSAPrep.unEnrollStudent("Aditya");
        DSAPrep.unEnrollStudent("Rosie");
    }
}




