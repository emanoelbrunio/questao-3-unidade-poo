package questao39;
/* Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as diferenças entre as duas classes, e que campos elas têm em comum? Defina os atributos de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas.
*/


public class Principal {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria("Emanoel1", "SP", "La POO 1", "Terror", 1, 2020, 10, 3);

        LivroBiblioteca livro1 = new LivroBiblioteca("Emanoel2", "RJ", "La POO 2", "Terror", 2, 2021, 29, 5, 10, 1);
        
        LivroBiblioteca livro2 = new LivroBiblioteca("Emanoel3", "CE", "La POO 3", "Terror", 3, 2022, 30, 06, 11, 0);


        System.out.println(livro);
        System.out.println(livro1);
        System.out.println(livro2);
        
        
        System.out.println("Dados em comum: Dados referentes ao livro, como ano, autor, nome, edicao e etc...");
        
        System.out.println();
        System.out.println();

        System.out.println("Dados diferentes: na classe biblioteca temos os atributos dia, mes, hora, status e empresta, pois asssim conseguimos ver a data e os status se pode emprestar ou nao, já na classe livraria, temos o preço e quantidade, para que assim possamos verificar o preco por unidade e a quantidade disponivel");
        
        System.out.println();
    

    }
}
