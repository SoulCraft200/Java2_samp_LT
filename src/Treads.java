public class Treads implements Runnable{
    String name;

    public Treads(String name){
        this.name = name;
    }
    @Override
    public void run() {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i<10;i++){
            System.out.print(name);
        }
    }
}
