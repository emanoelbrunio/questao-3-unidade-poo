package questao40;

// Escreva a classe Politico que herda de uma classe Pessoa e tem um campo adicional para representar o partido do político. Escreva também as classes Prefeito e Governador que herdem da classe Politico e que contenham campos para representar a cidade ou estado governado. Escreva também uma aplicação que demonstre o uso de instâncias destas classes.

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Emanoel", 20, "123456789", "Masculino");

        Politico politico = new Politico("Emanoel Politico", 21, "234567890", "Masculino", "POO 1");

        Prefeito prefeito = new Prefeito("Emanoel Prefeito", 22, "345678901", "Masculino", "POO 2", "Iracema");
        
        Governador governador = new Governador("Emanoel Governador", 22, "345678901", "Masculino", "POO 2", "Ceará");

        System.out.println(pessoa);
        System.out.println();
        System.out.println(politico);
        System.out.println();
        System.out.println(prefeito);
        System.out.println();
        System.out.println(governador);
    }
}
