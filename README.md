# java-week-2-tasks
# Week 2 – Java OOP Assignments & Mini Project

This folder contains Java programs created as part of **Week 2 Java and Object-Oriented Programming (OOP) practice**.

## 📂 Files

### 1. Student.java – Student Class Implementation

This program demonstrates the creation of a `Student` class with attributes and methods to store and display student information.

**Concepts covered:**

* Class and Object
* Attributes
* Methods
* Encapsulation

---

### 2. Vehicle.java – Vehicle Inheritance Example

This program demonstrates **inheritance and method overriding**.

It contains:

* `Vehicle` – Base class
* `Car` – Subclass of `Vehicle`
* `Bike` – Subclass of `Vehicle`

The `Car` and `Bike` classes override methods of the `Vehicle` class to provide their own implementations.

**Concepts covered:**

* Inheritance
* Method Overriding
* Polymorphism
* Classes and Objects

Structure:

```text
Vehicle
├── Car
└── Bike
```

---

# 📚 3. LibraryManagementSystem.java – Mini Project

A simple **Library Management System** developed using Java OOP concepts.

## Features

The program supports:

* Add Book
* Borrow Book
* Return Book
* Check book availability
* Display user information

## Classes Used

### `Book`

Represents a book in the library.

**Attributes:**

* Book ID
* Title
* Author
* Availability

Getters and setters are used to access and modify the private attributes.

### `Library`

Manages the books in the library.

**Methods:**

* `addBook()`
* `borrowBook()`
* `returnBook()`

The books are stored using Java's `List` and `ArrayList`.

### `User`

An abstract class representing a library user.

**Attributes:**

* User ID
* Name

It contains an abstract method to display user details.

### `StudentUser`

A subclass of `User` representing a student user.

**Additional attribute:**

* Course

It overrides the `displayUserDetails()` method.

---

## 🧠 OOP Concepts Demonstrated

### Encapsulation

Private attributes are accessed using public getters and setters.

```java
private int bookId;
private String title;
private String author;
private boolean available;
```

### Inheritance

`StudentUser` inherits from the abstract `User` class.

```java
class StudentUser extends User
```

### Abstraction

The `User` class is declared as abstract and contains an abstract method:

```java
abstract void displayUserDetails();
```

### Polymorphism

A `StudentUser` object is referenced using the `User` type:

```java
User u = new StudentUser("Sandhya", 12, "B.Tech");
```

The overridden method is then called through the `User` reference.

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections
* ArrayList
* List

## 📁 Folder Structure

```text
Week 2/
│
├── Student.java
├── Vehicle.java
└── LibraryManagementSystem.java
```

## ▶️ How to Run

1. Open the project in a Java IDE such as Eclipse or IntelliJ IDEA.
2. Open the `Week 2` folder.
3. Compile the required `.java` file.
4. Run the class containing the `main()` method.
5. View the output in the console.

## 👩‍💻 Author

**Sandhya Bharti**

Java & OOP Practice – Week 2

