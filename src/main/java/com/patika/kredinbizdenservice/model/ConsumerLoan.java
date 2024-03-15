package com.patika.kredinbizdenservice.model;


import com.patika.kredinbizdenservice.enums.LoanType;

import java.util.List;

public class ConsumerLoan extends Loan {

    private LoanType loanType = LoanType.IHTIYAC_KREDISI;
    private List<Integer> installmentOptions;

    public ConsumerLoan() {

    }

    public ConsumerLoan(double amount, Integer installment, Double interestRate) {
        super(amount, installment, interestRate);
    }

    public ConsumerLoan(int i, int installment, double interestRate) {
    }

    public LoanType getLoanType() {
        return loanType;
    }

    @Override
    void calculate(double amount, int installment) {
        //tc bul, maaşı bul
    }


}
