package questao42;

//Defina uma classe para conter informações sobre um funcionário de uma empresa (classe Funcionario). Quais são os atributos dessa classe? Inclua entre eles o salário que o funcionário deve receber por hora trabalhada. Implemente, para essa classe, pelo menos dois métodos construtores: um que receba apenas o nome do funcionário e assuma valores padrão para os demais atributos (assuma que o funcionário deve receber dois reais por hora trabalhada); o segundo construtor deve receber, além do nome, o valor que o referido trabalhador deve receber por hora trabalhada. Identifique e implemente demais métodos que achar conveniente para um objeto da classe Funcionario.

public class Funcionario {
    private String nome;
    private double salHoraTrab;
    private double horas;
    private double salario;

    Funcionario(String nome){
        this.nome = nome;
        this.salHoraTrab = 2.0;
        this.horas = 160.0;
    }

    Funcionario (String nome, double salHoraTrab){
        this.nome = nome;
        this.salHoraTrab = salHoraTrab;
        this.horas = 160.0;
    }

    private double calculaSalario (){
        this.salario = this.horas * this.salHoraTrab;

        return this.salario;
    }

    public String toString() {
		String resultado = "";

		resultado += "Nome: " +  this.nome + "\n";
		resultado += "Preço da hora: " +  this.salHoraTrab + "\n";
		resultado += "Horas trabalhadas: " +  this.horas + "\n";
		resultado += "Salario final: " +  calculaSalario() + "\n";

		return resultado;
	}

    
}
