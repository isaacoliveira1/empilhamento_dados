package br.edu.ifpr;
/**
 * Aluno: Isaac Nicholas Fonseca de Oliveira
 * Data: 02/12/2020
 * Hora: 22:05
 * Atividade de empilhamento.
 * TADS-2019
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PilhaTests {


    public static void main(String[]args){
        empilhamentoDados();
    }

    public static void empilhamentoDados(){

        Scanner teclado = new Scanner(System.in);
        Pilha pilha;
        List<Float> listaPilha = new ArrayList<>();
        int[] opcoes = {1,2,3,4};
        int opcao= 0;
        float valor=0;
        pilha = new Pilha();

        do {
            System.out.print("(1) Empilhar\n" +
                    "(2) Desempilhar\n" +
                    "(3) Acessar o topo\n" +
                    "(4) Elementos da pilha\n" +
                    "(0) Sair\n"+
                    "Digite a opção desejada: ");
            opcao = Integer.parseInt(teclado.next());
            if (opcao == opcoes[0]) {
                System.out.println("Quantos elementos?");
                opcao = teclado.nextInt();

                for (int  i=0; i<opcao; i++){
                    System.out.println("Insira "+(i+1)+"º elemento");
                    valor = Float.parseFloat(teclado.next());
                    pilha.valorArmazenado(valor);
                    listaPilha.add(valor);
                }
            }else if (opcao == opcoes[1]){
                if(pilha.isEmpty()){
                    System.out.println("Não existem elementos cadastradas, pressione uma tecla para continuar!");
                    teclado.nextLine();
                }else{
                    System.out.println("O valor desempilhado é:"+ pilha.valorRemovido());
                    listaPilha.remove(valor);
                    System.out.println("Pressione um tecla para continuar.");
                    teclado.nextLine();
                }

            }

            else if (opcao == opcoes[2]){
                if(pilha.isEmpty()){
                    System.out.println("Não existem elementos cadastradas, pressione uma tecla para continuar!");
                    teclado.nextLine();
                }else{
                    System.out.println(pilha.valorTopo());
                    System.out.println("Pressione um tecla para continuar.");
                    teclado.nextLine();
                }
            }
            else if(opcao == opcoes[3]){
                if(listaPilha.isEmpty()){
                    System.out.println("Não existem elementos cadastradas, pressione uma tecla para continuar!");
                    teclado.nextLine();
                }else{
                    System.out.println("Elementos empilhados: "+listaPilha+"\n");
                    System.out.println("Pressione um tecla para continuar.");
                    teclado.nextLine();

                }
            }
        } while (opcao != 0);
        System.out.println("Encerrando programa!");
        teclado.close();


    }
}



