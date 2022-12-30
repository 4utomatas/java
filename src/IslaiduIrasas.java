import java.time.LocalDateTime;

public class IslaiduIrasas {
    int id = 0;
    static int counter = 0;
    float suma;
    int kategorija;
    LocalDateTime data;
    String atsiskaitymoBudas;
    String papildomaInfo;

    IslaiduIrasas(float sum, int kat, String budas, String info) {
        counter++;
        id = counter;
        suma = sum;
        kategorija = kat;
        atsiskaitymoBudas = budas;
        papildomaInfo = info;
        data = LocalDateTime.now();
    }
}
