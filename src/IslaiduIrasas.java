import java.time.LocalDateTime;

public class IslaiduIrasas {
    int id = 0;
    static int counter = 0;
    float suma;
    String kategorija;
    LocalDateTime data;
    String atsiskaitymoBudas;
    String papildomaInfo;

    IslaiduIrasas(float sum, String kat, String budas, String info) {
        counter++;
        id = counter;
        suma = sum;
        kategorija = kat;
        atsiskaitymoBudas = budas;
        papildomaInfo = info;
        data = LocalDateTime.now();
    }

    public String getDisplayString() {
        return this.data + " suma: " + this.suma + "; kategorija: " + this.kategorija + "; atsiskaitymo budas: " + this.atsiskaitymoBudas + "; papildoma informacija: " + this.papildomaInfo;
    }
}
