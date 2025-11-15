# 💳 Payment System

A professional payment gateway system demonstrating core Object-Oriented Programming principles with real-world payment processing simulation.

## 🎯 Overview

This project implements a complete payment gateway system that can process transactions through multiple payment methods. It showcases advanced OOP concepts in a practical, business-ready application.

## 🛠 OOP Concepts Demonstrated

### 🔷 Abstraction
- **`PaymentGateway`** abstract class provides common gateway functionality
- **`Transaction`** interface defines the payment contract

### 🔷 Inheritance  
- **`CreditCardGateway`** extends `PaymentGateway` for specialized behavior
- Constructor chaining with `super()` for proper initialization

### 🔷 Interface Implementation
- **`CreditCardGateway`** implements `Transaction` interface
- Multiple inheritance through interface + abstract class

### 🔷 Polymorphism
- Default interface methods with implementation
- Method overriding in concrete classes

### 🔷 Encapsulation
- Protected fields with controlled access
- Clean separation of concerns

## 📁 Code Architecture
