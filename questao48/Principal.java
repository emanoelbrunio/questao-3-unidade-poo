package questao48;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import java.util.InputMismatchException;
//Faça um programa para somar dois números:
// O programa deve conter um método int obterIntValido() para receber número inteiro válido
// Enquanto o valor não for um número inteiro, deve-se solicitar um novo número e exibir uma mensagem de erro.
// O método principal deve utilizar obterIntValido para obter os dois operandos da soma


public class Principal {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        boolean cont;
        int numero, numero1, soma;
        do {
            
            try {
                System.out.println("digite o 1 int: ");
                numero = obterIntValido();

                System.out.println("digite o 2 int: ");
                numero1 = obterIntValido();

                soma = numero + numero1;
                System.out.println("Soma: " + soma);
                cont = false;
            }
            catch (RuntimeException e){
                System.out.println("Erro: " + e.getMessage() + "\n");
                
                cont = true;
            }
        } while(cont);

        ent.close();

    }

    public static int obterIntValido(){

        Scanner ent = new Scanner(System.in);
        try {
            System.out.println("Digite um numero: ");
            int numero = ent.nextInt();  
            return numero;
        }

        catch (InputMismatchException inputMismatchException){
            throw new RuntimeErrorException(null, "Numero inteiro nao encotrado, " + inputMismatchException);
        }        
    }
}
