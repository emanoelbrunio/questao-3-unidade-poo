package questao38;

public class EventoHeranca extends DataHora{

    private String tipo;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto) {
        super(dia, mes, ano, hora, minuto);
        this.tipo = "Heranca";
    }

    public String toString() {
		String resultado = super.toString();
        
		resultado = "Tipo: " +  this.tipo + "\n" + resultado;
		return resultado;
	}
    


}
