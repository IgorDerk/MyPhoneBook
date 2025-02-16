package PhoneBook;

import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test(invocationCount = 1)
    public void loginExistedUserPositiveTest() {
        clickOnLoginLink();
        typeEmail("derk.i26252@gmail.com");
        typePassword("Password@1");
        clickOnLoginButton();
        checkLogin();


    }

}
