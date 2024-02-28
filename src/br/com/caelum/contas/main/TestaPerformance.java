package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    // tempo com Arraylist = 350 ~

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();

        int total = 100000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        for (Integer elem : teste){
            teste.contains(elem);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo : " + (fim - inicio));
    }
}
