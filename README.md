# Student Management System

This educational project demonstrates the implementation of an n-tier 
architecture along with the Command design pattern in Java. 

Within this project, the Command pattern is implemented in a console application designed for managing student records. 
Users interact with the application through a command-line interface, where they can execute various commands to add or 
delete students from the system.

The application provides a set of commands, each encapsulating a specific action related to student management. 
For example, the 'AddStudentCommand' allows users to add a new student to the system, while the 'DeleteStudentCommand' 
enables the deletion of an existing student.

Users are presented with a menu of available commands and prompted to input their choice. Upon selecting a command, 
they are guided through the necessary steps to fulfill the action.

The Command pattern facilitates the separation of concerns by encapsulating individual actions as command objects. 
This design allows for easy extensibility, as new commands can be added to the system without requiring modifications to existing code.

Overall, this console application provides a practical example of how the Command pattern can be applied to create a 
flexible and scalable solution for managing student records.