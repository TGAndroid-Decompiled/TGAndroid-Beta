package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f48403b = new AtomicInteger();
    public final ThreadFactory f48404c = Executors.defaultThreadFactory();
    public final String f48402a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f48404c.newThread(new p(2, runnable));
        int andIncrement = this.f48403b.getAndIncrement();
        newThread.setName(this.f48402a + "[" + andIncrement + "]");
        return newThread;
    }
}
