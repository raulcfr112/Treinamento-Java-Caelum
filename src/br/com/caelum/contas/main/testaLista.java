package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class testaLista {
    public static void main(String[] args) {
        List<Conta> contas = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            Conta c1 = new ContaCorrente();
            int randomInt = rand.nextInt(1000);
            c1.deposito(randomInt);
            c1.setTitular("sla");
            contas.add(c1);
        }

        for (Conta conta : contas) {
            System.out.println(conta.recuperaDadosParaImpressao());
        }
    }
}
