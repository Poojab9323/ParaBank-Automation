# 🏦 ParaBank Automation Framework

This repository contains an automated test framework built using **Selenium WebDriver**, **Java**, **TestNG**, and **Cucumber** for automating key user flows of the [ParaBank](https://parabank.parasoft.com/parabank/index.htm) banking application.

## 🚀 Tech Stack

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Cucumber (BDD)**
- **Page Object Model (POM)**
- **Maven**
- **Extent Reports** *(optional, if implemented)*

---

## ✅ Features Covered

- 📝 **User Registration**
- 🔐 **User Login**
- 🏦 **Open New Account**
- 💸 **Transfer Funds**

Each of these features has been automated end-to-end using Cucumber BDD and Page Object Model for maximum maintainability and reusability.

---

## ??️ Project Structure

```
ParaBank-Automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/             # Page classes (POM)
│   ├── test/
│   │   └── java/
│   │       ├── stepDefinitions/   # Cucumber step defs
│   │       └── runners/           # TestNG runner files
│   └── resources/
│       ├── features/              # .feature files
│       └── global.properties      # Configuration
│
├── pom.xml                        # Maven dependencies
└── README.md                      # Project readme (this file)
```

---

## 🧪 How to Run Tests

1. ✅ Clone the repository:

```bash
git clone https://github.com/poojab9323/ParaBank-Automation.git
```

2. ✅ Navigate into the project:

```bash
cd ParaBank-Automation
```

3. ✅ Run tests using Maven:

```bash
mvn test
```

Alternatively, run specific feature from your TestNG runner.

---

## 🧾 Sample Feature Scenarios

### 🔐 Login.feature

```gherkin
Feature: Login to ParaBank

  Scenario: Successful login with valid credentials
    Given User is on the Login Page
    When User enters valid username and password
    And Clicks on the Login button
    Then User should be navigated to the Accounts Overview page
```

### 📝 Registration.feature

```gherkin
Feature: User Registration

  Scenario: Register new user
    Given User is on the Registration Page
    When User fills the registration form with valid details
    And Clicks on the Register button
    Then Registration should be successful and user redirected to Login
```

### 🏦 OpenAccount.feature

```gherkin
Feature: Open New Account

  Scenario: Open a new savings account
    Given User is logged in
    When User opens a new savings account
    Then The new account should be created successfully
```

### 💸 TransferFunds.feature

```gherkin
Feature: Transfer Funds

  Scenario: Transfer money between accounts
    Given User is logged in
    When User initiates a fund transfer from Account A to Account B
    Then Funds should be transferred successfully and confirmation should be displayed
```

---

## 📸 Optional Enhancements

- 📊 **Extent Reports** for HTML reports
- 🧪 **Data-driven testing** with Excel or CSV (if applicable)
- 🔄 **CI/CD Integration** with Jenkins or GitHub Actions
- 🧑‍💻 Add screenshots on failure (if implemented)

---

## 🙋 About Me

I'm a QA Engineer with 10+ years of experience in **manual testing** and recently have transitioned into **automation testing** by building hands-on frameworks like this one using **Java + Selenium + Cucumber**. I’m actively seeking roles in QA Automation and open to collaboration.

📧 Feel free to [connect on LinkedIn](https://www.linkedin.com/in/pooja-bhandarkar/)  
📂 [Explore my GitHub Projects](https://github.com/poojab9323)

---

