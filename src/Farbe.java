/**
 * Created by oksana.shcherban on 26.06.19.
 */
public abstract class Farbe implements IBild {
    private IBild bild;

    public Farbe(IBild bild) {
        this.bild = bild;
    }

    public void erstellen() {
        bild.erstellen();
    }
}
