# Lab Abstract Classes

* Part A - Coding Challenge
* Part B - In Class
* Part C - Homework


## Part A

You will be solving the given problem below.

We are looking to write down a list of all possible numbers that can be a
multiple of 3 or 5.
You will be given any number, but to be put on the list the number has to be a non-negative number.

Return true if the given number can be added to the list.

Tip: Think about using the % "mod" operator

Example:

multipleOf(3) --> true

multipleOf(10) --> true

multipleOf(8) --> false

### Submission

Commit and push your solution to GitHub

## Part B

### Step 1

As an Account is a BankAccount it would be better to use the abstract class

* Create the AbstractBankAccount abstract class from
the previous slide in your JavaBank project 
* Update the Account class definition to extend the
abstract class instead of implementing the interface 
* Write and test for your code using the TestBank class!

### Step 2
As an Account is a BankAccount it would be better to use the abstract class

* Update the Account class definition to extend the abstract class instead of implementing the interface

```
public class Account extends AbstractBankAccount{
// class variables
protected String accountName;
protected int accountNum;
protected int balance;

```

* Create a new unit test for Account

```
Bank Name : BaronBank
Account Holder : Elon Musk
Account Number : 44559
Account balance: 1000
```

### Step 3 

Move the instance fields from the Account class to the AbstractBankAccount class

```
abstract public class AbstractBankAccount {
    //Instance Fields
    public final String BANK= "JavaBank";
    protected String accountName;
    protected int accountNum;
    protected int balance;
    abstract public void deposit(int amt);
    abstract public void withdraw(int amt);
    abstract public int getBalance();
    abstract public String getBankName();
}//
```

* Move the relevant getter/setter methods from the Account class to the AbstractBankAccount class
* Move the withdraw method as this executes the same for both Account and CreditAccount classes

```
protected int balance;
abstract public void deposit(int amt);
public String getBankName(){/*code*/}
public String getAccountName(){/*code*/}
public void setAccountName(String name){/*code*/}
public int getAccountNum(){/*code*/}
public void setAccountNum(int num){/*code*/}
public int getBalance(){/*code*/}
public void setBalance(int num){/*code*/}
public void withdraw(int amt ){/*code*/}
```

* Delete the default constructor in the Account class so that you cannot create an empty Account
  object
* Copy the remaining constructor from the Account class into the AbstractBankAccount class Update the constructor name to match the class

```
public AbstractBankAccount(String name, int num, int amt)
{
    accountName=name;
    accountNum=num;
    balance=amt;
}//end constructor method
```

### Step 4

Update the Account constructor to call the super constructor in AbstractBankAccount

* Use the name, num and the result of amt + calculateInitialBonusValue as the arguments

```
public Account(String name, int num, int amt){
    super(name, num, (amt + calculateInitialBonusValue(amt)));
}//end constructor method

```

### Step 5

Update Account class with a static method called `calculateInitialBonusValue`:

* Between $1 and $100 you get $10
* Between $101 and $300 you get $20
* Over $300 you get $30

Create a unit test to evaluate it.

### Step 6

Use the calculateInitialBonusValue method to assign the initial value to the private bonusValue
field

```
public class Account extends AbstractBankAccount{
    private int bonusValue;
    public Account(String name, int num, int amt){
        super(name, num, (amt + calculateInitialBonusValue(amt)));
        bonusValue = calculateInitialBonusValue(amt)
    };
```

### Step 7

If you have an Account that is not a credit account, you will receive an additional 10% of your initial
bonus value added to each deposit over $100

```
public void deposit(int amt){
    if(amt>100){
      balance=balance+(amt + (int)(bonusValue * 0.1));
    }else{
      balance=balance+amt;
    }
}
```

Update Unit Test

### Step 8

* Have the CreditAccount class inherit from AbstractBankAccount instead of Account
* When you extend the abstract class you are required to add the unimplemented methods
* For the AbstractBankAccount class this means that you have to implement a deposit method that accepts an integer parameter and adds it to the current value of the balance

```
@Override
public void deposit(int amt) {
  balance=balance+amt;
}
```

