package Model;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Pedro Penduko");
        System.out.println(student.getName());
        student.setAge(23);
        System.out.println(student.getAge());
        student.setGender("Male");
        System.out.println(student.getGender());
        student.setStudentNumber(202208240);
        System.out.println(student.getStudentNumber());
    }
}