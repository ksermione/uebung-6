/**
 * Created by oksana.shcherban on 26.06.19.
 */
public class Weiss extends Farbe {

    public Weiss(IBild bild) {
        super(bild);
    }

    public void erstellen() {
        super.erstellen();
        einfaerben();
    }

    private void einfaerben() {
        System.out.println("It is white, can you believe it?!");
    }
}
