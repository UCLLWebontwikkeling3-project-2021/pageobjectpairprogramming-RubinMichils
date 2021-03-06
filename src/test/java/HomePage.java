import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Page{
    // Rubin Michils

    @FindBy(id="userid")
    private WebElement useridField;

    @FindBy(id="password")
    private WebElement passwordField;

    public void setUserid(String userid) {
        useridField.clear();
        useridField.sendKeys(userid);
    }

    public void setPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public HomePage (WebDriver driver) {
        super(driver);
        this.driver.get(path);
    }



    public boolean findLogInButton(){
        boolean found = false;
        try {
            WebElement loginButton = this.driver.findElement(By.id("logIn"));
            found = true;
        } catch (NoSuchElementException ignored) {

        }
        return found;
    }


    public boolean findLogoutButton(){
        boolean found = false;
        try {
            WebElement logoutButton = this.driver.findElement(By.id("logOut"));
            found = true;
        } catch (NoSuchElementException ignored) {

        }

        return found;
    }

    public void clickLogoutButton(){
        WebElement logoutButton = this.driver.findElement(By.id("logOut"));
        logoutButton.click();
    }
    public void clickLoginButton(){
        WebElement loginButton = this.driver.findElement(By.id("logIn"));
        loginButton.click();
    }




}
