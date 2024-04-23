package commands;

import commands.impl.AddStudentCommand;
import commands.impl.DeleteStudentCommand;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public static final Map<String, Command> commandMap = new HashMap<>();

    public static void registerCommands() {
        AddStudentCommand addStudentCommand = new AddStudentCommand();
        DeleteStudentCommand deleteStudentCommand = new DeleteStudentCommand();

        commandMap.put(addStudentCommand.name(), addStudentCommand);
        commandMap.put(deleteStudentCommand.name(), deleteStudentCommand);
    }

}
