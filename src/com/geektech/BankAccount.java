package com.geektech;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum) {
        setAmount(sum);
        System.out.println("Депозит: " + sum);
    }

    public void WithDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("Недостаточно стредств на счете!", getAmount());
        }
        System.out.println("Остаток на счете: " + (getAmount() - sum));
        setAmount(getAmount() - sum);
    }
}
