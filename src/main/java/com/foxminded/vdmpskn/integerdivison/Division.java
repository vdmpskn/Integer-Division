package com.foxminded.vdmpskn.integerdivison;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        DivisionCreator division = new DivisionCreator();
        Scanner scanner = new Scanner(System.in);
        int divident;
        int divisor;

        System.out.print("Write divident: ");
        divident = scanner.nextInt();
        System.out.print("Write divisor: ");
        divisor = scanner.nextInt();

        System.out.println(division.createDivision(divident,divisor));
    }
}