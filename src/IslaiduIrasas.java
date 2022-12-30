import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas {
    int islaiduKategorija;
    String atsiskaitymoBudas;

    IslaiduIrasas(float sum, int kat, String budas, String info) {
        super(sum, info);
        islaiduKategorija = kat;
        atsiskaitymoBudas = budas;
    }

    IslaiduIrasas(float sum, int kat, String budas, String info, LocalDateTime dateTime) {
        super(sum, info, dateTime);
        islaiduKategorija = kat;
        atsiskaitymoBudas = budas;
    }

    void parse(String line) {


    }

    @Override
    public String toString() {
        return  "I," + getId() +
                "," + islaiduKategorija +
                "," + atsiskaitymoBudas +
                "," + suma +
                "," + data +
                "," + papildomaInfo + ";\n";
    }
}
