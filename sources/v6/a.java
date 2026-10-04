package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f47847b = new AtomicInteger();
    public final ThreadFactory f47848c = Executors.defaultThreadFactory();
    public final String f47846a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f47848c.newThread(new p(2, runnable));
        int andIncrement = this.f47847b.getAndIncrement();
        newThread.setName(this.f47846a + "[" + andIncrement + "]");
        return newThread;
    }
}
