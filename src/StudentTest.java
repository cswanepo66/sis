public class StudentTest extends junit.framework.TestCase {
    public void testCreate() {
        final String firstStudentName = "Jane Doe";
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName, student.getName());

        final String secondStudentName = "Joe Blow";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());
    }
}
