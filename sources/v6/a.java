package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f47976b = new AtomicInteger();
    public final ThreadFactory f47977c = Executors.defaultThreadFactory();
    public final String f47975a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f47977c.newThread(new p(2, runnable));
        int andIncrement = this.f47976b.getAndIncrement();
        newThread.setName(this.f47975a + "[" + andIncrement + "]");
        return newThread;
    }
}
