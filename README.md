# BankManagementTesting - JUnit5
A simple Bank Management System built using Java and JUnit 5. The project supports basic banking operations such as deposit, withdrawal, balance inquiry, and includes unit tests for validating business logic.

# Bank Account Management System

A simple Java project created to practice **Unit Testing using JUnit 5**.

## Features

* Create a bank account with an initial balance
* Deposit money
* Withdraw money
* Check account balance
* Handle invalid transactions using exceptions
* Unit testing with JUnit 5

## Technologies Used

* Java
* JUnit 5
* Maven
* Git & GitHub

## Project Structure

```text
BankManagementSystem
│
├── src
│   ├── main
│   │   └── java
│   │       └── BankAccount.java
│   │
│   └── test
│       └── java
│           └── BankAccountTest.java
│
├── pom.xml
└── README.md
```

## Operations

### Deposit

Adds money to the account balance.

* Valid amount → Balance increases
* Zero or negative amount → `IllegalArgumentException`

### Withdraw

Withdraws money from the account.

* Valid amount → Balance decreases
* Amount greater than balance → `IllegalArgumentException`
* Zero or negative amount → `IllegalArgumentException`

## JUnit 5 Test Cases

The project includes tests for:

* Successful deposit
* Successful withdrawal
* Withdrawal with insufficient balance
* Deposit with a negative amount

Example:

```java
@Test
void depositShouldIncreaseBalance() {
    BankAccount account = new BankAccount(1000);

    account.deposit(500);

    assertEquals(1500, account.getBalance());
}
```

## Purpose

This project was created to understand the fundamentals of **JUnit 5**, including:

* `@Test`
* `assertEquals()`
* `assertThrows()`
* Positive test cases
* Negative test cases
* Exception testing

## Future Improvements

* Multiple bank accounts
* Account numbers
* Transaction history
* Transfer money between accounts
* Database integration
* Spring Boot REST API
