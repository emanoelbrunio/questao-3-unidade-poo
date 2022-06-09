package questao45;
//Escreva um programa que cria um objeto LinkedList de 10 caracteres e, então, cria um segundo objeto LinkedList contendo uma cópia da primeira lista, mas na ordem inversa. Não devem ser utilizados métodos da Java API para realizar a inversão.
public class LinkedList {
    
    private String palavra;

    public LinkedList(String palavra){
        this.palavra = palavra;
    }

    public String inverta (){
        char[] str1 = this.palavra.toCharArray();
        char[] str2 = this.palavra.toCharArray();
        
        int tam = str1.length;
        int aux2 = 0;

        for(int i = tam - 1; i >= 0; i--){
            char aux1 = str1[i];
            str2[aux2] = aux1;
            aux2++;
        }

        this.palavra = new String(str2);
        return new String(str2);
    }
    
    public String toString() {
        String resultado = this.palavra;

        return resultado;
    }
}
