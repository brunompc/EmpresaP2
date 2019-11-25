package com.company;

public class Tarefeiro extends FCT {

    Tarefeiro(String nome, int id, int salarioBase) {
        super(nome, id, 505);
    }

    double calcularSalario(String mes) {

        int nrHorasTrabalhadas = 0;
        int nrTarefas = 0;

        double bonus = 0;

        if(nrTarefas > 100 && nrHorasTrabalhadas < 75) {

        }

        return 505 * 2 * nrHorasTrabalhadas + bonus;

    }

}
