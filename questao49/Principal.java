package questao49;
import java.util.Scanner;
import javax.management.RuntimeErrorException;
import java.util.InputMismatchException;

//armazene em um vetor os nomes dos meses do ano
// solicite ao usuário que digite um valor inteiro
// mostre o nome do mês correspondente ao número digitado
// trate as exceções geradas pela digitação de valores inválidos para o índice do mês

public class Principal {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        
        try {
            Meses numeroMeses = new Meses(obterIntValido());

            System.out.println("Mes: " + numeroMeses);
        }
        catch (RuntimeException e){
            System.out.println("Erro: " + e.getMessage() + "\n");
        }
        
        ent.close();

    }

    public static int obterIntValido(){

        Scanner ent = new Scanner(System.in);
        try {
            System.out.println("Digite um valor inteiro:");
            int numero = ent.nextInt();  
            return numero;
        }
        catch (InputMismatchException inputMismatchException){
            throw new RuntimeErrorException(null, "Numero inteiro nao encotrado, " + inputMismatchException);
        }        
    }
}
