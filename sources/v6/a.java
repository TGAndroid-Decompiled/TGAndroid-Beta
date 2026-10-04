package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f47848b = new AtomicInteger();
    public final ThreadFactory f47849c = Executors.defaultThreadFactory();
    public final String f47847a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f47849c.newThread(new p(2, runnable));
        int andIncrement = this.f47848b.getAndIncrement();
        newThread.setName(this.f47847a + "[" + andIncrement + "]");
        return newThread;
    }
}
