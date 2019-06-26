/**
 * Created by oksana.shcherban on 26.06.19.
 */
public class Schwarz extends Farbe {

    public Schwarz(IBild bild) {
        super(bild);
    }
    public void erstellen() {
        super.erstellen();
        einfaerben();
    }

    private void einfaerben() {
        System.out.println("It is black, can you believe it?!");
    }
}
