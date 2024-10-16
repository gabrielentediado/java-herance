import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

class Produto{

    double preco;
    String nome;
    int quantidade_estoque;

    public Produto(String nome, double preco, int quantidade_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public void aplicar_desconto(double percentual){
        double resultado = percentual/100 * preco;
        preco -= resultado;
    }

}

class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDadosCompletos() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
    }
}

class Funcionario extends Pessoa{

    double salario;
    String cargo;

    public Funcionario(String nome, int idade, double salario, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    @Override
    public void exibirDadosCompletos() {
        super.exibirDadosCompletos();
        JOptionPane.showMessageDialog(null, "Salário: " + salario + "\nCargo: " + cargo);

    }
}

class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}

class GerenciadorAlunos {
    private List<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(String nome) {
        alunos.removeIf(aluno -> aluno.getNome().equals(nome));
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Nota: " + aluno.getNota());
        }
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        return soma / alunos.size();
    }
}

abstract class Veiculo{
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo(){

    }
}

class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
}

class Carro extends Veiculo{
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
}

public class Atividade {
    public static void main(String[] args) {
        String menu = JOptionPane.showInputDialog("Menu\nDigite\n'1' -  Exercício 1: Encapsulamento '2'- Exercício 2: Herança");
        int menuInt = Integer.parseInt(menu);
        switch (menuInt){
            case 1:
                String nomeProduto = JOptionPane.showInputDialog("\nQual é o nome do produto? ");
                String precoProduto = JOptionPane.showInputDialog("\nQual é o preço do produto? ");
                int preco = Integer.parseInt(precoProduto);

                String descontoProduto = JOptionPane.showInputDialog("\nQual é o desconto? ex: se 10% digite 10");
                double desconto = Double.parseDouble(descontoProduto);

                Produto produto = new Produto(nomeProduto, preco, 10);
                produto.aplicar_desconto(desconto);

                JOptionPane.showMessageDialog(null, "Preco com desconto:"+ produto.getPreco());
                break;

            case 2:
                String nome = JOptionPane.showInputDialog("Qual é o nome da pessoa?");
                String idadeStr = JOptionPane.showInputDialog("Qual é a idade da pessoa?");
                int idade = Integer.parseInt(idadeStr);

                String salarioStr = JOptionPane.showInputDialog("Qual é o salário do funcionário?");
                double salario = Double.parseDouble(salarioStr);

                String cargo = JOptionPane.showInputDialog("Qual é o cargo do funcionário?");

                Funcionario funcionario = new Funcionario(nome, idade, salario, cargo);

                funcionario.exibirDadosCompletos();
                JOptionPane.showMessageDialog(null, "Salário Anual: " + funcionario.calcularSalarioAnual());
                break;

            case 3:
                GerenciadorAlunos gerenciador = new GerenciadorAlunos();

                gerenciador.adicionarAluno(new Aluno("João", 8.5));
                gerenciador.adicionarAluno(new Aluno("Maria", 9.0));
                gerenciador.adicionarAluno(new Aluno("Pedro", 7.5));

                System.out.println("Lista de alunos:");
                gerenciador.listarAlunos();

                System.out.println("Média das notas: " + gerenciador.calcularMedia());

                gerenciador.removerAluno("Pedro");

                System.out.println("Lista de alunos após remover Pedro:");
                gerenciador.listarAlunos();
                break;
        }
    }
}