package com.jonathan.command;

public class CommandDeposito implements Command {
    private Banco banco;
    private double valor;

    public CommandDeposito(Banco banco, double valor){
        this.banco = banco;
        this.valor = valor;
    }

    @Override
    public double execute() {
        return banco.deposito(valor);
    }
}