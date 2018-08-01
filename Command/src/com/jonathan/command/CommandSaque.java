package com.jonathan.command;

public class CommandSaque implements Command{
    private Banco banco;
    private double valor;

    public CommandSaque(Banco banco, double valor){
        this.banco = banco;
        this.valor = valor;
    }

    @Override
    public double execute() {
        return banco.saque(valor);
    }
}