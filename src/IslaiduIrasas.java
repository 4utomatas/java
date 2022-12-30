import java.time.LocalDateTime;

public class IslaiduIrasas {
    int id = 0;
    static int counter = 0;
    float suma;
    int kategorija;
    LocalDateTime dataSuLaiku;
    String atsiskaitymoBudas;
    String papildomaInfo;

    IslaiduIrasas() {
        counter++;
        id = counter;
        dataSuLaiku = LocalDateTime.now();
    }
}
