### The candidate should use Selenium WebDriver with any preferred programming language (e.g., Java, Python, C#).
-Selenium headless with Java

### The test scripts should be written in a Page Object Model (POM) framework for maintainability.
-page in src/govtech01/TechnicalTestForm.java
-test in src/test/java/TechnicalTestFormTest.java

### The candidate should implement both positive and negative test cases.
-WIP

### The test suite should include data-driven tests to validate the form with various data sets.
-WIP

### The candidate should integrate the automated tests with a Continuous Integration (CI) tool (e.g., Gitlab, Jenkins, CircleCI).
Github Actions (Java CI with Maven)

### The test suite should generate a detailed report of the test execution results.
report will be generated at /test-output/testng-results.xml

### The candidate should ensure cross-browser testing is performed.
-WIP currently using chrome but have also dependencies for FF and Opera, just need to set those up

### The candidate should provide a brief explanation of their test strategy and the structure of their test code.
-WIP, currently only have the scenario for empty form and minimum required fields



The test suite should validate the following functionalities:
Correct data entry for each field type.
Required field validation.
Date restrictions (e.g., only past dates allowed).
File upload success and type validation (e.g., only PDFs allowed).
Radio button and checkbox selections and their corresponding outcomes.
