package questao43;
//Crie a classe FiguraGeometrica que possui um método abstrato desenha(). Crie também as classes Circulo, Quadrado e Triangulo que são subclasses da classe FiguraGeometrica e implementam o método desenha() apropriado para sua classe. Por fim, crie uma classe Principal com um método main que cria um objeto de cada uma das classes e chama seus respectivos métodos desenha().

public class Circulo extends FiguraGeometrica {

    private double raio;
    private double pi;
    private double circuf;

    public Circulo (double raio){
        this.raio = raio;
        this.pi = 3.14;
        this.circuf = 2 * this.raio * this.pi;
    }

    @Override
    public void desenha() {
        System.out.println("Aqui é um desenho do circulo de raio " + this.raio + " e circuferência " + this.circuf + "\n");
    }
    
}
