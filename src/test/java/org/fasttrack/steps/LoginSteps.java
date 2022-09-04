package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.utils.Constants;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void setUserEmail(String email) {
        loginPage.setEmailField(Constants.userEmail);
    }

    @Step
    public void setPassword(String password) {
        loginPage.setPasswordField(Constants.userPass);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals("Hello, " + userName + "!", accountPage.getWelcomeText());
    }



    @Step
    public void doLogin(String email, String pass){
        navigateToLoginPage();
        setUserEmail(Constants.userEmail);
        setPassword(Constants.userPass);
        clickLogin();
    }
}
