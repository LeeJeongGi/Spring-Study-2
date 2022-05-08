package pastCampus.hello.design.singleton;

public class SingletonMain {
    public static void main(String[] args) {

        ex01 ex01 = new ex01();
        ex02 ex02 = new ex02();

        SocketClient aClient = ex01.getSocketClient();
        SocketClient bClient = ex02.getSocketClient();

        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
