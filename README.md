# 🏦 Bank Management System — JUnit 5

A Java banking application built to demonstrate **clean business logic, validation, and automated unit testing with JUnit 5**.

The project is intentionally small, but follows the mindset used in backend development: define behaviour clearly, validate inputs, and verify important scenarios with repeatable tests.

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![JUnit 5](https://img.shields.io/badge/JUnit-5-green)
![Maven](https://img.shields.io/badge/Maven-build-red)

## 🎯 Project Goals

- Practice object-oriented Java development
- Learn professional unit-testing fundamentals
- Test both successful and invalid operations
- Understand exception-based validation
- Build confidence with Maven-based test execution

## ✨ Features

- Create a bank account with an initial balance
- Deposit money with validation
- Withdraw money with balance validation
- Check the current balance
- Reject invalid amounts using `IllegalArgumentException`
- Automated positive, negative and exception-based test cases

## 🧪 Testing Strategy

The test suite demonstrates:

- `@Test`
- `assertEquals()`
- `assertThrows()`
- Positive test cases
- Negative test cases
- Exception testing
- Business-rule validation

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

| Technology | Purpose |
|---|---|
| Java | Application and business logic |
| JUnit 5 | Automated unit testing |
| Maven | Build and test automation |
| Git & GitHub | Version control |

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

## ▶️ Run Tests

```bash
mvn test
```

## 🔍 Business Rules

### Deposit

- Positive amount → balance increases
- Zero or negative amount → `IllegalArgumentException`

### Withdrawal

- Positive amount within available balance → balance decreases
- Amount greater than balance → `IllegalArgumentException`
- Zero or negative amount → `IllegalArgumentException`

## 💡 What This Demonstrates

This project shows that I can go beyond simply writing Java classes and also **verify application behaviour with automated tests**.

Key engineering concepts practiced:

- Encapsulation
- Input validation
- Exception handling
- Unit testing
- Test-driven thinking
- Maven project structure

## 🚀 Future Improvements

- Multiple customer accounts
- Account numbers
- Transaction history
- Money transfers
- Database persistence with MySQL
- Spring Boot REST API
- Integration testing

## 👨‍💻 Author

**Siva Bhallu** — [GitHub](https://github.com/bhallusiva)
