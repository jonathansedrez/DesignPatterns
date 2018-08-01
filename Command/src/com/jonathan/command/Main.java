package com.jonathan.command;

public class Main {
    public static void main (String [] args){
        BancoController bancoController = new BancoController();
        Banco banco = new Banco();

        bancoController.execute(new CommandDeposito(banco, 500));
        bancoController.execute(new CommandSaque(banco, 100));

        System.out.println(bancoController.getSaldo());
    }
}