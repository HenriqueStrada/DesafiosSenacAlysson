package com.senac.desafiosjava;

import java.util.Scanner;

public class DesafioTres {

    public static void main(String[] args) {
        String nome;
        int rsUm, rsDois, rsTres;
        int pontuacao = 0;
        Scanner ler = new Scanner (System.in);
        System.out.println("Bem-vindo ao quiz do Henrique atualizado 2023!");
        System.out.println("Digite um nome de jogador:");
        nome = ler.nextLine();
        // correta 2
        System.out.println("""
                Qual a capital da França?
                
                (1) Macedonia
                (2) Paris
                (3) PSG
                (4) Petigatoo
                """);
        rsUm = ler.nextInt();
        ler.nextLine();
        if(rsUm == 2){
            pontuacao++;
            System.out.println("Proxima questao: ");
        }else{
            System.out.println("Proxima questao: ");
        }
        // correta 1
        System.out.println("""
                Quantas copas do mundo o Brasil possui?
                
                (1) cinco
                (2) setenta
                (3) nao sei
                (4) seis
                """);
        rsDois = ler.nextInt();
        ler.nextLine();
        if(rsDois == 1){
            pontuacao++;
            System.out.println("Proxima questao: ");
        }else {
            System.out.println("Proxima questao: ");
        }
        // correta 3
        System.out.println("""
                Agora vamos ver se você tem sorte, chute a resposta
                
                (1) resposta correta
                (2) resposta errada
                (3) resposta meio correta
                (4) resposta meio errada
                """);
        rsTres = ler.nextInt();
        ler.nextLine();

        if(rsTres == 3){
            pontuacao++;
            System.out.println("Analizando pontuacao");
        }else{
            System.out.println("Analizando pontuacao");
        }

        if(pontuacao == 0){
            System.out.println(nome + ": Você teve incriveis zero pontos, errou tudo.");
        }else if(pontuacao == 1){
            System.out.println(nome + ": Acertou uma questao... melhor que nada");
        }else if(pontuacao == 2){
            System.out.println(nome + ": Acertou duas questoes... foi quase!");
        }else if(pontuacao == 3){
            System.out.println(nome + ": Acertou todas as questoes!! parabens.");
        }
    }
}