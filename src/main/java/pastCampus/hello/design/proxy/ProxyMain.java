package pastCampus.hello.design.proxy;

public class ProxyMain {
    public static void main(String[] args) {

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();

    }
}
