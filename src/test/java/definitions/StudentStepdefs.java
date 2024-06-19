package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class StudentStepdefs {
    @When("I click {string} button VY")
    public void iClickButtonVY(String btnName) {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
    }

    @Then("{string} should b displayed")
    public void shouldBDisplayed(String expMessage) {
        String actMessage = getDriver().findElement(By.xpath("//h1[@id='mat-dialog-title-0']")).getText();
        System.out.println(actMessage);
        assertThat(actMessage.contains(expMessage)).isTrue();

    }

    @Then("I type {string} into current password field")
    public void iTypeIntoCurrentPasswordField(String currentPass) {
        getDriver().findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(currentPass);
    }

    @Then("I type {string} into new password field")
    public void iTypeIntoNewPasswordField(String newPass) {
        getDriver().findElement(By.xpath("//input[@formcontrolname='newPassword']")).sendKeys(newPass);
    }

    @Then("I type {string} into confirm new password field")
    public void iTypeIntoConfirmNewPasswordField(String confirmPass) {
        getDriver().findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys(confirmPass);
    }


    @When("I click {string} button    VI")
    public void iClickButtonVI(String arg0) {
        getDriver().findElement(By.xpath("//span[text()='Change']")).click();
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String expSettings) {
        String actSettings =  getDriver().findElement(By.xpath("//h4[contains(text(),'Settings')]")).getText();
        System.out.println(actSettings);
        assertThat(actSettings.equals(expSettings)).isTrue();
    }
}


