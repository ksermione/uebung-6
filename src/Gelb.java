/**
 * Created by oksana.shcherban on 26.06.19.
 */
public class Gelb extends Farbe {

    public Gelb(IBild bild) {
        super(bild);
    }
    public void erstellen() {
        super.erstellen();
        einfaerben();
    }

    private void einfaerben() {
        System.out.println("It is yelow, can you believe it?!");
    }
}
