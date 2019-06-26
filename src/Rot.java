/**
 * Created by oksana.shcherban on 26.06.19.
 */
public class Rot extends Farbe {

    public Rot(IBild bild) {
        super(bild);
    }
    public void erstellen() {
        super.erstellen();
        einfaerben();
    }

    private void einfaerben() {
        System.out.println("It is red, can you believe it?!");
    }
}
