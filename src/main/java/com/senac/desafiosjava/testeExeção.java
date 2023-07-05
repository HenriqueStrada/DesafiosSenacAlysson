package com.senac.desafiosjava;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class testeExeção {
    public static void main(String[] args) {
        System.out.println("Leitura do arquivo");
        File file = new File("C:\\Users\\henrique.strada\\Documents\\senac.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }finally{
            if ( sc != null){
                sc.close();
            }
        }
    }
}
