package commands;

import java.io.PrintStream;
import java.util.Scanner;

public interface Command {
    void execute(Scanner scanner, PrintStream printStream);

    String name();

    String description();
}
