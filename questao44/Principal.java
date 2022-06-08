package questao44;

//Crie uma classe Desenho que possui dois atributos do tipo FiguraGeometrica e suas respectivas coordenadas em um plano bidimensional. Escreva um construtor para a classe Desenho que inicialize todos os atributos através dos parâmetros. Implemente também o método apresenta() que, para cada FiguraGeometrica em um Desenho, informa suas coordenadas e a desenha. Por fim, crie uma classe Principal que cria dois objetos do tipo Desenho e chama seu meu método apresenta. O primeiro Desenho deve ser formado por um Circulo e um Quadrado, e o segundo por um Quadrado e um Triangulo.

public class Principal {
    public static void main(String[] args) {

        Desenho obj1 = new Desenho(5, 7, 9, 11);
        Desenho obj2 = new Desenho(15, 17, 19, 21);

        System.out.println("Desenho 1: ");
        System.out.println("Circulo: ");
        obj1.apresentaObj1(); 
        System.out.println("Quadrado: ");
        obj1.apresentaObj2(); 
        
        System.out.println("Desenho 2: ");
        System.out.println("Quadrado: ");
        obj2.apresentaObj1(); 
        System.out.println("Triangulo: ");
        obj2.apresentaObj2(); 

    }
    
}
