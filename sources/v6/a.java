package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f42925b = new AtomicInteger();
    public final ThreadFactory f42926c = Executors.defaultThreadFactory();
    public final String f42924a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f42926c.newThread(new o(2, runnable));
        int andIncrement = this.f42925b.getAndIncrement();
        newThread.setName(this.f42924a + "[" + andIncrement + "]");
        return newThread;
    }
}
