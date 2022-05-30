package questao39;
/* Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as diferenças entre as duas classes, e que campos elas têm em comum? Defina os atributos de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas.
*/
public class LivroBiblioteca extends Livro {

    private int dia;
    private int mes;
    private int hora;
    private int status;
    private boolean empresta;

    LivroBiblioteca(String autor, String editora, String nome, String categoria, int edicao, int ano, int dia, int mes, int hora, int status) {

        super(autor, editora, nome, categoria, edicao, ano);
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.status = status;
    }

    public boolean verificaStatus(){
        if (this.status == 1) {
            this.empresta = true;
        } 
        else {
            this.empresta = false;
        }   
        return this.empresta;   
    }

    public String toString() {
		String resultado = super.toString();

		resultado +=  "Data: " + this.dia + "/" +  this.mes+ ", Hora: " + this.hora + ":00 \n";

        if (verificaStatus()){
            resultado += "Pode emprestar \n";
        }
        else {
            resultado += "Não pode emprestar \n";
        }
		return resultado;
	}
   
    
}
