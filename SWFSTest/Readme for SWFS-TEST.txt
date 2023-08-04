Readme:
A Maven framework in which to build Selenium tests written in Java with Cucumber and Testng reports of test results.

Testcases Details:
In this project we have created class for login,AddtoCart and logout functionality by using POM Factory pattern.

Built With
Java,Testng,Cucumber,Selenium

Getting Started
Copy the repo into your local machine.

Built With
Java,Testng,Cucumber,Selenium

Prerequisites
Eclipse IDE with JAVA 11. Chrome driver

Setting up Dev
Install eclipse IDE and import the project. All dependencies available under POM.xml , wait until its downloads.

Run tests locally:
Set your local path in this LoginStep.java and Testcases.Java, in below line:

System.setProperty(
            "webdriver.chrome.driver","D:\\chromedriver.exe");
Right click the feature file and select "Run" or "Debug" to start the test.

Reporting:
Testng Framework  is used as a reporting tool.Report data will be placed in target folder and test-output.
