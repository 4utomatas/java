import java.time.LocalDateTime;

public class PajamuIrasas {
    int id = 0;
    static int counter = 0;
    float suma;
    int kategorija;
    LocalDateTime data;
    boolean pozymisArIBanka;
    String papildomaInfo;
    PajamuIrasas(float sum, int kat, boolean pozymis, String info) {
        counter++;
        id = counter;
        suma = sum;
        kategorija = kat;
        pozymisArIBanka = pozymis;
        papildomaInfo = info;
        data = LocalDateTime.now();
    }
}
