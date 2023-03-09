

# Selenium with Cucumber (BDD Framework)
### By <strong>MattyDroidX</strong> Updated March 9, 2023

In this tutorial, you will learn how to integrate Cucumber with Selenium Webdriver.
What is Cucumber?
Cucumber is a testing approach which supports Behavior Driven Development (BDD). It explains the behavior of the application in a simple English text using Gherkin language.

Learn more at – https://www.guru99.com/cucumber-tutorials.html

What is Selenium?
Selenium is an automation tool for Functional Testing of the web-based application. Selenium supports different language like java, ruby, python C#, etc.

Learn more at – https://www.guru99.com/selenium-tutorial.html

In this Cucumber tutorial, we will learn-

### Why use Cucumber with Selenium?
*** Prerequisite for using Cucumber with Selenium.

*** Automation Testing Using Cucumber with Selenium.

1. Scenario 1: Print text in the console.
2. Scenario 2: Enter login Credential and reset the value.
3. Scenario 3: Enter login Credential on Guru99 & reset the value. Do this for 3 sets of data.

 Why use Cucumber with Selenium?
Cucumber and Selenium are two popular technologies.

Most of the organizations use Selenium for functional testing. These organizations which are using Selenium, want to integrate Selenium with Cucumber as Cucumber makes it easy to read and to understand the application flow.
Cucumber tool is based on the Behavior Driven Development framework that acts as the bridge between the following people:

Software Engineer and Business Analyst.
Manual Tester and Automation Tester.
Manual Tester and Developers.
Cucumber BDD framework also benefits the client to understand the application code as it uses Gherkin language which is in Plain Text. Anyone in the organization can understand the behavior of the software. The syntax’s of Gherkin is in simple text which is readable and understandable.

Why use Cucumber with Selenium
Prerequisite for using Cucumber with Selenium
Before we start Cucumber Selenium integration, we need the following items:

Selenium jar files:
Selenium-server-standalone
Can be downloaded at http://www.seleniumhq.org/download/

Download Selenium Standalone Server
Jar files For Cucumber :


* Cucumber-core
* Cucumber-html
* cobertura code coverage
* Cucumber-java
* Cucumber-junit
* Cucumber-jvm-deps
* Cucumber-reporting
* Hamcrest-core
* Gherkin
* Junit

Can be downloaded at https://mvnrepository.com/search?q=Cucumber

You need to search files and download them one by one individually.

For example, we will show you to download one of the jar files, i.e., “Cucumber-core.”
Click on the above download link. It redirects to the below site. Now search the particular jar, i.e. ‘Cucumber Core’ as shown screenshot below:

* Download Cucumber Core

In the next page, Click of the version 1.2.2,

* Download Cucumber Core


  In the next screen, click on download to get the ‘Cucumber Core’ jar file.

* Download Cucumber Core

Note: For your ease, we have bundled the jar files required to be download from Maven here. With time these jars maybe updated and become incompatible. You are requested to download them using the method illustrated above.

* Automation Testing Using Cucumber with Selenium.

Let’s study steps to use Cucumber with selenium step by step. Here we will cover 3 scenarios:

1. Scenario 1: Print text in the console.
2. Scenario 2: Enter login Credential and reset the value.
3. Scenario 3: Enter login Credential on Guru99 & reset the value. Do this for 3 sets of data.

#### Scenario 1: Print text in the console.
In this scenario, we just print the text in the console by using Cucumber.

<strong> Step 1)</strong> Create Project in eclipse.

Create Java project with the name “CucumberWithSelenium” as shown in the below screenshot.

Automation Testing Using Cucumber with Selenium

Automation Testing Using Cucumber with Selenium

<strong> Step 2)</strong> Adding Jar files in the project.

Right Click on the Project > Select Properties > Go to Java Build Path. Add all the libraries downloaded earlier.

Automation Testing Using Cucumber with Selenium

<strong> Step 3) </strong> Creating feature file

For creating feature file first create features folder as shown below screenshot.

Automation Testing Using Cucumber with Selenium

Now Enter Folder name ‘Features’ and click on ‘Finish’ Button.


Automation Testing Using Cucumber with Selenium

Automation Testing Using Cucumber with Selenium

Now, create feature file in the ‘Features’ folder with the name of “MyTest.feature” – Process is similar to creating a folder

Automation Testing Using Cucumber with Selenium

Note: You may need to install the Cucumber Eclipse Plugin for this to work. Goto — Helps->Install New Software->copy paste the link http://cucumber.github.io/cucumber-eclipse/update-site/ and install

<strong> Step 4) </strong> Write scenarios.

Below lines are written in ‘MyTest.feature’ file using the Gherkin language as shown below:

<h6> Feature: Reset functionality on login page of Application</h6>
<h6> Scenario: Verification of Reset button </h6>
<h6>Given Open the Firefox and launch the application</h6>
<h6>When Enter the Username and Password</h6>
<h6>Then Reset the credential</h6>		

Code Explanation

