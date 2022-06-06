package questao42;
//Defina uma classe para conter informações sobre um funcionário de uma empresa (classe Funcionario). Quais são os atributos dessa classe? Inclua entre eles o salário que o funcionário deve receber por hora trabalhada. Implemente, para essa classe, pelo menos dois métodos construtores: um que receba apenas o nome do funcionário e assuma valores padrão para os demais atributos (assuma que o funcionário deve receber dois reais por hora trabalhada); o segundo construtor deve receber, além do nome, o valor que o referido trabalhador deve receber por hora trabalhada. Identifique e implemente demais métodos que achar conveniente para um objeto da classe Funcionario.
public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Emanoel");
        
        Funcionario funcionario2 = new Funcionario("Emanoel", 19);

        System.out.println(funcionario1);
        System.out.println();
        System.out.println(funcionario2);
    }
}
