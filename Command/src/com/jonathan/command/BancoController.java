package com.jonathan.command;

import java.util.ArrayList;
import java.util.List;

public class BancoController {

    private static List<Command> historico = new ArrayList<Command>();

    public void execute(Command command){
        historico.add(command);
        command.execute();
    }

    public double getSaldo(){
        double saldo = 0;
        for (Command command : historico) {
            saldo += command.execute();
        }
        return saldo;
    }
}