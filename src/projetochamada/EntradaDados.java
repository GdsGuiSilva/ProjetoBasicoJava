/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetochamada;

import java.util.Scanner;

/**
 *
 * @author guilherme.silva
 */
public class EntradaDados {

    Scanner leitor;

    public EntradaDados() {
        leitor = new Scanner(System.in);
    }

    public int LerInteiro(String mensagem) {
        String aux;
        int n = 0;
        boolean ok;
        do {
            ok = true;
            System.out.println(mensagem);
            aux = leitor.next();
            try {
                n = Integer.parseInt(aux);
            } catch (NumberFormatException e) {
                ok = false;
            }
            if (!ok) {
                System.out.println("Valor inválido");
            }
        } while (!ok);
        return n;
    }

    public double LerDouble(String mensagem) {
        String aux;
        double n = 0;
        boolean ok;
        do {
            ok = true;
            System.out.println(mensagem);
            aux = leitor.next();
            try {
                n = Double.parseDouble(aux);
            } catch (NumberFormatException e) {
                ok = false;
            }
            if (!ok) {
                System.out.println("Valor inválido");
            }
        } while (!ok);
        return n;
    }

    public String LerString(String mensagem) {
        String aux;
        System.out.println(mensagem);
        aux = leitor.next();
        return aux;
    }
}