import com.christeewie.remote.Remote;
import com.christeewie.remote.RemoteController;
import com.christeewie.tv.Tv;

public class RemoteControl {
    boolean running;

    public static void main(String[] args) {
        RemoteControl r = new RemoteControl();

        String[] availableChannels = new String[4];

        availableChannels[0] = "Channel One";
        availableChannels[1] = "Channel Two";
        availableChannels[2] = "Channel Three";
        availableChannels[3] = "Channel Four";

        r.running = true;

        Tv myTv = new Tv(availableChannels);
        Remote myRemote = new Remote(myTv);
        RemoteController remoteController = new RemoteController(myRemote);

        System.out.println("Remote Controll Program");

        // Main Loop
        while (r.running) {
            r.printer(myTv, myRemote);
            System.out.print("> ");
            remoteController.handler();
        }

    }

    // Print Object Layouts
    private void printer(Tv tv, Remote remote) {
        tv.printTv();
        remote.printRemote();
    }

    // TODO Exit Program
    public void exitProgram() {
        this.running = false;
    }
}