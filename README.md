# PalindroneCheckerApp
📘 Palindrome Checker App
📌 Overview

The Palindrome Checker App is a console-based Java application designed to validate whether a given string is a palindrome under different conditions.

This README describes Use Case 1 (UC1): Application Entry & Welcome Message, which focuses on displaying the application details at startup.

🎯 Use Case 1: Application Entry & Welcome Message
✅ Goal

Display the application name and version when the program starts.

👤 Actor

User

🔄 Flow

Program starts.

JVM invokes the main() method.

Application name is displayed.

Application version is displayed.

Program continues to next use case or exits.

💡 Key Concepts Used in UC1
🔹 Class

Acts as a container for the Palindrome Checker application logic.

🔹 Main Method

Entry point of the Java application:

public static void main(String[] args)
🔹 Static Keyword

Allows the JVM to invoke the main() method without creating an object.

🔹 Console Output

System.out.println() is used to display messages on the console.

🔹 Application Flow Control

Defines the startup behavior before palindrome processing begins.

📂 File Name
UseCase1PalindromeCheckerApp.java
▶️ How to Compile and Run
Step 1: Compile the Program
javac UseCase1PalindromeCheckerApp.java
Step 2: Run the Program
java UseCase1PalindromeCheckerApp
🖥 Sample Output
=====================================
Welcome to Palindrome Checker App
Version: 1.0
=====================================
📁 Project Structure
PalindromeCheckerApp/
│
├── UseCase1PalindromeCheckerApp.java
└── README.md
🚀 Future Enhancements

Accept user input string

Implement palindrome validation logic

Case-insensitive comparison

Ignore spaces and special characters

Menu-driven console interface

👨‍💻 Author

Yaswanth Reddy Papari