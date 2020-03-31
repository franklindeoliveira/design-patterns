import java.util.Calendar;

public class Programa {
	
	public static void main(String[] args) {
		
		RelogioSistema relogio = new RelogioCalendar();
		Calendar hoje = relogio.hoje();
	}

}
