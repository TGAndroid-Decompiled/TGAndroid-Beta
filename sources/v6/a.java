package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f43855b = new AtomicInteger();
    public final ThreadFactory f43856c = Executors.defaultThreadFactory();
    public final String f43854a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f43856c.newThread(new p(2, runnable));
        int andIncrement = this.f43855b.getAndIncrement();
        newThread.setName(this.f43854a + "[" + andIncrement + "]");
        return newThread;
    }
}
