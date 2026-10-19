package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f47956b = new AtomicInteger();
    public final ThreadFactory f47957c = Executors.defaultThreadFactory();
    public final String f47955a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f47957c.newThread(new p(2, runnable));
        int andIncrement = this.f47956b.getAndIncrement();
        newThread.setName(this.f47955a + "[" + andIncrement + "]");
        return newThread;
    }
}
