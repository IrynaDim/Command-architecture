package commands.impl;

import commands.Command;
import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import utils.InputValidation;

import java.io.PrintStream;
import java.util.Scanner;

public class DeleteStudentCommand implements Command {
    private final StudentDao studentDao = new StudentDaoImpl();
    private final InputValidation inputValidation = new InputValidation();

    @Override
    public void execute(Scanner scanner, PrintStream printStream) {

        // Display all students so that the user can select an ID to delete from the list.
        printStream.println("Print user id to delete.");
        String id = scanner.nextLine();
        boolean integer = inputValidation.isInteger(id);

        // If the user inputs a value that is not an integer, prompt them to try again.
        studentDao.deleteById(Integer.parseInt(id));
        System.out.println("Student was deleted!");
    }

    @Override
    public String name() {
        return "2";
    }

    @Override
    public String description() {
        return "Delete student";
    }
}
