import java.time.LocalDateTime;

public class IslaiduIrasas extends Irasas {
    String islaiduKategorija;
    String atsiskaitymoBudas;

    IslaiduIrasas(float sum, String kat, String budas, String info) {
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

    public String getDisplayString() {
        return this.data + " suma: " + this.suma + "; kategorija: " + this.islaiduKategorija + "; atsiskaitymo budas: " + this.atsiskaitymoBudas + "; papildoma informacija: " + this.papildomaInfo;
    }
}
