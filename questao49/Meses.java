package questao49;
import javax.management.RuntimeErrorException;

public class Meses {
    private String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junior", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    private int numMes;

    public Meses(int numMes){
        
        if (numMes > 12){
            throw new RuntimeErrorException(null, "Numero de mês não pode ser maior que 12");
        }
        else if (numMes < 1){
            throw new RuntimeErrorException(null, "Numero de mês não pode ser menor que 1");
        }

        this.numMes = numMes;
    }

    public String toString() {
        String resultado = "";

        resultado = meses[numMes-1];
        return resultado;
    }
}
