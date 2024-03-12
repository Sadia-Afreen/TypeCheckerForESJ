# Project 3: Type Checker for Extended Static Java

**Due: March 26, 2024; 11:59pm US Central**


## Problem Description

Your task in this milestone is to extend the Static Java (SJ) type 
checker to handle Extended Static Java (ESJ) programs in 
src/main/java/esjc/type/checker/ExtendedTypeChecker.java

The standard JUnit test suite is provided in 
src/test/java/esjc/test/ExtendedTypeCheckingTest.java. 

Crate P3 and copy resources and src folders to it. Add the same ANLTR and JDT jars to the IntelliJ project for P3,
as well as JUnit4.

As before the grammar and parser files are for SJ, you would have to replace them with those from P2. With
the initial setting ExtendedTypeCheckingTest.java passes 133 tests and fails 52. Your goal is to pass all 185 test cases.

## Hints
=====
* It is a good idea to write the type rule for each new construct in ESJ
  first before implementing it.

* In some cases, you need to override some methods that have already been
  implemented in the SJ TypeChecker, but you should try to reuse them as
  much as you can.

* To resolve field types, use the fieldTypeMap in the ClassType class
  (see the constructor of the ExtendedTypeChecker.Visitor class).

* Use the ExtendedTypeChecker.Visitor.convertType method to convert JDT
  AST Type to SJ/ESJ Type.

## What to submit
* ExtendedStaticJava.g4
* ExtendedStaticJavASTBuilder.java
* ExtendedTypeChecker.java
* ExtendedTypeTable.java
* ExtendedSymbolTable.java
* ExtendedSymbolTableBuilder.java
* report.pdf that documents your experience with Project 3 discussing
  1. What worked
  2. What didn't work
  3. What you've learned
 
## Grading rubric
 * 85*N/185 points for passing N test cases.
 * 15 points for the report, 5 points for each discussion item (one to two 7-8 lines paragraphs)
