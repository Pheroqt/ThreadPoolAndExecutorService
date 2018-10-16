import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker implements Runnable{
    private String name;
    private int taskId;

    public Worker(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Orc worker number " + name + " has started to cut " + taskId + " of tree.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Orc worker number " + name + " has finished to cut " + taskId + " of tree and carried to the orc hold.");
    }

}