Line 1) In this line we write business functionality.

Line 2) In this line we write a scenario to test.

Line 3) In this line we define the precondition.

Line 4) In this line we define the action we need to perform.

Line 4) In this line we define the expected outcome or result.

Step 5) Writing selenium testrunner script for Selenium Cucumber framework design

Here we create ‘TestRunner’ package and then ‘Runner.java’ class file under it.

package TestRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"StepDefinition"})						
public class Runner 				
{

}
In the above Cucumber Java example code, we run the cucumber test by using the following annotations:

@RunWith() annotation tells about the test runner class to start executing our tests.

@CucmberOptions() annotation is used to set some properties for our cucumber test like feature file, step definition, etc.

Screenshot of the TestRunner file.

Automation Testing Using Cucumber with Selenium
Step 6) Creating Step Definition script.

Now here we create ‘StepDefinition’ package and then ‘Steps.java’ script file under it. Here we actually write a selenium script to carry out the test under Cucumber methods.

````
package StepDefinition;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class Steps {


    @Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
        System.out.println("This Step open the Firefox and launch the application.");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }		

}
In the above code, the class is created with the name ‘Steps.’ Cucumber annotation is used to map with feature file. Each annotation method is defined:

@Given annotation define method to open firefox and launch the application

@When annotation define method to enter the username and password

@Then annotation define method to reset the credential

Under each method, we are only printing a message.

Below is the screenshot of the ‘Steps.java’ script and project tree, how it looks like.

Automation Testing Using Cucumber with Selenium
Note: Step definition is nothing but the steps you want to perform under this cucumber method.

````

Step 7) Executing the Script.

The user can execute this script from Test runner script, i.e. ‘Runner.java’ as shown in below screenshot.

Automation Testing Using Cucumber with Selenium
Step 8) Analyze the output.

On executing the ‘Runner.java’ script, it displays the text on the console. It is the same text defined in ‘Steps.java’ script.

Automation Testing Using Cucumber with Selenium
Scenario 2: Enter login Credential and reset the value.
Here we will just enter Credential on Guru99 demo login page and reset the value

For Scenario 2 we need to update only ‘Steps.java’ script. Here we actually write the selenium script as shown below steps. First, we need to add Selenium jar file to this project.

Automation Testing Using Cucumber with Selenium
Step 1) Here we update the ‘Steps.java’ script as shown in the below code and screenshot.

````
package StepDefinition;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class Steps {

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.gecko.driver", "E://Selenium//Selenium_Jars//geckodriver.exe");					
       driver= new FirefoxDriver();					
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys("username12");							
       driver.findElement(By.name("password")).sendKeys("password12");							
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}		

````
Screenshot of the above selenium script.

Automation Testing Using Cucumber with Selenium
Step 2) Execute the script.

After updating we run the Runner.java.

Step 3) Analyze the output.

In the output you can see the following:

Browser launched.
Guru99 bank demo site gets opened.
Username and password are placed on the login page.
Reset the values.
Automation Testing Using Cucumber with Selenium
Scenario 3: Enter login Credential on Guru99 & reset the value. Do this for 3 sets of data.
Here we need to update both the ‘Step.java’ and the feature file.

Step 1) Update the feature file as shown below:

Here we update the feature file with 'Scenario Outline' and  'examples' syntax.

````

Feature: Reset functionality on login page of Application


Scenario Outline: Verification of reset button with numbers of credential


Given Open the Firefox and launch the application


When Enter the Username <username>and Password <password>


Then Reset the credential

Examples:

|username  |password         |

|User1     |password1        |

|User2     |password2        |

|User3     |password3        |

// In this line we define the set of data.
Automation Testing Using Cucumber with Selenium
Step 2) Now update the Step.java script.

Here we update the methods as to pass the parameters, updated script shown below:

package StepDefinition;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class Steps {

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.gecko.driver", "E://Selenium//Selenium_Jars//geckodriver.exe");					
       driver= new FirefoxDriver();					
       driver.manage().window().maximize();			
       driver.get("www.demo.guru99.com/v4");					
    }		

    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")			
    public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
    {		
       driver.findElement(By.name("uid")).sendKeys(username);					
       driver.findElement(By.name("password")).sendKeys(password);					
    }		

    @Then("^Reset the credential$")					
    public void	Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}		

````
Automation Testing Using Cucumber with Selenium

Step 3) Now execute the updated script.

Below screen shows the successful execution of the script and time taken by each set of data.

Automation Testing Using Cucumber with Selenium
Step 4) Analyze the output.

In the output you can see the following:

Below output gets repeated for the number of data sets, i.e., 3 sets.

Browser launched.
Guru99 bank demo site gets opened.
Username and password are placed on the login page.
Reset the values.
Automation Testing Using Cucumber with Selenium
Conclusion.
Cucumber is a very popular BDD tool. It is easy to read and can be understood by all stakeholders including technical and non-technical person.

Cucumber can be integrated with Selenium using following 3 steps
