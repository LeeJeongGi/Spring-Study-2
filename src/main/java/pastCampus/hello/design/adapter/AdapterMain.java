package pastCampus.hello.design.adapter;

public class AdapterMain {
    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();

        Electronic100V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic100V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    public static void connect(Electronic100V electronic100V) {
        electronic100V.powerOn();
    }
}
