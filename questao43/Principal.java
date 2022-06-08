package questao43;
//Crie a classe FiguraGeometrica que possui um método abstrato desenha(). Crie também as classes Circulo, Quadrado e Triangulo que são subclasses da classe FiguraGeometrica e implementam o método desenha() apropriado para sua classe. Por fim, crie uma classe Principal com um método main que cria um objeto de cada uma das classes e chama seus respectivos métodos desenha().

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        Triangulo triangulo = new Triangulo(5, 6, 7);
        Quadrado quadrado = new Quadrado(4);

        circulo.desenha();
        triangulo.desenha();
        quadrado.desenha();
    }
}
