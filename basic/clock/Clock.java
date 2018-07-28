package clock;
public class Clock {
	private long angle;
	public long calculeAngle(long hours, long minutes) { //m�todo para calcular os graus
		/* L�gica de resolu��o
	    Total: 360 - 360/12 = 30 graus
		ponteiro das horas: 30 graus em 60 minutos ou seja 40 minutos s�o 15 graus
		ponteiro dos minutos: 30 graus em 5 minutos ou seja 6 graus por minuto
        01:00h possui um �ngulo de 360
        00:30h possui um �ngulo de 180 
        00:15h possui um �ngulo de 90 (no e-mail do desafio estava como 45, seria alguma peculiaridade do desafio ou somente erro de digita��o? considerei como a segunda op��o.
        00:00h possui um �ngulo de 0
		*/	
		return (6*minutes)+((hours*60)*6);//aplicando formula para descobrir �ngulo e convertendo horas em minutos
	}
	public long calculeMinuts(long angle) {
		return angle/6; //aplicando formula para descobrir os minutos 
	}
	public void returnAngle(long hours, long minutes) { 
		System.out.println("O �ngulo da hora informada �: " + calculeAngle(hours, minutes) + " graus");
	}
	public void returnMinuts(long angle) { //m�todo para retornar a informa��o ao usu�rio
		System.out.println("Os minutos percorridos pelo �ngulo �: " + calculeMinuts(angle) + " graus");
	}
}
