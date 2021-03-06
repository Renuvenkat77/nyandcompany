package selAutomn;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NyandC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkatasubramanian\\Desktop\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nyandcompany.com");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String hphandle= driver.getWindowHandle();
                   //code to check if the nyandcompany page title is loading upon clicking the website url
String expPtitle= "Women's Clothes & Accessories | Shop at New York & Company";
String actPtitle= driver.getTitle();
if (actPtitle.contentEquals(expPtitle))
{System.out.println("Page title test passed");
 System.out.println(actPtitle);
}

else {System.out.println("Pagetitle test failed");	
      System.out.println(actPtitle);
	}
                  //create a new account for a user to login
WebElement createaccount= driver.findElement(By.xpath("/html/body/header/nav[2]/ul/ul/li[1]/div[2]/a[2]"));
createaccount.click();
WebElement email= driver.findElement(By.id("email")).sendkeys("xyz@gmail.com");	
WebElement password= driver.findElement(By.id("password1")).sendkeys("abcde1");	
WebElement confirm_pwd = driver.findElement(By.id("password2")).sendkeys("abcde1");	
WebElement firstname = driver.findElement(By.id("fname")).sendkeys("John");	
WebElement lastname= driver.findElement(By.id("lname")).sendkeys("David");	
WebElement mobile = driver.findElement(By.id("mobilenumask")).sendkeys("4693221402");	
WebElement phone_num= driver.findElement(By.id("phonenumask")).sendkeys("2144444444");	
WebElement country= driver.findElement(By.id("atg_store_countryNameSelect"));		
Select s1= new Select(country);
s1.SelectByValue("US");
WebElement nickname_address= driver.findElement(By.id("addressname")).sendKeys("abc");
WebElement address1= driver.findElement(By.id("address1")).sendKeys("23, Serene Dr");
WebElement city= driver.findElement(By.id("city")).sendKeys("Dallas");		
WebElement state= driver.findElement(By.id("atg_store_stateSelect"));
Select s2 = new Select(state);
s2.SelectByValue("TX");
WebElement zipcode= driver.findElement(By.id("zip")).sendKeys("75035");		
WebElement register= driver.findElement(By.id("atg_store_createMyAccount")).click();	
		//login by user
WebElement login = driver.findElement(By.xpath("/html/body/header/nav[2]/ul/ul/li[1]/div[2]/a[1]")).click();
WebElement email = driver.findElement(By.id("atg_store_registerLoginEmailAddress")).sendKeys("xyz@gmail.com");
WebElement password = driver.findElement(By.id("atg_store_registerLoginPassword").sendKeys("abcde1");	
WebElement loginbutton= driver.findElement(By.id("atg_store_loginButton")).click();					 
		//to check if menu option evamendes is displayed and goes to expected page upon click
WebElement evamendes= driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[1]/li/a"));
if(evamendes.isDisplayed())
{evamendes.click();
Thread.sleep(5000);
Set <String> handles1= driver.getWindowHandles();
	for (String h:handles1)
    {
      if( driver.getTitle().equals("Eva Mendes Collection | Dresses, Tops & More | NY&C" )) {
      driver.switchTo().window(h); 
      System.out.println("Eva Mendes menu goes to the expected page upon click" + driver.getTitle());
        }
        
     else
  {System.out.println("Eva Mendes menu does not go to expected page upon click" + driver.getTitle());
  }
    }
}
	
else
{ System.out.println("eva mendes is not displayed");
}
//code to check if menu option Gabrielle is displayed and expected page is loaded upon click
WebElement Gabrielle = driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[1]/a"));
if(Gabrielle.isDisplayed())
{Gabrielle.click();
Thread.sleep(5000);
Set <String> handles2= driver.getWindowHandles();
for (String h:handles2)
{
  if( driver.getTitle().equals("Gabrielle Union Collection at New York & Company" )) {
  driver.switchTo().window(h); 
  System.out.println("Gabrielle Union menu goes to the expected page upon click" + driver.getTitle());
    }
    
 else
{System.out.println("Gabrielle Union menu does not go to expected page upon click" + driver.getTitle());
}
}
}

else
{ System.out.println("Gabrielle Union menu is not displayed");
}
//code to check if menu option Brandswelove is displayed and expected page is loaded upon clicking the option uncommonsense
WebElement Brandswelove = driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[2]/a"));
if(Brandswelove.isDisplayed())
{Brandswelove.click();
System.out.println("Brands we love is displayed"+ driver.getTitle());}
WebElement uncommonsense= driver.findElement(By.xpath("//*[@id='subCat3434156168']/div/div[1]/ul/li[2]/a"));
uncommonsense.click();
Thread.sleep(5000);
Set <String> handles3= driver.getWindowHandles();
for (String h:handles3)
{
  if( driver.getTitle().equals("Women’s Lingerie from Uncommon Sense | New York & Company" )) {
  driver.switchTo().window(h); 
  System.out.println("Brandswelove menu dropdown uncommonsense goes to the expected page upon click" + driver.getTitle());
    }
    
 else
{System.out.println("Brandswelove menu dropdown uncommonsense does not go to expected page upon click" + driver.getTitle());
}
}
}

else
{ System.out.println("Brandswelove menu is not displayed");
}
//to check if the login button is alligned to the left
WebElement Login= driver.findElement(By.xpath("/html/body/header/nav[1]/div[1]/div/div/div[1]/ul/li[1]/a"));
String aAlign= Login.getCssValue("text-align");	
String eAlign= "left";
 if(aAlign.equals(eAlign))
 {System.out.println("Login link is displayed to the left- test pass:"+ aAlign);}
 else {System.out.println("Login link is  not displayed to the left- test fail:"+ aAlign);}*/
//to check if the fontsize of wishlist is '10px'
WebElement wishlist= driver.findElement(By.id("myWishList"));
String afontsize= wishlist.getCssValue("font-size");	
String efontsize= "10px";
 if(afontsize.equals(efontsize))
 {System.out.println("fontsize is displayed as expected- test pass:"+ afontsize);}
 else {System.out.println("fontsize is not displayed as expectd-test fail:"+ afontsize);}*/
//to check if footertext is displayed
WebElement footertext= driver.findElement(By.xpath("/html/body/footer/div[2]/div/div[3]/div[1]/p"));
if(footertext.isDisplayed())
{System.out.println("footer text is displayed: If you are using a screen reader...");}
else {System.out.println("footer text is not displayed");}

//to go back to the homepage and logout from the application.

driver.switchTo().window(hphandle);
WebElement Hello_user= driver.findElement(By.xpath("//a[@class='header_firstName']"));
if(Hello_user.isdisplayed())
	{
	WebElement logout= driver.findElement(By.id("atg_store_logOutButton")).click();
	}	
 driver.quit();	
	}	
}
