package mvc_pattern;

import mvc_pattern.controller.StudentController;
import mvc_pattern.model.Student;
import mvc_pattern.view.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);
        controller.updateView();

        // update model data
        controller.setStudentName("Budi Gaya");
        controller.setRollNo("55");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Jhon Doe");
        student.setRollNo("10");
        return student;
    }
}
