package Q5;

public class Main {
    static void main(String[] args) {

        // Create Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Mr.Kesavan selvarajah");
        lecturer.setCourseTeaching("Object Oriented Programming");

        // Create Course object
        Course course = new Course();
        course.setCourseName("Object Oriented Programming");
        course.setCourseCode("CTEC22063");
        course.setLecturer(lecturer);

        // Create Student object
        Student student = new Student();
        student.setStudentName("Hasitha");
        student.setDegreeName("BICT(Hons)");
        student.setCourseFollowing("Object Oriented Programming");

        // Display Details
        System.out.println("Course Details");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());

        System.out.println("\nLecturer Details");
        System.out.println("Lecturer Name: " + lecturer.getLecturerName());
        System.out.println("Course Teaching: " + lecturer.getCourseTeaching());

        System.out.println("\nStudent Details");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree Name: " + student.getDegreeName());
        System.out.println("Course Following: " + student.getCourseFollowing());
    }
}
