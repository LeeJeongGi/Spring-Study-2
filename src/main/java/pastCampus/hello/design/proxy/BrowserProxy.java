package pastCampus.hello.design.proxy;

public class BrowserProxy implements IBrowser {

    private String url;
    private Html html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {

        if (html == null) {
            this.html = new Html(url);
            System.out.println("Proxy url = " + url);
        }

        System.out.println("Use Proxy url = " + url);
        return html;
    }
}
