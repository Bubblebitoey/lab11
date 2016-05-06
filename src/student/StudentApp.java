package student;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Display reminders of students having a birthday soon.
 *
 * @author Soraya Saenna
 */
public class StudentApp {

	/**
	 * Print the names (and birthdays) of students having a birtday in the
	 * specified month.
	 *
	 * @param students
	 * 		list of students
	 * @param filter
	 * 		the condition to print student
	 */
	public void filterAndPrint(List<Student> students, Predicate<Student> filter, Consumer<Student> action, Comparator<Student> sort) {
		// I have filter the list and sorted it, Also forLoop print the result.
		students.stream().filter(filter).sorted(sort).forEach(action);
	}


	public static void main(String[] args) {
		List<Student> students = Registrar.getInstance().getStudents();
		StudentApp app = new StudentApp();

		//check that student who was born in May
		Predicate<Student> filter = (student) -> student.getBirthdate().getMonthValue() == 5;
		// print dd/MM/yyy of student who have birth day in May
		Consumer<Student> action = (student) -> System.out.println(student.toString());
		//sorted list of student by name
		Comparator<Student> sortName = (o1, o2) -> o1.getFirstname().compareToIgnoreCase(o2.getFirstname());

		app.filterAndPrint(students, filter, action, sortName);
	}
}
