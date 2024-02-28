package br.com.caelum.contas.main;

import java.util.*;

public class DesafiosAvancadosCollections {
    public static void main(String[] args) {
        TreeSet teste = new TreeSet();
        List<Integer> testeArray = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            teste.add(random.nextInt(1000));
            testeArray.add(random.nextInt(1000));
        }
        System.out.println(teste.reversed());
        Collections.sort(testeArray);
        System.out.println(testeArray.reversed());
    }
}
