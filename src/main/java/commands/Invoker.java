package commands;

import commands.impl.AddStudentCommand;
import commands.impl.DeleteStudentCommand;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    public static final Map<String, Command> commandMap = new HashMap<>();

    public static void registerCommands() {
        AddStudentCommand addStudentCommand = new AddStudentCommand();
        AddStudentForCourseCommand addStudentForCourseCommand = new AddStudentForCourseCommand();
        DeleteStudentCommand deleteStudentCommand = new DeleteStudentCommand();
        FindStudentsWithCourseCommand findStudentsWithCourseCommand = new FindStudentsWithCourseCommand();

        commandMap.put(findStudentsWithCourseCommand.name(), findStudentsWithCourseCommand);
        commandMap.put(addStudentCommand.name(), addStudentCommand);
        commandMap.put(addStudentForCourseCommand.name(), addStudentForCourseCommand);
        commandMap.put(addStudentForCourseCommand.name(), addStudentForCourseCommand);
        commandMap.put(deleteStudentCommand.name(), deleteStudentCommand);
    }


}
