package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f43901b = new AtomicInteger();
    public final ThreadFactory f43902c = Executors.defaultThreadFactory();
    public final String f43900a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f43902c.newThread(new p(2, runnable));
        int andIncrement = this.f43901b.getAndIncrement();
        newThread.setName(this.f43900a + "[" + andIncrement + "]");
        return newThread;
    }
}
