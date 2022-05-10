package pastCampus.hello.design.strategy;

public class strategyMain {
    public static void main(String[] args) {

        Encoder encoder = new Encoder();

        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String baseMsg = encoder.getMessage(message);
        System.out.println("baseMsg = " + baseMsg);

        encoder.setEncodingStrategy(normal);
        String normalMsg = encoder.getMessage(message);
        System.out.println("normalMsg = " + normalMsg);

    }
}
