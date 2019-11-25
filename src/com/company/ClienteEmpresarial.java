package com.company;

public class ClienteEmpresarial extends Cliente {

    String nomeResponsavel;
    int telefoneResponsavel;

    ClienteEmpresarial(String nome, int telefone, int NIF) {
        super(nome, telefone, NIF);
    }

    void mostrarDados() {
        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(NIF);
        System.out.println(nomeResponsavel);
        System.out.println(telefoneResponsavel);
    }
}
