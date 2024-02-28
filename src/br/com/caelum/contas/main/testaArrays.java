package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class testaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente();
            conta.deposito(i+100);
            contas[i] = conta;
        }
        for (Conta conta : contas) {
            System.out.println(conta.recuperaDadosParaImpressao());
        }
    }
}
