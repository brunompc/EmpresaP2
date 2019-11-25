package com.company;

public class Main {

    public static void main(String[] args) {

        Empresa e = new Empresa();

        Funcionario f1 = new Gestor("José", 1, 1000);
        Funcionario f2 = new Tarefeiro("Alberto", 2, 505);
        Funcionario f3 = new TecnicoSuporteInformatico("Joana", 3, 800);

        e.contratarFuncionario(f1);
        e.contratarFuncionario(f2);
        e.contratarFuncionario(f3);

        Cliente c1 = new ClienteIndividual("Macdonalds", 123456789, 50500000);

        Cliente c2 = new ClienteEmpresarial("Bugr King", 964535300, 505000001);

        ((ClienteEmpresarial)c2).nomeResponsavel = "Zé Manel";
        ((ClienteEmpresarial)c2).telefoneResponsavel = 999999;

        e.clientes.add(c1); // quebra de encapsulamento
        e.clientes.add(c2);

        e.relatorioClientes();

    }
}
