
## ☕ Java + Selenium + Karate + Cucumber (BDD) Framework

Author: Diogo Rangel (diogorangel)
This project is a hybrid automation framework. We use Cucumber for legacy web flows and Karate for modern API testing and web automation.
This branch contains a high-level automation framework using **Java** and **Cucumber** for Behavioral Driven Development (BDD). It follows the **Page Object Model (POM)** and uses **Maven** for dependency management.

### 🛠️ Tech Stack
* **Language:** Java 17
* **Framework:** Cucumber with JUnit 4
* **Browser Automation:** Selenium WebDriver
* **Driver Management:** WebDriverManager
* **Build Tool:** Maven
* **API Testing:** Karate and RestAssured
* **Browser Automation:** Selenium WebDriver (Java) + Karate Driver (Web)
* **Report:** Allure Report & ExtentReports

### 📊 Reports & Evidence
* **Automatic Screenshots:** Every scenario failure (or success) triggers a screenshot handled by `Hooks.java`.
* **HTML Dashboard:** A visual report is generated at `target/cucumber-reports.html`.
* **PDF Export:** To generate a PDF evidence file, open the HTML report in a browser and use the **Print to PDF** feature.
* **Karate Native:** Detailed logs and reports in target/karate-reports/.

* **Allure Report:** After running tests, use allure serve target/allure-results for an interactive dashboard with screenshots and request/response logs.

* **Cucumber:** HTML reports are available in target/cucumber-report-html.

### 🚀 How to Run
1. Make sure **Maven** is installed (`mvn -version`).
2. Run all scenarios:
   ```bash
   mvn clean test
   ```
3. Run specific tags:
   mvn test "-Dcucumber.filter.tags="@001_Login_StandardUser"
   
4. Examples : 
   Terminal,Format Needed
   PowerShell (VS Code): mvn test "-Dproperty.name=value"
   CMD (Command Prompt): mvn test -Dproperty.name=value
   Git Bash / Linux: mvn test -Dproperty.name=@tag

5. Run All Tests: mvn clean test 
   Run Karate Only: mvn test -Dtest=WebAPIKarate
   Run Web Tests Only (Cucumber): mvn test -Dtest=Web
   Tests Generate Allure Report - allure generate target/allure-results --clean && allure open
   Allure Results:
   mvn allure:serve
   mvn allure:report
   
6. Testes de API: mvn test "-Dtest=runner.ApiTests"
                  mvn clean test "-Dtest=runner.ApiTests"
                  

    Testes Web (Cucumber): mvn test -Dtest=WebTests
                           mvn test "-Dtest=WebTests"
                           mvn clean test "-Dtest=runners.WebTests"

    Testes Karate: mvn test -Dtest=WebAPIKarate
                   mvn test "-Dtest=WebAPIKarate"   
                   mvn clean test "-Dtest=runners.WebAPIKarateTest"
                   mvn clean test -Dtest=runners.WebAPIKarateTest -U -X
---
7. mvn solves:
mvn dependency:purge-local-repository
mvn clean test-compile
mvn clean install -U -DskipTests - Pular os testes quando necessario para fazer o build completo.
taskkill /f /im chrome.exe /t - for clean the chrome
taskkill /f /im chromedriver.exe /t - for clean the chrome
### Tests Results Via Git Actions
![Java CI with Maven](https://github.com/diogorangel/project-javakarate-web-api/actions/workflows/maven.yml/badge.svg?branch=master) 

[Clique aqui para ver o Relatório de Testes (Allure)](https://diogorangel.github.io/project-javakarate-web-api/)
### ✅ Final Checklist for Success:

1.  **Install Maven:** As seen in your image, the `mvn` command failed. Make sure to download Maven and add the `bin` folder to your Windows **PATH**.
2.  **Organize the Files:** Make sure `LoginPage.java` is in the `src/test/java/pages` folder and `LoginSteps.java` is in `src/test/java/steps`.
3.  **Tags:** In your `TestRunner`, the tag `@001_Login_StandardUser` must exist exactly as written at the top of your `.feature` file.

Commands to Run:

Run all tests:
```bash
mvn test
```

Generate Report:
Check `target/cucumber-reports.html` after running.