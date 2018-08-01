package com.jonathan.builder;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String nasc;
    private Endereco endereco;

    public Pessoa(PessoaBuilder pessoaBuild){
        this.nome = pessoaBuild.nome;
        this.nasc = pessoaBuild.nasc;
        this.endereco = pessoaBuild.endereco;
    }

    public static class PessoaBuilder {
        private String nome;
        private String nasc;
        private Endereco endereco;

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        public PessoaBuilder nasc(String nasc){
            this.nasc = nasc;
            return this;
        }
        public PessoaBuilder endereco(String rua, String numero, String cidade, String estado){
            this.endereco = new Endereco(rua,numero,cidade,estado);
            return this;
        }
        public Pessoa build(){
            return new Pessoa(this);
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", nasc='" + nasc + '\'' +
                    ", endereco=" + endereco +
                    '}';
        }
    }
}