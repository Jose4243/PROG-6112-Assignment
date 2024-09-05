import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentManagementTest {
    private StudentManagementTest management;

    @BeforeEach
    void setUp() {
        management = new StudentManagementTest();
    }

    @Test
    void testAddStudent() {
        management.testAddStudent("1", "John Doe", 20, "john@example.com", "Computer Science");
        assertNotNull(management);
    }

    private void testAddStudent(String number, String johnDoe, int i, String mail, String computerScience) {

    }

    @Test
    void testSearchStudent() {
        management.testAddStudent("2", "Jane Doe", 22, "jane@example.com", "Mathematics");
        assertEquals("Jane Doe", management.searchStudent("2").getName());
    }

    private Student searchStudent(String number) {
        return null;
    }

    @Test
    void testDeleteStudent() {
        management.testAddStudent("3", "Jim Beam", 21, "jim@example.com", "Physics");
        assertTrue(management.deleteStudent("3"));
        assertNull(management.searchStudent("3"));
    }

    private boolean deleteStudent(String number) {
        return false;
    }

    @Test
    void testPrintAllStudents() {
        management.testAddStudent("4", "Jack Daniels", 23, "jack@example.com", "Chemistry");
        String report = management.printAllStudents();
        assertTrue(report.contains("Jack Daniels"));
    }

    private String printAllStudents() {
        return null;
    }
}
