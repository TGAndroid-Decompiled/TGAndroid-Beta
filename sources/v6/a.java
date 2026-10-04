package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f47856b = new AtomicInteger();
    public final ThreadFactory f47857c = Executors.defaultThreadFactory();
    public final String f47855a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f47857c.newThread(new p(2, runnable));
        int andIncrement = this.f47856b.getAndIncrement();
        newThread.setName(this.f47855a + "[" + andIncrement + "]");
        return newThread;
    }
}
