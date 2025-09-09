package com.package1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);

            System.out.print("Principal:- ");
            double Principal = myObj.nextDouble();

            System.out.print("Annual Interest Rate (%):- ");
            double Intereset = myObj.nextDouble();

            System.out.print("Period (Years):- ");
            int Years = myObj.nextInt();

        double monthlyIntereset = Intereset / 100 / 12 ;

        int Period = Years * 12;
        double finalMonthlyInterset = (monthlyIntereset * Math.pow(1 + monthlyIntereset, Period));

        double bottomAreaTwo = ((Math.pow(1 + monthlyIntereset, Period) - 1));


        double monthlyPayment = Principal * finalMonthlyInterset / bottomAreaTwo ;
        NumberFormat Currency = NumberFormat.getCurrencyInstance();
        String Payment = Currency.format(monthlyPayment);
        System.out.println("Your Monthly Mortgage :- " + Payment);
    }
}
