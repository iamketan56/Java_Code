package Lecture1;

public abstract class Account {
    double interestRate;
    double amount; 
    abstract double calculateInterest(double amount)throws InvalidMonthsException,InvalidAgeException,InvalidAmountException ,InvalidDaysException;
}