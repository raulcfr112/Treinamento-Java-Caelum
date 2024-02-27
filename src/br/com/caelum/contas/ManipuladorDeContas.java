package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

    private Conta conta;

    public void criaConta(Evento evento){
        String tipo = evento.getSelecionadoNoRadio("tipo");
        if (tipo.equals("Conta Corrente")){
            this.conta = new ContaCorrente();
        }else {
            this.conta = new ContaPoupanca();
        }
        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setTitular(evento.getString("titular"));
    }

    public void deposita(Evento evento){
        double valorDigitado = evento.getDouble("valorOperacao");
        this.conta.deposito(valorDigitado);
    }

    public void saca(Evento evento){
        double valorDigitado = evento.getDouble("valorOperacao");
        this.conta.saca(valorDigitado);
    }

    public void transfere(Evento evento){
        double valorDigitado = evento.getDouble("valorTransferencia");
        Conta destinatario = (Conta) evento.getSelecionadoNoCombo("destino");
        this.conta.transfere(valorDigitado, destinatario);
    }

}
