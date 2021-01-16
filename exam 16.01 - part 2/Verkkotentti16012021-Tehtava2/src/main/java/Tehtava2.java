public class Tehtava2 {

    public static void main(String[] args) {

        Message v = new Message("localhost","Hello world!");
        Receiver k = new Receiver("K1");
        Repeater r = new Repeater(k);
        r.route(v);

        Receiver k1 = new Receiver("K2");
        Receiver k2 = new Receiver("K3");
        Repeater t1 = new Repeater(k1);
        Repeater t2 = new Repeater(k2);
        Hub h = new Hub();
        h.addRouter(t1);
        h.addRouter(t2);
        h.route(v);
    }
}
