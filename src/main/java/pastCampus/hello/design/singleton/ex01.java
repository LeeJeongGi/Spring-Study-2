package pastCampus.hello.design.singleton;

public class ex01 {

    private SocketClient socketClient;

    public ex01() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
