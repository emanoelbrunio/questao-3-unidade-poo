package questao38;

public class DataHora {

    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;

    DataHora(int dia, int mes, int ano, int hora, int minuto){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String toString() {
		String data = "Data: ";
		String horario = "Horario: ";

        String resultado = "";

		data += this.dia + "/" + this.mes + "/" + this.ano + "\n";
		horario += this.hora + ":" + this.minuto + "\n";
        
        resultado += data + horario;
		return resultado;
	}

}