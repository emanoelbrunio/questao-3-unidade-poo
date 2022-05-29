/* Crie uma classe para representar uma data e um horário (DataHora).

Escreva uma classe EventoDelegacao que seja baseada na classe DataHora e que contenha um campo para indicar qual o evento que ela representa (use uma String para isto). Use o mecanismo de delegação para criar a classe EventoDelegacao.

Escreva uma classe EventoHeranca que seja baseada na classe DataHora e que contenha um campo para indicar qual o evento que ela representa (use uma String para isto). Use o mecanismo de herança para criar a classe EventoHeranca.
Escreva um aplicativo de teste que demonstre o uso das classes criadas
*/

package questao38;

public class Principal {
    public static void main(String [] args) {

        EventoDelegacao evento = new EventoDelegacao(10, 3, 2022, 18, 30);

        EventoHeranca evento1 = new EventoHeranca(15, 03, 2000, 14, 56);
        
        System.out.println(evento);
        System.out.println(evento1);
    }
}





