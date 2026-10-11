package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f49207b = new AtomicInteger();
    public final ThreadFactory f49208c = Executors.defaultThreadFactory();
    public final String f49206a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f49208c.newThread(new o(2, runnable));
        int andIncrement = this.f49207b.getAndIncrement();
        newThread.setName(this.f49206a + "[" + andIncrement + "]");
        return newThread;
    }
}
