package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
    private String nome;
    private int numero;
    private List<Conta> contas;
    private Map<String, Conta> contasMapeadas;
//    private int capacidadeArray = 10;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        contas = new ArrayList<>();
        contasMapeadas = new HashMap<>();
    }

//    public void adicionaConta(Conta conta){
//        for (int i = 0; i < contas.length; i++) {
//            if (contas[i] == null){
//                contas[i] = conta;
//                return;
//            }
//        }
//        System.out.println("Array cheia, criando novo array com mais 10 espaços!");
//        criaNovoArrayMaior();
//    }

//    public void mostraContas() {
//        for (int i = 0; i < this.contas.length; i++) {
//            System.out.println(contas[i]);
//        }
//    }
//
//    private void criaNovoArrayMaior(){
//        Conta[] novoArrayConta = new Conta[capacidadeArray + 10];
//        capacidadeArray += 10;
//        for (int i = 0; i < contas.length; i++) {
//            novoArrayConta[i] = this.contas[i];
//        }
//        this.contas = novoArrayConta;
//    }

//    public boolean contem(Conta conta){
//        for (int i = 0; i < contas.length; i++) {
//            if (contas[i] == conta){
//                return true;
//            }
//        }
//        return false;
//    }

    public void adiciona(Conta c){
        contas.add(c);
        contasMapeadas.put(c.getTitular(), c);
    }

    public Conta pega(int x){
        return contas.get(x);
    }

    public int pegaQuantidadeDeContas(){
        return this.contas.size();
    }

    public Conta buscaPorTitular(String nome){
        return contasMapeadas.get(nome);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}
