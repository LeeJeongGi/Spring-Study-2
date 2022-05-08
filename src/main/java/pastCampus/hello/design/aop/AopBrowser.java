package pastCampus.hello.design.aop;

import pastCampus.hello.design.proxy.Html;
import pastCampus.hello.design.proxy.IBrowser;

public class AopBrowser implements IBrowser {

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {

        before.run();

        if (html == null) {
            this.html = new Html(url);
            System.out.println("AopBrowser url = " + url);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        after.run();

        System.out.println("Use AopBrowser url = " + url);
        return html;
    }
}
