
# <h1>Quality analyst project</h1>
[![Java CI with Maven](https://github.com/gostosohub/quality-analyst-project/actions/workflows/maven.yml/badge.svg)](https://github.com/gostosohub/quality-analyst-project/actions/workflows/maven.yml)

This project is testing hudl login functionbality using selenium webdriver, cucumber and java

<h2>Intsallation and Running tests</h2>
  1. Clone the git repository using `git clone https://github.com/gostosohub/quality-analyst-project.git`
  2. Install JDK8, Git, Maven in your IDE
  3. Run `mvn clean install`
  4. Run `mvn test`
  
  
<h2>Tools & libraries</h2>
1. Programming language: Java
2. Browser automation framework: Selenium webdriver
3. BDD Framework: Cucumber-JVM
4. Build tool: Maven

<h2>Reports</h2>
Test report will created under 

1.Basic html format with screenshots attached if the scenario fails:
./target/cucumber-reports/cucumber.html
<img width="1380" alt="Screenshot 2021-07-27 at 18 19 09" src="https://user-images.githubusercontent.com/69424682/127199039-7fa6b581-bd03-4b38-9a13-a1f87021144e.png">

2.Maven cucumber reporting :
./target/cucumber-html-reports/overview-features.html

<img width="1525" alt="Screenshot 2021-07-27 at 16 55 50" src="https://user-images.githubusercontent.com/69424682/127193211-de8e53f1-5449-421a-bedb-7b7272bfecec.png">
