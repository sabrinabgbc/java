import java.util.Scanner;

public class menu {
    public static float saldo;
    public static int opcao;

    public static void menu(){
    	Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma das op��es a baixo:");
        System.out.println("0. Fim");
        System.out.println("1. Dep�sito");
        System.out.println("2. Saque");
        System.out.println("3. Consulta");
        System.out.println("Opcao:");
    }

    public static void deposito(){
        System.out.println("Voc� entrou no m�todo dep�sito.");
	    float valorDeposito;
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite o valor para depositar: ");
	    valorDeposito = entrada.nextFloat();
	    System.out.println("O dep�sito foi de: " + valorDeposito);
	    saldo = saldo + valorDeposito;
    }

     public static void saque(){
        System.out.println("Voc� entrou no m�todo saque.");
        float valorSaque;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor para retirar: ");
        valorSaque = entrada.nextFloat();
        System.out.println("O valor do saque foi de: " + valorSaque);
        saldo = saldo - valorSaque;
    }

     public static void consulta(){
        System.out.println("Voc� entrou no m�todo consulta.");
        System.out.println(saldo);
    }

    public static void main(String[] args) {
    	 Scanner entrada = new Scanner(System.in);

        do{
            menu();
            opcao = entrada.nextInt();

            switch(opcao){
            case 1:
                deposito();
                break;

            case 2:
                saque();
                break;

            case 3:
                consulta();
                break;

            default:
                System.out.println("Op��o inv�lida.");
            }
        } while(opcao != 0);
    }
}
