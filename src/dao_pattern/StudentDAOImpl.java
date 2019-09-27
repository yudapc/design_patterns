package dao_pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    List<Student> students;

    public StudentDAOImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("Jhon Doe", 55);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }
}
