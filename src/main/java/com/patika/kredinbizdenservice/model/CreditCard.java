package com.patika.kredinbizdenservice.model;

import java.math.BigDecimal;
import java.util.List;

public class CreditCard implements Product{

    private double fee;
    private List<Campaign> campaignList;
    private Bank bank;

    public CreditCard(double fee, List<Campaign> campaignList) {
        this.fee = fee;
        this.campaignList = campaignList;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public List<Campaign> getCampaignList() {
        return campaignList;
    }

    public void setCampaignList(List<Campaign> campaignList) {
        this.campaignList = campaignList;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "fee=" + fee +
                ", campaignList=" + campaignList +
                ", bank=" + bank +
                '}';
    }
}
