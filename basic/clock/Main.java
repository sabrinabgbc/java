package clock;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Clock clock = new Clock();
		Scanner keyboard = new Scanner(System.in); 
		int option = 0;
		while (option != 3) {	
			System.out.println("\n1- Calcular �ngulo informando horas \n2- Calcular Minutos informando �ngulo\n3- Sair");
			System.out.println("Digite a op��o desejada: \n");
			option = keyboard.nextInt();
            if (option == 1) {
            	System.out.println("Digite a hora: \n");
                int hours = keyboard.nextInt();
                System.out.println("Agora digite os minutos: \n");
                int minuts = keyboard.nextInt();
            	clock.returnAngle(hours, minuts); /* n�o adicionei o GregorianCalendar pois tive d�vidas: isso seria um tipo? n�o seria v�lido somente para datas? */
            } else if (option == 2) {
            	System.out.println("Digite o �ngulo: \n");
                int angle = keyboard.nextInt();
            	clock.returnMinuts(angle);
            } else {
            	System.out.println("Op��o inv�lida! \n");
            }
		}
	}
}
