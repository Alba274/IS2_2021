package practica03;

import java.util.Timer;
import java.util.TimerTask;


public class Sonando extends ControladorAlarmas {

	//Gestion del evento temporizado
	protected Timer timer= new Timer();
	protected  AlarmaSonandoTask alarmaSonandoTask;

	public void entryAction(Alarmas context) {
		//programa el evento temporizado
		alarmaSonandoTask = new AlarmaSonandoTask(context);
		timer.schedule(alarmaSonandoTask, 60000);
	}


	public class AlarmaSonandoTask extends TimerTask {

		private Alarmas context;
		public AlarmaSonandoTask(Alarmas a) {
			context = a;
		}

		@Override
		public void run() {
			estadoSonando.exitAction(context);
			context.setState(estadoProgramado);
			estadoProgramado.entryAction(context);
			estadoProgramado.doAction(context);


		}

	}
}