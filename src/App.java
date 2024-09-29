// Classe base Pessoa
class Pessoa {
    // Atributos protegidos para permitir o acesso em outras classes
    protected String nome;
    protected String endereco;
    protected String email;
    
    // Construtor da classe Pessoa
    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    
    // Método que torna como público e imprimi no console as informações da classe
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}

// Classe PessoaFisica que herda de Pessoa
class PessoaFisica extends Pessoa {
    // Atributo CPF exclusivo da classe PessoaFisica
    private String cpf;

    // Construtor dos atributos da classe Pessoa e PessoaFisica
    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email); // Chama o construtor da classe base
        this.cpf = cpf; // Inicializa o CPF
    }

    // Aqui está sobrescrevendo o método exibirInformacoes na classe PessoaFisica
    @Override
    public void exibirInformacoes() {
        // Chama o método da classe base para exibir nome, endereço e email
        super.exibirInformacoes(); 
        // Exibe o CPF
        System.out.println("CPF: " + cpf);
    }
}

// Classe PessoaJuridica que herda de Pessoa, representando as empresas
class PessoaJuridica extends Pessoa {
    // Atributo CNPJ exclusivo da classe PessoaJuridica
    private String cnpj;

    // Construtor dos atributos de Pessoa e PessoaJuridica
    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email); // Chama o construtor da classe base
        this.cnpj = cnpj; // Inicializa o CNPJ
    }

    // Aqui está sobrescrevendo o método exibirInformacoes para incluir o CNPJ
    @Override
    public void exibirInformacoes() {
         // Chama o método da classe base para exibir nome, endereço e email
        super.exibirInformacoes();
        // Exibe o CNPJ
        System.out.println("CNPJ: " + cnpj); 
    }
}

// Classe Funcionario que herda de Pessoa, representando funcionários
class Funcionario extends Pessoa {
    // Atributos CPF e salário exclusivos da classe Funcionario
    private String cpf;
    private double salario;

    // Construtor dos atributos de Pessoa e Funcionario
    public Funcionario(String nome, String endereco, String email, String cpf, double salario) {
        // Chama o construtor da classe base
        super(nome, endereco, email); 
        // Inicializa o CPF
        this.cpf = cpf;
        // Inicializa o salário
        this.salario = salario;
    }

    // Aqui está sobrescrevendo o método exibirInformacoes para incluir CPF e salário
    @Override
    public void exibirInformacoes() {
        // Chama o método da classe base para exibir nome, endereço e email
        super.exibirInformacoes();
        // Exibe o CPF
        System.out.println("CPF: " + cpf); 
        // Exibe o salário
        System.out.println("Salário: R$" + salario);
    }
}

// Classe de teste principal
public class App {
    public static void main(String[] args) {
        // Criando objetos de PessoaFisica e inicializando seus atributos
        PessoaFisica pf1 = new PessoaFisica("Gabriel Alesiunas", "Rua 1, 0", "gabriel@gmail.com", "123.456.789-10");
        PessoaFisica pf2 = new PessoaFisica("Tadeu", "Rua 2, 1", "tadeu@gmail.com", "123.456.789-11");

        // Criando objeto de PessoaJuridica e inicializando seus atributos
        PessoaJuridica pj1 = new PessoaJuridica("Facens", "Av. Sorocaba, 10", "facens@empresa.com", "12.345.678/0001-11");

        // Criando objetos de Funcionario e inicializando seus atributos
        Funcionario func1 = new Funcionario("Jubileu", "Rua 3, 111", "jubileu@gmail.com", "321.654.987-00", 1000.00);
        Funcionario func2 = new Funcionario("Jubiscleia", "Rua 4, 222", "jubiscleia@gmail.com", "654.987.321-00", 2000.00);

        // Exibindo as informações de cada objeto de PessoaFisica
        System.out.println("Informações de Pessoa Física 1:");
        pf1.exibirInformacoes();

        System.out.println("\nInformações de Pessoa Física 2:");
        pf2.exibirInformacoes();

        // Exibindo as informações do objeto de PessoaJuridica
        System.out.println("\nInformações de Pessoa Jurídica:");
        pj1.exibirInformacoes();

        // Exibindo as informações de cada objeto de Funcionario
        System.out.println("\nInformações de Funcionário 1:");
        func1.exibirInformacoes();

        System.out.println("\nInformações de Funcionário 2:");
        func2.exibirInformacoes();
    }
}
