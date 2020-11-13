package co.com.reto.web.utils.esperaexplicita;

import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static co.com.reto.web.utils.esperaexplicita.Tiempo.successfulCondition;

public class EsperarSegundos {

		public void waitThreeSeconds() {
			try {
				Awaitility.await().forever().pollInterval(3000, TimeUnit.MILLISECONDS).until(successfulCondition());
			} catch (Exception e) {
				e.getMessage();
			}
		}

}
