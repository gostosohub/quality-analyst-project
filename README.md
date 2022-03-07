
# <h1>Quality analyst project</h1>
[![Java CI with Maven](https://github.com/gostosohub/quality-analyst-project/actions/workflows/maven.yml/badge.svg)](https://github.com/gostosohub/quality-analyst-project/actions/workflows/maven.yml)

This project is testing login functionbality using selenium webdriver, cucumber and java.

## Intsallation and running tests
  1. Clone the git repository using `git clone https://github.com/gostosohub/quality-analyst-project.git`
  2. Install Java 8 JDK, Git, Maven
  3. To install dependency run `mvn clean install` 
  4. To run all tests `mvn test` (Before running, please add real user and password in the test @validUser in this [feature file](https://github.com/gostosohub/quality-analyst-project/blob/master/src/test/resources/features/Login.feature))
  5. To run using tags `mvn test -Dcucumber.filter.tags="@validUser"`
  
  
## Tools, libraries and practices 
  1. Programming language: Java
  2. Browser automation framework: Selenium webdriver
  3. BDD Framework: Cucumber-JVM
  4. Build tool: Maven
  5. Reporting template: maven-cucumber-reporting
  6. Coding practices : 
       * Page object modal
       * Factory pattern
       * DRY principle 
  8. Running given number (8) of tests
      | Mode | Time taken |
      | --- | ----------- |
      | Sequentially  | around 32s |
      | Parallelly | around 15-18s |
     

## Reports
Test report will be created under 

1. Test reports can be viewed here https://github.com/gostosohub/quality-analyst-project/tree/gh-pages 

2.  Standard html format with screenshots attached if the scenario fails:
./target/cucumber-reports/cucumber.html
<img width="1509" alt="Screenshot 2021-07-27 at 18 25 36" src="https://user-images.githubusercontent.com/69424682/127199879-4a15c26c-0ad3-42a6-a8ec-b2bb62a0cb8e.png">

3.  Maven cucumber reporting :
./target/cucumber-html-reports/overview-features.html

<img width="1525" alt="Screenshot 2021-07-27 at 16 55 50" src="https://user-images.githubusercontent.com/69424682/127193211-de8e53f1-5449-421a-bedb-7b7272bfecec.png">

## Future tech debts
 1. Run the test for multiple browsers, at the moment it is taking browser from config 
 2. Add other types of tests such as accessibility, visual regression, api tests
 
