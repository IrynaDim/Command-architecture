package commands.impl;

import commands.Command;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AddStudentCommandTest {
    private final Command command = new AddStudentCommand();
    @Mock
    private Scanner scanner;

    @Test
    public void testExecute() {
        when(scanner.nextLine()).thenReturn("Iryna", "Dymytreyeva");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        command.execute(scanner, printStream);

        String expectedOutput = "Print name\r\nPrint surname\r\nStudent was saved" +
                " with name and surname: Iryna Dymytreyeva\r\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}
