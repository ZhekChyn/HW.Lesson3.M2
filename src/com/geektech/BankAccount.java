package com.geektech;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double setAmount(double amount) {
        this.amount = amount;
        return amount;
    }

    public void deposit(double sum) {
        setAmount(sum);
        System.out.println("Депозит: " + sum);
    }

    public void WithDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("Недостаточно стредств на счете!", setAmount(amount - getAmount()));
        }
        System.out.println("Остаток на счете: " + (getAmount() - sum));
        setAmount(getAmount() - sum);
    }
}
