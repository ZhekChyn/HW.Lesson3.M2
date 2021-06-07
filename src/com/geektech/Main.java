package com.geektech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount MaratsBankAccount = new BankAccount();

        Scanner scanner = new Scanner(System.in);

        MaratsBankAccount.deposit(20000.00);

        while (true) {
            try {
                System.out.println("Укажите сумму для обналичивания:");
                MaratsBankAccount.WithDraw(Integer.parseInt(scanner.next()));
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("Остаток на счете: " + e.getRemainingAmount());
            }
        }
    }
}