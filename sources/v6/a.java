package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f44173b = new AtomicInteger();
    public final ThreadFactory f44174c = Executors.defaultThreadFactory();
    public final String f44172a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f44174c.newThread(new o(2, runnable));
        int andIncrement = this.f44173b.getAndIncrement();
        newThread.setName(this.f44172a + "[" + andIncrement + "]");
        return newThread;
    }
}
