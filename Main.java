package AppCadastro;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Empresa> empresas = new ListaEncadeada<>();
        ListaEncadeada<Cliente> clientes = new ListaEncadeada<>();
        ListaEncadeada<Funcionario> funcionarios = new ListaEncadeada<>();
        ListaEncadeada<Endereco> enderecos = new ListaEncadeada<>();

        Scanner scanner = new Scanner(System.in); // Inicializa o Scanner
        int idEmpresa = 1;
        int idCliente = 1;
        int idFuncionario = 1;
        int idEndereco = 1;

        try {
            // Simulação do cadastro de Empresa
            System.out.println("Digite o nome da empresa:");
            String nomeEmpresa = scanner.nextLine();
            System.out.println("Digite o CNPJ da empresa:");
            String cnpj = scanner.nextLine();

            Empresa empresa = new Empresa(idEmpresa++, nomeEmpresa, cnpj);
            empresas.adicionar(empresa);
            System.out.println("Empresa cadastrada com sucesso!");

            // Simulação do cadastro de Cliente
            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Digite o sobrenome do cliente:");
            String sobrenomeCliente = scanner.nextLine();
            System.out.println("Digite o email do cliente:");
            String emailCliente = scanner.nextLine();
            System.out.println("Digite o telefone do cliente:");
            String telefoneCliente = scanner.nextLine();
            Date dataNascimento = new Date();  // Data atual como exemplo

            Cliente cliente = new Cliente(idCliente++, nomeCliente, sobrenomeCliente, dataNascimento, emailCliente, telefoneCliente, empresa.getIdEmpresa());
            clientes.adicionar(cliente);
            System.out.println("Cliente cadastrado com sucesso!");

            // Simulação do cadastro de Funcionário
            System.out.println("Digite o nome do funcionário:");
            String nomeFuncionario = scanner.nextLine();
            System.out.println("Digite o cargo do funcionário:");
            String cargoFuncionario = scanner.nextLine();
            System.out.println("Digite o email do funcionário:");
            String emailFuncionario = scanner.nextLine();

            Funcionario funcionario = new Funcionario(idFuncionario++, nomeFuncionario, "Sobrenome", cargoFuncionario, emailFuncionario);
            funcionarios.adicionar(funcionario);
            System.out.println("Funcionário cadastrado com sucesso!");

            // Simulação do cadastro de Endereço
            System.out.println("Digite o logradouro do endereço:");
            String logradouro = scanner.nextLine();
            System.out.println("Digite o número do endereço:");
            String numero = scanner.nextLine();
            System.out.println("Digite o bairro do endereço:");
            String bairro = scanner.nextLine();
            System.out.println("Digite a cidade do endereço:");
            String cidade = scanner.nextLine();
            System.out.println("Digite o estado do endereço:");
            String estado = scanner.nextLine();
            System.out.println("Digite o CEP do endereço:");
            String cep = scanner.nextLine();

            Endereco endereco = new Endereco(idEndereco++, cliente.getIdCliente(), logradouro, numero, "", bairro, cidade, estado, cep);
            enderecos.adicionar(endereco);
            System.out.println("Endereço cadastrado com sucesso!");

            // Exibir os dados cadastrados
            System.out.println("\nEmpresas cadastradas:");
            empresas.exibir();
            System.out.println("\nClientes cadastrados:");
            clientes.exibir();
            System.out.println("\nFuncionários cadastrados:");
            funcionarios.exibir();
            System.out.println("\nEndereços cadastrados:");
            enderecos.exibir();
        } finally {
            // Fechando o Scanner ao final
            if (scanner != null) {
                scanner.close();
                System.out.println("\nScanner fechado.");
            }
        }
    }
}
