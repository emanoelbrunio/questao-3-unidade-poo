package questao45;

//Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então, cria um segundo objeto LinkedList contendo uma cópia da primeira lista, mas na ordem inversa. Não devem ser utilizados métodos da Java API para realizar a inversão.

public class Principal {

    public static void main(String[] args) {
        
        LinkedList palavra = new LinkedList("EMANOEL");

        LinkedList palavraInversa = new LinkedList(palavra.toString());
        
        String novaPalavra = palavraInversa.inverta();

        System.out.println(palavra);
        System.out.println(novaPalavra);
    }
}
