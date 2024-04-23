package commands.impl;

import commands.Command;
import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import model.Student;

import java.io.PrintStream;
import java.util.Scanner;

public class AddStudentCommand implements Command {
    private final StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void execute(Scanner scanner, PrintStream printStream) {
        // ask user to print user, last name
        // and other data, create new User and pass it on the save method
        printStream.println("Print name");
        String name = scanner.nextLine();
        printStream.println("Print surname");
        String surname = scanner.nextLine();

        studentDao.save(new Student(name, surname));
    }

    @Override
    public String name() {
        return "1";
    }

    @Override
    public String description() {
        return "Add new student";
    }
}
