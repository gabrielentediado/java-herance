import javax.swing.JOptionPane;

class Pessoa{
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void exibirInfo(){
        JOptionPane.showMessageDialog(null, "Informações pessoais\nNome: "+nome);
        JOptionPane.showMessageDialog(null, "Informações pessoais\nIdade: :"+idade);
    }
}

class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    @Override
    void exibirInfo() {
        super.exibirInfo();
        JOptionPane.showMessageDialog(null, "Informações pessoais\nMatricula: :"+matricula);
    }
}

class Professor extends Pessoa{
    private double salario;

    public Professor(double salario) {
        this.salario = salario;
    }

    @Override
    void exibirInfo() {
        super.exibirInfo();
        JOptionPane.showMessageDialog(null, "Informações pessoais\nSalário:: :"+salario);

    }
}

public class Main {
    public static void main(String[] args) {
        String menu = JOptionPane.showInputDialog("Menu\nDigite adicionar\n'1' - Registrar com professor\n'2' - Registrar como aluno");
        int menuInt = Integer.parseInt(menu);
        switch (menuInt){
            case 1:
                String nomeProfessor = JOptionPane.showInputDialog("\nQual seu nome: ");
                String IdadeProfessor = JOptionPane.showInputDialog("\nQual a sua idade: ");
                int IdadeProf = Integer.parseInt(IdadeProfessor);
                String SalProfessor = JOptionPane.showInputDialog("\nPretenção salarial: ");
                double Salario = Double.parseDouble(SalProfessor);

                Professor professor = new Professor(Salario);
                professor.setNome(nomeProfessor);
                professor.setIdade(IdadeProf);
                professor.exibirInfo();

                break;
            case 2:
                String nomeAluno = JOptionPane.showInputDialog("Qual seu nome: ");
                String idadeAluno = JOptionPane.showInputDialog("Qual a sua idade: ");
                int idadeAlu = Integer.parseInt(idadeAluno);
                String matricula = JOptionPane.showInputDialog("Número da matrícula: ");

                Aluno aluno = new Aluno(matricula);
                aluno.setNome(nomeAluno);
                aluno.setIdade(idadeAlu);
                aluno.exibirInfo();

                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }

}

