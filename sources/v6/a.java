package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f49356b = new AtomicInteger();
    public final ThreadFactory f49357c = Executors.defaultThreadFactory();
    public final String f49355a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f49357c.newThread(new p(2, runnable));
        int andIncrement = this.f49356b.getAndIncrement();
        newThread.setName(this.f49355a + "[" + andIncrement + "]");
        return newThread;
    }
}
