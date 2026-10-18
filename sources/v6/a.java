package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f48001b = new AtomicInteger();
    public final ThreadFactory f48002c = Executors.defaultThreadFactory();
    public final String f48000a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f48002c.newThread(new p(2, runnable));
        int andIncrement = this.f48001b.getAndIncrement();
        newThread.setName(this.f48000a + "[" + andIncrement + "]");
        return newThread;
    }
}
