package questao39;
/* Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as diferenças entre as duas classes, e que campos elas têm em comum? Defina os atributos de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas.
*/
public class Livro {
    private String autor;
    private String editora;
    private String nome;
    private String categoria;
    private int edicao;
    private int ano;

    Livro(String autor, String editora, String nome, String categoria, int edicao, int ano){
        this.autor = autor;
        this.editora = editora;
        this.nome = nome;
        this.categoria = categoria;
        this.edicao = edicao;
        this.ano = ano;
    }


    public String toString() {

		String resultado = "";
        resultado += "Nome: " + this.nome + "\n";
        resultado += "Autor: " + this.autor + "\n";
        resultado += "Editora: " + this.editora + "\n";
        resultado += "Categoria: " + this.categoria + "\n";
        resultado += "Ediçao: " + this.edicao + "\n";
        resultado += "Ano: " + this.ano + "\n";

		return resultado;
	}
}