### Step 9

* Update the default constructor to accept parameters for the name, number and initial amount for the credit account
  * This allows the creation of a credit account with the default $100 credit limit

```
public CreditAccount(String name, int num, int amt){
  super(name,num,amt);
  this.creditLimit=100;
}//
```

### Step 10

* A constructor for a basic credit account already exists where a $100 dollar credit limit is assigned
* JavaBank wants to implement a new scheme to make the processing of credit accounts easier:
* If you open a credit account you get a better credit limit depending on the size of your initial deposit:
  * Between $1 and $2000 you get $100 
  * Between $2001 and $4000 you get $200 
  * Over $4000 you get $300
* TASK: Create a static method named calculateCreditLimit that returns an int value that carries out this calculation! 
* Create the unit test

### Step 11

* Update the default constructor to call calculateCreditLimit() to assign a value for the creditLimit instance field

```
// Instance Fields
private int creditLimit;
//default constructor for CreditAccount
public CreditAccount(String name, int num, int amt){
  super(name,num,amt);
  this.creditLimit=calculateCreditLimit(amt);
}//end constructor method
```

### Step 12

* Update the print method in the CreditAccount class so that the output resembles that of the Account class but also displays the credit limit
* Create a unit test

## Part C

You will be solving the given problems below.

### Problem 01
Provided a string, we need you to make x amount of copies of the front of a string.
The front of a string is considered to be the first 3 characters or whatever is there less than the 3 characters.

Return a new string of x copies of the front of the given string.

Example:
```java
frontCopies("Chocolate", 2) --> "ChoCho"
frontCopies("Chocolate", 3) --> "ChoChoCho"
frontCopies("Abc", 3) --> "AbcAbcAbc"
```
### Problem 02
Lets break apart the given words and make new bits. Using those new bits we will put them together to create a new string.

Return a new string made of every other character, but start with the first character.
    
So "Hello" yields "Hllo"

Example:
```java
everyOtherBit("Hello") --> "Hllo"
everyOtherBit("Hi") --> "H"
everyOtherBit("Heeololeo") --> "Hello"
```
### Problem 03
Sam's favorite number is 9. She wants you to count how many occurences of her favorite number that you see within
a given set of numbers.

The sets of number will be provided in an array, return the number of 9's seen in the array.

Example:
```java
favoriteNine([1, 2, 9]) --> 1
favoriteNine([1, 9, 9]) --> 2
favoriteNine([1, 9, 9, 3, 9]) --> 3
```
### Problem 4
You will be provided two strings to compare against each other.
We need you to compare to see if you see a substring in one string, that you see in the same spot in the next string.

So "xxcaazz" and "xxbaaz" yields 3, as you can see "xx", "aa", and "az" substrings appear in the same place in both.
    
Return the number of the positions where they contain the same length 2 substring.

Example:
```java
amIAMatch("xxcaazz", "xxbaaz") --> 3
amIAMatch("abc", "abc") --> 2
amIAMatch("abc", "axc") --> 0
```
### Problem 5
Arnold is all about having goodluck stored around him. He is a pretty lucky guy, and he wants to remain that way.
Arnold heard that the word "yak" is very unlucky. He has a group of pharses he wants to store in his "book of good pharses".

Arnold wants you to look at the given pharses and remove all the "yak", but the "a" can be any character and the "yak"
strings will not overlap.

Return a new string where all the "yak" are removed to keep him a lucky man.

Example:
```java
unluckyYak("yakpak") --> "pak"
unluckyYak("pakyak") --> "pak"
unluckyYak("yak123ya") --> "123ya"
```
### Problem 6
Given an array of numbers, we need you took look to see if it contains a 2, 7, 1 pattern.

Return true if it contains a 2, 7, 1 pattern:
    a value,
    followed by the value plus 5,
    followed by the value minus 1.

Additionally, the 271 counts even if the "1" differs by 2 or less from the correct value.

Example:
```java
pattern271([1, 2, 7, 1]) --> true
pattern271([1, 2, 8, 1]) --> false
pattern271([2, 7, 1]) --> true
```

  

