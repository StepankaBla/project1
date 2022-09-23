package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vítejte v nabídce aplikací!");
        int vyber;
        int score = 0;
        do {
            System.out.println();
            System.out.println("Seznam:");
            System.out.println("1 - Kvíz");
            System.out.println("2 - Obchod");
            System.out.println("3 - Kalkulačka");
            System.out.println("4 - Srovnaní čísel");
            vyber = sc.nextInt();
            sc.nextLine();
            switch (vyber) {
                case 1:
                    System.out.println("Vítejte v KVÍZU");
                    System.out.println("1 - Nejvyšší budova světa je:");
                    System.out.println("1a - Shanghai Tower");
                    System.out.println("1b - CITIC Tower");
                    System.out.println("1c - Central Park Tower");
                    System.out.println("1d - Burdž Chalífa");
                    String odpoved = sc.nextLine();

                    switch (odpoved) {
                        case "1a":
                            System.out.println("spatne");
                            break;
                        case "1b":
                            System.out.println("spatne");
                            break;
                        case "1c":
                            System.out.println("spatne");
                            break;
                        case "1d":
                            System.out.println("spravne");
                            score += 1;
                            break;
                    }
                    ;
                    System.out.println("2 - Kdo navrhnul budovu SPŠMB?");
                    System.out.println("2a - Jiří Kroha");
                    System.out.println("2b - Jan Magasanik");
                    System.out.println("2c - Michal Postránecký");
                    System.out.println("2d - Zdeněk Fránek");
                    String odpoved1 = sc.nextLine();

                    switch (odpoved1) {
                        case "2a":
                            System.out.println("spravne");
                            score += 1;
                            break;
                        case "2b":
                            System.out.println("spatne");
                            break;
                        case "2c":
                            System.out.println("spatne");
                            break;
                        case "2d":
                            System.out.println("spatne");
                            break;
                    }
                    ;
                    System.out.println("3 - Kdy zemřela Alžběta II.");
                    System.out.println("3a - 20.8.2021");
                    System.out.println("3b - 8.9.2022");
                    System.out.println("3c - stále žije");
                    System.out.println("3d - 12.9.2022");
                    String odpoved2 = sc.nextLine();

                    switch (odpoved2) {
                        case "3a":
                            System.out.println("spatne");
                            break;
                        case "3b":
                            System.out.println("spravne");
                            score += 1;
                            break;
                        case "3c":
                            System.out.println("spatne");
                            break;
                        case "3d":
                            System.out.println("spatne");
                            break;
                    }
                    ;
                    System.out.println("4 - V jakém pásu se nachází Evropa?");
                    System.out.println("4a - mírný");
                    System.out.println("4b - subtropický");
                    System.out.println("4c - tropický");
                    System.out.println("4d - polární");
                    String odpoved3 = sc.nextLine();
                    switch (odpoved3) {
                        case "4a":
                            System.out.println("spravne");
                            score += 1;
                            break;
                        case "4b":
                            System.out.println("spatne");
                            break;
                        case "4c":
                            System.out.println("spatne");
                            break;
                        case "4d":
                            System.out.println("spatne");
                            break;
                    }
                    ;
                    System.out.println("5 - Nejvyšší hora Česka");
                    System.out.println("5a - Klínovec");
                    System.out.println("5b - Ještěd");
                    System.out.println("5c - Sněžka");
                    System.out.println("5d - Tanvaldský špičák");
                    String odpoved4 = sc.nextLine();

                    switch (odpoved4) {
                        case "5a":
                            System.out.println("spatne");
                            break;
                        case "5b":
                            System.out.println("spatne");
                            break;
                        case "5c":
                            System.out.println("spravne");
                            score += 1;
                            break;
                        case "5d":
                            System.out.println("spatne");
                            break;
                    }
                    ;
                    System.out.println("Tvoje skore je: " + score);
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Vítejte v OBCHODĚ S OBLEČENÍM");
                    int uctenka = 0;
                    boolean end = false;
                    do {
                        System.out.println();
                        System.out.println("Vyberte si polozku");
                        System.out.println("1 - tričko");
                        System.out.println("2 - kalhoty");
                        System.out.println("3 - boty");
                        System.out.println("4 - zaplatit");
                        int num = sc.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("nabidka");
                                System.out.println("1 - crop top(100,-)");
                                System.out.println("2 - tričko s dlouhým rukávem(200,-)");
                                System.out.println("3 - tílko(90,-)");
                                System.out.println("4 - třičko s potiskem(120,-)");
                                int tricko = sc.nextInt();
                                switch (tricko) {
                                    case 1:
                                        System.out.println("1 - crop top byl vybrana, +100,- k uctu");
                                        uctenka += 100;
                                        break;
                                    case 2:
                                        System.out.println("2 - tričko s dlouhým rukávem bylo vybrano, +200,- k uctu");
                                        uctenka += 200;
                                        break;
                                    case 3:
                                        System.out.println("3 - tilko bylo vybrano, +90,- k uctu");
                                        uctenka += 90;
                                        break;
                                    case 4:
                                        System.out.println("4 - tričko s potiskem bylo vybrano, +120,- k uctu");
                                        uctenka += 120;
                                        break;
                                    default:
                                        System.out.println("neexistuje");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("nabidka");
                                System.out.println("1 - džíny 500,-");
                                System.out.println("2 - kraťasy 300,-");
                                System.out.println("3 - tepláky 400,-");
                                int kalhoty = sc.nextInt();
                                switch (kalhoty) {
                                    case 1:
                                        System.out.println("džíny byly vybrany, +500,- k uctu");
                                        uctenka += 500;
                                        break;
                                    case 2:
                                        System.out.println("kraťasy byly vybrany, +300,- k uctu");
                                        uctenka += 300;
                                        break;
                                    case 3:
                                        System.out.println("teplaky byly vybrana, +400,- k uctu");
                                        uctenka += 400;
                                        break;
                                    default:
                                        System.out.println("neexistuje");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("nabidka");
                                System.out.println("1 - boty na podpatku 400,-");
                                System.out.println("2 - tenisky 500,-");
                                System.out.println("3 - polobotky 300,-");
                                int boty = sc.nextInt();
                                switch (boty) {
                                    case 1:
                                        System.out.println("džíny byly vybrany, +500,- k uctu");
                                        uctenka += 500;
                                        break;
                                    case 2:
                                        System.out.println("kraťasy byly vybrany, +300,- k uctu");
                                        uctenka += 300;
                                        break;
                                    case 3:
                                        System.out.println("teplaky byly vybrana, +400,- k uctu");
                                        uctenka += 400;
                                        break;
                                    default:
                                        System.out.println("neexistuje");
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println("K zaplacení: " + uctenka + ",-");
                                end = true;
                                break;
                            default:
                                System.out.println("neexistuje");
                                break;
                        }
                    }
                    while (!end);
                    break;
                case 3:
                    System.out.println("Vítejte v KALKULAČCE");
                    boolean end1 = false;
                    do {
                        System.out.println("Zadej dvě čísla: ");
                        int num1 = sc.nextInt();
                        int num2 = sc.nextInt();
                        System.out.println("Vyber operací:");
                        System.out.println("1 - Sčítání");
                        System.out.println("2 - Odčítání");
                        System.out.println("3 - Dělení");
                        System.out.println("4 - Násobení");
                        System.out.println("5 - Vypnutí kalkulačky");
                        vyber = sc.nextInt();

                        switch (vyber) {
                            case 1:
                                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                                break;
                            case 2:
                                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                                break;
                            case 3:
                                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                                break;
                            case 4:
                                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                                break;
                            case 5:
                                end1 = true;
                                break;
                            default:
                                System.out.println("Operace neexistuje");
                                break;
                        }
                    } while (!end1);
                    break;
                case 4:
                    System.out.println("Vítejte v SROVNÁVÁNÍ ČÍSEL");
                    System.out.println("Kolik čísel chcete zadat");
                    int pocetCisel = sc.nextInt();
                    System.out.println("Zadejte čísla ke srovnání:");
                    Integer[] velikostArr = new Integer[pocetCisel];
                    for (int i = 0; i < velikostArr.length; i++) {
                        velikostArr[i] = sc.nextInt();
                    }
                    ;
                    Arrays.sort(velikostArr);
                    for (int a : velikostArr) {
                        System.out.print(a + " ");
                    }
                    System.out.println();
                    break;
                default:
                    end = true;
                    break;
            }
        }
        while (5 > vyber);

    }
}
