package PhoneBook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        login("derk.i26252@gmail.com", "Password@1");
    }

    @Test
    public void addContactPositiveTest() {

    }
}
