package com.senac.desafiosjava;

import java.util.Scanner;

public class DesafioUm {

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        System.out.println("Responda com s [sim] ou n [não]:");
        System.out.println("Você está com fome?");
        String fome = ler.nextLine();
        System.out.println("Você tem dinheiro?");
        String dinheiro = ler.nextLine();
        if (fome.equals("s") && dinheiro.equals("s")) {
            System.out.println("Vá até a padaria da dona juriselda, ela vende uma comida incrivel!");
        }else if (fome.equals("s") && dinheiro.equals("n")) {
            System.out.println("Vá trabalhar vagabundo, ou aposte na blaze com o codigo: RENDAEXTRA!");
        }else if (fome.equals("n") && dinheiro.equals("s")) {
            System.out.println("Compre o curso da Alura e aprofunde seus conhecimentos!");
        }else if (fome.equals("n") && dinheiro.equals("n")){
            System.out.println("Tá fazendo o que aqui home? Vá chifra um barranco");
        }else {
            System.out.println("Pedi para escrever s ou n, e não " + "(fome: " + fome + ") e" + " (dinheiro: " + dinheiro + ") seu palhaço!");
        }
    }
}
