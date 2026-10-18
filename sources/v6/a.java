package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f47954b = new AtomicInteger();
    public final ThreadFactory f47955c = Executors.defaultThreadFactory();
    public final String f47953a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f47955c.newThread(new p(2, runnable));
        int andIncrement = this.f47954b.getAndIncrement();
        newThread.setName(this.f47953a + "[" + andIncrement + "]");
        return newThread;
    }
}
