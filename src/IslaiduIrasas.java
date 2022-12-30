import java.time.LocalDateTime;

public class IslaiduIrasas {
    float suma;
    int kategorija;
    LocalDateTime data;
    String atsiskaitymoBudas;
    String papildomaInfo;

    IslaiduIrasas(float sum, int kat, String budas, String info) {
        suma = sum;
        kategorija = kat;
        atsiskaitymoBudas = budas;
        papildomaInfo = info;
        data = LocalDateTime.now();
    }
}
