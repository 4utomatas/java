import java.time.LocalDateTime;

public class PajamuIrasas extends Irasas {
    int pajamuKategorija;
    boolean pozymisArIBanka;
    PajamuIrasas(float sum, int kat, boolean pozymis, String info) {
        super(sum, info);
        pajamuKategorija = kat;
        pozymisArIBanka = pozymis;
    }

    PajamuIrasas(float sum, int kat, boolean pozymis, String info, LocalDateTime dateTime) {
        super(sum, info, dateTime);
        pajamuKategorija = kat;
        pozymisArIBanka = pozymis;
    }

    @Override
    public String toString() {
        return  "P," + getId() +
                "," + pajamuKategorija +
                "," + pozymisArIBanka +
                "," + suma +
                "," + data +
                "," + papildomaInfo + ";\n";
    }
}
