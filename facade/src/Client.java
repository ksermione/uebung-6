/**
 * Created by oksana.shcherban on 26.06.19.
 */
public class Client {

    public static void main(String[] args) {
        Bewerber bewerberFacade = new Bewerber(3,5,6,2,9,4);
        System.out.println(bewerberFacade.stelltSichVor());
    }
}
