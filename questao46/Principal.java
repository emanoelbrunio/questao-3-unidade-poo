package questao46;

//Escreva um programa para contar o número de ocorrências de cada letra em uma String. Por exemplo, a string "HELLO THERE" contém dois H s, três E s, dois L s, um O , um T e um R . Exiba os resultados.
public class Principal {

    public static void main(String[] args) {

        String palavra = "HELLO THERE";

        char[] vetCarac = palavra.toCharArray();
        int i, cont = 0, j;

        for (i = 0; i < vetCarac.length; i++){

            cont = contador(vetCarac[i], palavra);

            for(j = i + 1; j < vetCarac.length; j++) {

                if(vetCarac[i] == vetCarac[j]){
                    vetCarac[j] = ' ';  
                } 
            }
           
            if (vetCarac[i] != ' '){
                System.out.println(vetCarac[i] + ": " + cont + " vezes");
            }
            
        }

    }

    public static int contador (char a, String str){

        char[] vetCarac = str.toCharArray();
        int i, cont = 0;

        for (i = 0; i < vetCarac.length; i++){

            if (vetCarac[i] == a){
                cont++;
            }
        }
        return cont;
    }

}
