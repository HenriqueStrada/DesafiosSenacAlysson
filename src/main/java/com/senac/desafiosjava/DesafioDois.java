package com.senac.desafiosjava;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Escreva 3 produtos e seus respectivos preços:");
        System.out.println("---------------------------------------------");
        System.out.println("Nome do primeiro produto: ");
        String prProduto = ler.nextLine();
        System.out.println("Preço: ");
        Double prPreco = ler.nextDouble();
        ler.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("Nome do segundo produto: ");
        String sgProduto = ler.nextLine();
        System.out.println("Preço: ");
        Double sgPreco = ler.nextDouble();
        ler.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("Nome do terceiro produto: ");
        String trProduto = ler.nextLine();
        System.out.println("Preço: ");
        Double trPreco = ler.nextDouble();
        ler.nextLine();

        System.out.println("""
                ---------------------------------------------
                                    PREÇOS
                ---------------------------------------------
                """);
        System.out.println("Primeiro produto: " + prProduto +"\nValor: " + prPreco);
        System.out.println("---------------------------------------------");
        System.out.println("Segundo produto: " + sgProduto +"\nValor: " + sgPreco);
        System.out.println("---------------------------------------------");
        System.out.println("Terceiro produto: " + trProduto +"\nValor: " + trPreco);

        if (prPreco < sgPreco && prPreco < trPreco){
            System.out.println("O produto: " + prProduto + " Custa: " + prPreco + " e é o mais barato.");
        } else if (sgPreco < prPreco && sgPreco < trPreco){
            System.out.println("O produto: " + sgProduto + " Custa: " + sgPreco + " e é o mais barato.");
        } else if (trPreco < prPreco && trPreco < sgPreco){
            System.out.println("O produto: " + trProduto + " Custa: " + trPreco + " e é o mais barato.");
        }
    }
}
