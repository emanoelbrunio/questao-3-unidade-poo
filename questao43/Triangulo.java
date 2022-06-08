package questao43;
//Crie a classe FiguraGeometrica que possui um método abstrato desenha(). Crie também as classes Circulo, Quadrado e Triangulo que são subclasses da classe FiguraGeometrica e implementam o método desenha() apropriado para sua classe. Por fim, crie uma classe Principal com um método main que cria um objeto de cada uma das classes e chama seus respectivos métodos desenha().

public class Triangulo extends FiguraGeometrica{

    private double ladoA;
    private double ladoB;
    private double base;
    private double perimetro;

    public Triangulo (double ladoA, double ladoB, double base){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.base = base;
        this.perimetro = this.ladoA + this.ladoB + base;
    }
    
    @Override
    public void desenha() {
        System.out.println("Aqui é um desenho do triangulo de lado A, B e base: " + this.ladoA + ", " + this.ladoB + ", " + this.base + ", respectivamente, e perímetro "  + this.perimetro + "\n");
        
    }
    
}
