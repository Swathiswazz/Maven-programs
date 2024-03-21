package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Facebookpagedesign
{

WebDriver driver;
//locating login button
@FindBy(name="login")
WebElement loginbutton;

//locating email id textbox
@FindBy(name="email")
WebElement emailidfield;

//locating password textbox
@FindBy(name="pass")
WebElement pswd;


public Facebookpagedesign(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}

//Clicking on login button
public void clickloginbutton()
{
loginbutton.click();	
}
//Specifying email and password

public void setvalues(String UN,String PWD)
{
	emailidfield.sendKeys(UN);
	pswd.sendKeys(PWD);
}
}
