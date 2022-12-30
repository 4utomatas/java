import java.time.LocalDateTime;

public class PajamuIrasas {
    int id = 0;
    static int counter = 0;
    float suma;
    String kategorija;
    LocalDateTime data;
    boolean pozymisArIBanka;
    String papildomaInfo;
    PajamuIrasas(float sum, String kat, boolean pozymis, String info) {
        counter++;
        id = counter;
        suma = sum;
        kategorija = kat;
        pozymisArIBanka = pozymis;
        papildomaInfo = info;
        data = LocalDateTime.now();
    }
}
