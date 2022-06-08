package questao44;
//Crie uma classe Desenho que possui dois atributos do tipo FiguraGeometrica e suas respectivas coordenadas em um plano bidimensional. Escreva um construtor para a classe Desenho que inicialize todos os atributos através dos parâmetros. OK

// Implemente também o método apresenta() que, para cada FiguraGeometrica em um Desenho, informa suas coordenadas e a desenha. Por fim, crie uma classe Principal que cria dois objetos do tipo Desenho e chama seu meu método apresenta. O primeiro Desenho deve ser formado por um Circulo e um Quadrado, e o segundo por um Quadrado e um Triangulo.

public class Desenho {  
    private FiguraGeometrica obj1 = new FiguraGeometrica();
    private FiguraGeometrica obj2 = new FiguraGeometrica();

    public Desenho(double x1, double y1, double x2, double y2){
       this.obj1.posX = x1;
       this.obj1.posY = y1;

       this.obj2.posX = x2;
       this.obj2.posY = y2;
    }

    public void apresentaObj1(){
        System.out.println("Coordenadas X, Y: " + this.obj1.posX + ", " + this.obj1.posY);
    }
    public void apresentaObj2(){
        System.out.println("Coordenadas X, Y: " + this.obj2.posX + ", " + this.obj2.posY + "\n\n");
    }
    
}
