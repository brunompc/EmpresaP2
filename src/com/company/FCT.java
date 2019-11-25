package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class FCT extends Funcionario {

    List<Tarefa> tarefas = new ArrayList<>();

    FCT(String nome, int id, int salarioBase) {
        super(nome, id, salarioBase);
    }

    void atribuirTarefa(Tarefa t) {
        tarefas.add(t);
    }

}
