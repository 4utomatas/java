import java.time.LocalDateTime;
import java.util.Date;

public class PajamuIrasas {
    float suma;
    String kategorija;
    LocalDateTime data;
    boolean pozymisArIBanka;
    String papildomaInfo;
    PajamuIrasas(float sum, String kat, boolean pozymis, String info) {
        suma = sum;
        kategorija = kat;
        pozymisArIBanka = pozymis;
        papildomaInfo = info;
        data = LocalDateTime.now();
    }
}
