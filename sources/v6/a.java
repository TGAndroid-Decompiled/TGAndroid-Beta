package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f44225b = new AtomicInteger();
    public final ThreadFactory f44226c = Executors.defaultThreadFactory();
    public final String f44224a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f44226c.newThread(new p(2, runnable));
        int andIncrement = this.f44225b.getAndIncrement();
        newThread.setName(this.f44224a + "[" + andIncrement + "]");
        return newThread;
    }
}
