package pastCampus.hello.design.singleton;

public class ex02 {

    private SocketClient socketClient;

    public ex02() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
