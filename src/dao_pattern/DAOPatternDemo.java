package dao_pattern;


public class DAOPatternDemo {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();

        for (Student student : studentDAO.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        Student student = studentDAO.getAllStudents().get(0);
        student.setName("Michael");
        studentDAO.updateStudent(student);

        studentDAO.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

        System.out.println();
        for (Student studentNew : studentDAO.getAllStudents()) {
            System.out.println("Student: [RollNo : " + studentNew.getRollNo() + ", Name : " + studentNew.getName() + " ]");
        }
    }
}
