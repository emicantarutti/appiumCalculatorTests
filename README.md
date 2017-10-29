# appiumCalculatorTests

# Test Suite

This tests are written in Java using 'Appium' as a testing framework. 
The test suite contains six (six) test cases which test the basic functionality of the 'Wonky Calculator'.
Please bear in mind that for the test to run smoothly, an instance of Appium should be up and running!.

### TestNG Suite

The TestNG Suite executes 6 (six) tests to verify the behaviour of the Wonky Calculator.

## Test Suite

The suite has six different test cases:

- CalculatorDivisionTests: This test adds up four units and then divides by two and verifies that the result is actually 2 (two);

- CalculatorMultiplicationTests: This test adds up four units and then multiplies by two and verifies that the result is actually 8 (eight);

- CalculatorPowerTests: This test adds up three units and then powers it by two and verifies that the result is actually 9 (nine);

- CalculatorSquareRootTests: This test adds up two units and then substracts four and verifies that the result is actually -2 (negative two);

- CalculatorSubstractionTests: This test adds up four units, performs the square root on it and verifies that the result is actually 2 (two);

- CalculatorSumTests: This test adds up 10 unitsand verifies that the result is actually 10 (ten);

// Disclaimer: Currently the test that verifies the 'Power by 2' fails due to the functionality is faulty. That functionality, instead of following the formula 'x2 = x * x', is doing 'x2 = x * (x + 1)' //

### Maven Project

This is a maven project, so the test suite can be executed through command line. All you need to execute is:
```
    $mvn test
```
and this will run all the tests.

### TestNG Tests

If you prefer to execute one test at a time, the command that you should execute is 
```
    $mvn test -Dtest='name of the test'.
```
You can execute more than one, separated by comma ','.

If you decide to import the whole maven project to an IDE (Eclipse, for instance), all you have to do, is to run the classes that are in the package 'appium.wonkyCalculatorTests.tests' as 'TestNG test'. Au contraire, if you prefer to run the tests altogether also from the IDE, you can do the same, but running as a 'TestNG Suite' the testng.xml file located under the 'src' folder.

### Structure
#### Set Up Class
The class 'BaseTestSetUp' located under the 'appium.wonkyCalculatorTests.setUp' package, is in charge of recognize the Android emulator and use to APK file directly in it.
#### Page Object class
The class 'ObjectRepository' located under the 'appium.wonkyCalculatorTests.objectModel' package, holds each and every one of the objects that are present within the 'Wonky Calculator' app.
#### Test classes
The test classes located under the 'appium.wonkyCalculatorTests.tests' hold the test cases that verify the correct behaviour of the application.

## Preconditions

The only requirements that you need to run this tests are:
- Maven;
- Appium (up & running);
- Java


