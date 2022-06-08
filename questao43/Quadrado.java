package questao43;
//Crie a classe FiguraGeometrica que possui um método abstrato desenha(). Crie também as classes Circulo, Quadrado e Triangulo que são subclasses da classe FiguraGeometrica e implementam o método desenha() apropriado para sua classe. Por fim, crie uma classe Principal com um método main que cria um objeto de cada uma das classes e chama seus respectivos métodos desenha().

public class Quadrado extends FiguraGeometrica {

    private double lado;
    private double perimetro;

    public Quadrado(double lado){
        this.lado = lado;
        this.perimetro = 4 * lado;
    }

    @Override
    public void desenha() {
        System.out.println("Aqui é um desenho do quadrado de lado " + this.lado + " e perimetro " + this.perimetro + "\n");
        
    }
    
}
