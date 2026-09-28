# 🏦 Bank Management System — JUnit 5

A Java banking application focused on **business logic, input validation and automated unit testing with JUnit 5**.

The project demonstrates how backend code can be verified with repeatable tests instead of relying only on manual execution.

## ✨ Features

- Create a bank account
- Deposit money
- Withdraw money
- Check account balance
- Validate invalid transaction amounts
- Reject withdrawals exceeding the available balance
- Automated positive, negative and exception-based tests

## 🧪 Testing

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
| JUnit 5 | Unit testing |
| Maven | Build and test automation |
| Git/GitHub | Version control |

## 📁 Structure

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

## 💡 Engineering Concepts

- Encapsulation
- Input validation
- Exception handling
- Unit testing
- Business-rule verification
- Maven project structure

## 🚀 Possible Extensions

- Multiple customer accounts
- Transaction history
- Account numbers
- Money transfers
- MySQL persistence
- Spring Boot REST API
- Integration testing

## 👨‍💻 Author

**Siva Bhallu** — [GitHub](https://github.com/bhallusiva)
