package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        Data data = new Data();
        data.ano = 2024;
        data.mes = 9;
        data.dia = 2;
        c1.setTitular("Raul");
        c1.setDataAbertura(data);

        c1.deposito(1000);

        System.out.println(c1.sacar(500));
        System.out.println(c1.recuperaDadosParaImpressao());

        System.out.println(c1.deposito(500));
        System.out.println(c1.deposito(700));

        System.out.println(c1.recuperaDadosParaImpressao());

        System.out.println(c1.getRendimento());


        Conta c2 = new Conta("Raul");
        Data data2 = new Data();
        c2.setDataAbertura(data2);
        System.out.println(c2.recuperaDadosParaImpressao());
        System.out.println("teste");
    }
}
