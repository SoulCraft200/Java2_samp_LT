public class Bruh {
    public static void main(String[] args) {
        Thread r1 = new Thread(new Treads("T1"));
        Thread r2 = new Thread(new Treads("t2"));
        r1.start();
        r2.start();
    }
}
