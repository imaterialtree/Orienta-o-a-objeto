package aplication;

import t2.Data;

import java.util.Scanner;

public class RunData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Data data = new Data();

        System.out.println("Digite o dia");
        data.setDia(sc.nextInt());
        System.out.println("Digite o mês");
        data.setMes(sc.nextInt());
        System.out.println("Digite o ano");
        data.setAno(sc.nextInt());


        System.out.print("A data é ");
        data.displayData();
    }
}
