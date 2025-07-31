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
Feature: ParaBank Login

Scenario: Successful Login with Valid credentials
Given User is on Login Page
Given User enters username and password
And User clicks on Login button
Then User should be redirected to Account Overview Page

```

### 📝 Registration.feature

```gherkin
Feature: ParaBank Register

Scenario: Successful Registration of new User
Given User is on Login Page
When User clicks on Register link
And User enters all the required information 
And User clicks on Register button
Then User should be see registration confirmation
```

### 🏦 OpenAccount.feature

```gherkin
Feature: Open New Account
Scenario: User open a savings account successfully

Given User navigates to Open New Account 
When user selects savings account type
And user selects existing account to transfer funds
And user clicks on Open Account button
Then New Account should be created and confirmation displayed
```

### 💸 TransferFunds.feature

```gherkin
Feature: Transfer Funds

Scenario: Successful Transfer of Funds
Given User navigates to Transfer Funds 
When User enters amount "2000"  
And User selects from account and to account 
And User Clicks on Transfer button
Then Transfer should be successful with confirmation message 
```


