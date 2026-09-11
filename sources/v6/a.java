package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f47368b = new AtomicInteger();
    public final ThreadFactory f47369c = Executors.defaultThreadFactory();
    public final String f47367a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f47369c.newThread(new o(2, runnable));
        int andIncrement = this.f47368b.getAndIncrement();
        newThread.setName(this.f47367a + "[" + andIncrement + "]");
        return newThread;
    }
}
