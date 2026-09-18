package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f43933b = new AtomicInteger();
    public final ThreadFactory f43934c = Executors.defaultThreadFactory();
    public final String f43932a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f43934c.newThread(new p(2, runnable));
        int andIncrement = this.f43933b.getAndIncrement();
        newThread.setName(this.f43932a + "[" + andIncrement + "]");
        return newThread;
    }
}
