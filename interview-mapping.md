# SDET Essentials – Automation Framework

## Overview
This project is a comprehensive **SDET learning and automation framework**
covering UI, API, BDD, CI/CD, Docker, and core Java concepts.

## Tech Stack
- Language: Java 8+
- Build Tool: Gradle
- UI Automation: Playwright (Java)
- API Automation: REST Assured
- BDD: Cucumber
- Test Runner: TestNG
- Reporting: Extent Reports, Allure
- Logging: Log4j2
- CI/CD: GitHub Actions
- Containerization: Docker

## Project Structure
(com.sdet.essentials)
core -> driver, config, utils
ui -> pages, flows
api -> clients, validators
reporting -> reports
patterns -> design patterns


## Design Principles
- Page Object Model
- Factory & Singleton patterns
- Clean separation of concerns
- API-first testing approach

## How to Run Tests
```bash
./gradlew test

CI/CD

Tests run automatically on push

Reports generated as artifacts

```
Author

Durgesh Kumar – SDET Journey


---

# ✅ PART 3: INTERVIEW MAPPING (MODULE → QUESTIONS)

## 🔹 Core Java
- Explain OOP
- Java 8 features
- Exception handling
- Multithreading in automation

## 🔹 UI Automation
- Why Playwright?
- POM advantages
- Handling waits & flaky tests

## 🔹 API Automation
- Why API tests?
- Serialization vs Deserialization
- Auth handling

## 🔹 Framework Design
- Explain architecture
- How configs are managed
- Parallel execution strategy

## 🔹 BDD
- Pros & cons of Cucumber
- Hooks usage
- Tagging strategy

## 🔹 CI/CD
- Explain your pipeline
- How failures are handled
- Report publishing

## 🔹 Docker
- Why Docker for tests?
- Headless execution
- CI integration

---
