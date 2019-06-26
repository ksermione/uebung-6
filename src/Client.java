/**
 * Created by oksana.shcherban on 26.06.19.
 */
public class Client {

    public static void main(String[] args) {
        IBild blackPhoto = new Schwarz(new Foto());
        blackPhoto.erstellen();

        IBild yellowPainting = new Gelb(new Gemaelde());
        yellowPainting.erstellen();
    }
}
