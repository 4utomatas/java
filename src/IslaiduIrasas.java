import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas {
    int islaiduKategorija;
    String atsiskaitymoBudas;

    IslaiduIrasas(float sum, int kat, String budas, String info) {
        super(sum, info);
        islaiduKategorija = kat;
        atsiskaitymoBudas = budas;
        papildomaInfo = info;
        data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return  "Id=" + getId() +
                ", islaiduKategorija=" + islaiduKategorija +
                ", atsiskaitymoBudas='" + atsiskaitymoBudas + '\'' +
                ", suma=" + suma +
                ", data=" + data +
                ", papildomaInfo='" + papildomaInfo + '\'';
    }
}
