import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Conversao2 {

    public String converterSegundosParaData(long segundos) {
        if (segundos <= 0) {
            return "Tempo digitado inválido.";

            // Formula pronta:

        } else {
            Date data = new Date(segundos * 1000);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

            return sdf.format(data);
        }
    }
}
