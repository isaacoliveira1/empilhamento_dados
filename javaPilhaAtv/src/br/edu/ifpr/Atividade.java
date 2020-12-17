package br.edu.ifpr;

import javax.swing.*;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Séries");
        int a = tc.nextInt();
        try {
            prec(a);
        } catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null, "Denominador 0");

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Formato incorreto");
        }
    }

    public static double prec(int a) {
        return valorPrec(a, a = 1, a = 1);
    }

    private static double valorPrec(int a, float b, float p) {
        if (a > 0) {
            if (a == 1) {
                System.out.println("Valor da soma: " + p);
            }
            return valorPrec(a - 1, b += 2, p += 1 / b);
        }
        return b;
    }
}