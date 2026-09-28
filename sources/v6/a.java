package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f44187b = new AtomicInteger();
    public final ThreadFactory f44188c = Executors.defaultThreadFactory();
    public final String f44186a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f44188c.newThread(new o(2, runnable));
        int andIncrement = this.f44187b.getAndIncrement();
        newThread.setName(this.f44186a + "[" + andIncrement + "]");
        return newThread;
    }
}
