# Documento de Orientação para Executar o Programas em Java


## Funcionalidades

- **Adionar aluno e professor**: Permite cadastrar novos usuário.
- **Mostrar informações aluno e professor**: Permite mostrar os dados cadastrados com o Set.

## Como Compilar e Executar

### Pré-requisitos

1. **Java JDK**: Instale o JAVA JDK, de prefêrencia o 21.
    - Baixe e instale o JDK mais recente do [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).
    - Siga as instruções de instalação conforme seu sistema operacional.
    - Certifique-se que o Java Jdk está instalado. 
2. **Editor de Texto ou IDE**: 
   - Um editor simples como Notepad++ ou uma IDE como IntelliJ IDEA, Eclipse ou NetBeans. Minha recomendação é o IntelliJ IDEA Community Edition. 
    >   <img src="https://yt3.googleusercontent.com/paSsnUNkXmv4O8OnUvjDv1_Vb35kMmnXwosWU7C-idBsqm-xt_NA1XzjZ_Nrmfa1zkMEbr5SqQ=s900-c-k-c0x00ffffff-no-rj" alt="IntelliJ" style="width:100px;height:100px;"></img> <br>
   [site oficial do IntelliJ IDEA ](https://www.jetbrains.com/pt-br/idea/download/)
3. **Ambiente de Execução**:
   - Adicione o diretório `bin` do JDK ao PATH do sistema.
   - Configure a variável `JAVA_HOME` para apontar para o diretório onde o JDK está instalado.
   - Configurar variáveis de ambiente JAVA_HOME e PATH conforme necessário.


### Passos para Compilar e Executar

1. **Clone o Repositório**

```bash
git clone https://github.com/gabrielentediado/java-herance
cd java-herance
java Main
```

## Informações Adicionais

1. **Versões Compatíveis**:
    - Certifique-se de que seu código é compatível com a versão do JDK instalada.

2. **Documentação**:
    - Consulte a [documentação oficial do Java](https://docs.oracle.com/en/java/) para informações detalhadas sobre bibliotecas e métodos.

3. **Erros Comuns**:
    - Verifique se os nomes de arquivo e classe correspondem.
    - Verifique erros de sintaxe e compilação.

# Estrutura do Projeto

>O projeto é composto por várias métodos que realizam operações específicas:

O código Java contém as seguintes classes e métodos principais:

### Classe `Pessoa`

- **Métodos**:
    - `public String getNome()`: Retorna o nome.
    - `public void setNome(String nome)`: Define o nome.
    - `public int getIdade()`: Retorna a idade.
    - `public void setIdade(int idade)`: Define a idade.
    - `void exibirInfo()`: Exibe informações da pessoa.

### Classe `Aluno` (herda de `Pessoa`)

- **Métodos**:
    - `public Aluno(String matricula)`: Construtor que inicializa a matrícula.
    - `@Override void exibirInfo()`: Exibe informações específicas do aluno.

### Classe `Professor` (herda de `Pessoa`)

- **Métodos**:
    - `public Professor(double salario)`: Construtor que inicializa o salário.
    - `@Override void exibirInfo()`: Exibe informações específicas do professor.

### Classe `Main`

- **Método `main(String[] args)`**:
    - Exibe um menu para registrar um professor ou aluno.
    - Coleta e exibe informações usando diálogos `JOptionPane`.

# Desenvolvimento
###### :smile: É UM PROGRAMA BEM SIMPLES, MAS QUE MOSTRA COMO FUNCIONA A HERENÇA NA LINGUAGEM JAVA. 
