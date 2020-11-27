import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LogOutTest {
    // Rubin Michils

    private WebDriver driver;
    private String path = "http://localhost:8080/Controller";
    
    
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\2e jaar\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @After
    public void clean() { driver.quit();
    }
    
    @Test
    public void test_logout_works(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);

        homePage.setUserid("rm");
        homePage.setPassword("t");
        homePage.clickLoginButton();


        assertTrue(homePage.findLogoutButton());
        homePage.clickLogoutButton();
        assertTrue(homePage.findLogInButton());
    }


    @Test
    public void test_cannot_logout_when_not_logged_in(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);

        assertFalse(homePage.findLogoutButton());
        assertTrue(homePage.findLogInButton());

        /*findlogout
         --> is er niet
        lukt niet
        dus findlogin
        is er
        -> not logged in cant logout

         */

    }



}
