package com.jonathan.builder;

public class Main {
    public static void main (String [] args){
        Pessoa pessoa1 = new Pessoa.PessoaBuilder()
                .nome("teste")
                .nasc("01-01-1996")
                .endereco("rua", "208", "cidade", "estado")
                .build();

        System.out.println(pessoa1.toString());
    }
}
