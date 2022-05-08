package pastCampus.hello.design.aop;

import pastCampus.hello.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class AopMain {
    public static void main(String[] args) {

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    System.out.println("after");
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });

        aopBrowser.show();
        System.out.println("end.get() = " + end.get());

        aopBrowser.show();
        System.out.println("end.get() = " + end.get());
    }
}
