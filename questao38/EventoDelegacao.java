package questao38;

public class EventoDelegacao {

    private DataHora dataeHora;
    private String tipo;

    public EventoDelegacao (int dia, int mes, int ano, int hora, int minuto){
        dataeHora = new DataHora(dia, mes, ano, hora, minuto);
        this.tipo = "Delegação";
    }
    
    public String toString() {
		String resultado = dataeHora.toString();
		resultado = "Tipo: " +  this.tipo + "\n" + resultado;
		return resultado;
	}

}
