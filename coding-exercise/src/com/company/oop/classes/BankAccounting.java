package com.company.oop.classes;

public class BankAccounting {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("Final balance is: " +this.balance);
    }

    public void withdrawFunds(double funds){

        if ((this.balance - funds) < 0){
            System.out.println("Not enough balance. Current balance is: " + this.balance);
        } else {
            this.balance -= funds;
            System.out.println("Successfully withdrawn. Current balance is: " + this.balance);
        }

    }
}
