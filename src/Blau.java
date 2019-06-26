/**
 * Created by oksana.shcherban on 26.06.19.
 */
public class Blau extends Farbe {

    public Blau(IBild bild) {
        super(bild);
    }
    public void erstellen() {
        super.erstellen();
        einfaerben();
    }

    private void einfaerben() {
        System.out.println("It is blue, can you believe it?!");
    }
}

