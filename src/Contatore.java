public class Contatore {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public void run(){
        int i=0;
        while (i<5000) {
            increment();
            i++;
        }
    }


    public int getCount() {
        return count;

    }
}
