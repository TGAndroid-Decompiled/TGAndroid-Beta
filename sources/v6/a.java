package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f44159b = new AtomicInteger();
    public final ThreadFactory f44160c = Executors.defaultThreadFactory();
    public final String f44158a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f44160c.newThread(new o(2, runnable));
        int andIncrement = this.f44159b.getAndIncrement();
        newThread.setName(this.f44158a + "[" + andIncrement + "]");
        return newThread;
    }
}
