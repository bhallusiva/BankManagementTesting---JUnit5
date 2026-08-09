# Bank Management System — JUnit 5

A small **Java banking application** built to practice clean business logic and professional **unit testing with JUnit 5**.

[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://www.java.com/)
[![JUnit 5](https://img.shields.io/badge/JUnit-5-green)](https://junit.org/junit5/)
[![Maven](https://img.shields.io/badge/Maven-build-red)](https://maven.apache.org/)

## ✨ Features

- Create a bank account with an initial balance
- Deposit money with input validation
- Withdraw money with balance validation
- Check the current balance
- Handle invalid operations using `IllegalArgumentException`
- Automated unit tests for successful and failure scenarios

## 🧪 Testing Focus

This project demonstrates core JUnit 5 concepts:

- `@Test`
- `assertEquals()`
- `assertThrows()`
- Positive test cases
- Negative test cases
- Exception testing
- Isolating business logic from test code

Example:

```java
@Test
void depositShouldIncreaseBalance() {
    BankAccount account = new BankAccount(1000);

    account.deposit(500);

    assertEquals(1500, account.getBalance());
}
```

## 🛠️ Tech Stack

- **Java**
- **JUnit 5**
- **Maven**
- **Git & GitHub**

## 📁 Project Structure

```text
BankManagementTesting---JUnit5/
├── src/
│   ├── main/java/
│   │   └── BankAccount.java
│   └── test/java/
│       └── BankAccountTest.java
├── pom.xml
└── README.md
```

## ▶️ Run the Tests

Make sure Maven is installed, then run:

```bash
mvn test
```

## 🔍 Validation Rules

### Deposit

- Positive amount → balance increases
- Zero or negative amount → `IllegalArgumentException`

### Withdrawal

- Positive amount within available balance → balance decreases
- Amount greater than balance → `IllegalArgumentException`
- Zero or negative amount → `IllegalArgumentException`

## 🎯 Purpose

This project is part of my Java backend learning journey and demonstrates how I use **automated testing to verify application behaviour instead of relying only on manual testing**.

## 🔮 Future Improvements

- Multiple accounts
- Account numbers
- Transaction history
- Money transfers
- Database persistence
- Spring Boot REST API

---

**Author:** [Siva Bhallu](https://github.com/bhallusiva)
