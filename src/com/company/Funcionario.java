package com.company;

abstract class Funcionario {
    String nome;
    int id;
    int salarioBase;

    abstract double calcularSalario(String mes);

    public Funcionario(String nome, int id, int salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
}
