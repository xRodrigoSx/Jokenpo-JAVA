package com.mycompany.equipe;

import java.util.Scanner;

public class Equipe {

    public static void main(String[] args) {
       
        int contin1 = 1;
        int contin2 = 1;
        int pont1 = 0;
        int pont2 = 0;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Insira o nome do jogador1 ");
        String nome1= reader.next();
        
        System.out.println("Insira o nome do jogador2");
        String nome2 = reader.next();

        while (contin1 != 0 && contin2 != 0) {
            System.out.println("Escolha sua arma (1 = Pedra; 2 = Papel; 3 = Tesoura) ");
            int opcao1 = reader.nextInt();
            System.out.println("Escolha sua arma (1 = Pedra; 2 = Papel; 3 = Tesoura) ");
            int opcao2 = reader.nextInt();
            
        
                if (opcao1 == 1 & opcao2 == 2) {
                    pont2++;
                } else if (opcao1 == 1 & opcao2 == 3) {
                    pont1++;
                } else if (opcao1 == 2 & opcao2 == 1) {
                    pont1++;
                } else if (opcao1 == 2 & opcao2 == 3) {
                    pont2++;
                } else if (opcao1 == 3 & opcao2 == 1) {
                    pont2++;
                } else if (opcao1 == 3 & opcao2 == 2) {
                    pont1++;
                } else if (opcao1 == opcao2){
                    System.out.println("Rodada empatada");
                } else {
                    System.out.println("opção inválida");
                }
            
            System.out.println("PLACAR \n");
            System.out.println(nome1+": " + pont1);
            System.out.println(nome2+": " + pont2);
            System.out.println("Quer continuar jogando? (0 = não; 1 = sim)");
            contin1 = reader.nextInt();
            System.out.println("Quer continuar jogando? (0 = não; 1 = sim) ");
            contin2 = reader.nextInt();
        }

        if (pont1 > pont2) {
            System.out.println(nome1+" é o vencedor");
        } else {
            System.out.println(nome2+" é o vencedor");
        }
        System.out.println("Obrigado por jogar");
}
}
