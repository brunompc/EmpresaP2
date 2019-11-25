package com.company;

public class Cliente {
    String nome;
    int telefone;
    final int NIF;

    Cliente(String nome, int telefone, int NIF) {
        this.nome = nome;
        this.telefone = telefone;
        this.NIF = NIF;
    }

    void mostrarDados() {
        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(NIF);
    }
}
