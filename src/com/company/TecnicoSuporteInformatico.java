package com.company;

public class TecnicoSuporteInformatico extends Funcionario {

    TecnicoSuporteInformatico(String nome, int id, int salarioBase) {
        super(nome, id, salarioBase);
    }

    double calcularSalario(String mes) {
        return salarioBase;
    }

}
