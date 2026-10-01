package bai2_10;

public class Main {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();

        SmartLight l1 = new SmartLight("L01", "Den phong khach", 80);
        SmartLight l2 = new SmartLight("L02", "Den ngu");

        l2.setBrightness("ECO");

        l1.connectToHub(hub);
        l2.connectToHub(hub);

        System.out.println(l1.getName() + ": " + l1.getBrightness());
        System.out.println(l2.getName() + ": " + l2.getBrightness());
    }
}
