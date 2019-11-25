package com.company;

import java.util.ArrayList;
import java.util.List;

public class Gestor extends FCT {

    Gestor(String nome, int id, int salarioBase) {
        super(nome, id, salarioBase);
    }

    double calcularSalario(String mes) {
        int nrTarefas = 0;
        for(Tarefa t : tarefas) {
            String mesTarefa = t.getMes();
            if(mesTarefa.equals(mes)) {
                nrTarefas++;
            }
        }

        return salarioBase + 0.5 * nrTarefas;
    }



}
