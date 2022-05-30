package questao39;
/* Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as diferenças entre as duas classes, e que campos elas têm em comum? Defina os atributos de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas.
*/
public class LivroLivraria extends Livro {

    private double preco;
    private int quantidade;

    LivroLivraria(String autor, String editora, String nome, String categoria, int edicao, int ano, double preco, int quantidade) {

        super(autor, editora, nome, categoria, edicao, ano);

        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
		String resultado = super.toString();

		resultado += "Quantidade: " +  this.quantidade + "\n";
		resultado += "Preco p/ unidade: R$ " +  this.preco + "\n";
		return resultado;
	}
   
    
}
