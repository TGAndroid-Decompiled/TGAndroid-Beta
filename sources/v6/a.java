package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f44189b = new AtomicInteger();
    public final ThreadFactory f44190c = Executors.defaultThreadFactory();
    public final String f44188a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f44190c.newThread(new o(2, runnable));
        int andIncrement = this.f44189b.getAndIncrement();
        newThread.setName(this.f44188a + "[" + andIncrement + "]");
        return newThread;
    }
}
