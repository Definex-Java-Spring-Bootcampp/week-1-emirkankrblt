package com.patika.kredinbizdenservice.model;

import java.math.BigDecimal;

public abstract class Loan implements Product {

    private double amount;
    private Integer installment;
    private Bank bank;
    private Double interestRate;
    // private Campaign campaign; // kampanyalı kredileri üstte çıkart

    //sponsorlu kampanyaları üstte çıkart

    public Loan() {
    }

    public Loan(double amount, Integer installment, Double interestRate) {
        this.amount = amount;
        this.installment = installment;
        this.interestRate = interestRate;
    }

    abstract void calculate(double amount, int installment);

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", installment=" + installment +
                ", bank=" + bank +
                ", interestRate=" + interestRate +
                '}';
    }
}
