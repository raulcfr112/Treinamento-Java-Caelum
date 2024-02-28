package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
        c1.deposito(10000);

        Conta c2 = new ContaCorrente();
        c2.deposito(3000);

        // cria o mapa
        Map<String, Conta> mapadeContas = new HashMap();

        mapadeContas.put("diretor", c1);
        mapadeContas.put("gerente", c2);
        Conta contaDiretor = mapadeContas.get("diretor");
        System.out.println(contaDiretor.getSaldo());

    }
}
