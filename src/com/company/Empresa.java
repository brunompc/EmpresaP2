package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Funcionario> funcionarios = new ArrayList<>();
    List<Tarefa> tarefas = new ArrayList<>();;
    List<Cliente> clientes = new ArrayList<>();;

    void contratarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    void relatorioClientes() {
        for(Cliente c : clientes) {
            /*
            System.out.println(c.nome);
            System.out.println(c.telefone);
            System.out.println(c.NIF);
            if(c instanceof ClienteEmpresarial) {
                System.out.println(((ClienteEmpresarial) c).nomeResponsavel);
            }
            */
            c.mostrarDados();
        }
    }

}
