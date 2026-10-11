package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f49241b = new AtomicInteger();
    public final ThreadFactory f49242c = Executors.defaultThreadFactory();
    public final String f49240a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f49242c.newThread(new o(2, runnable));
        int andIncrement = this.f49241b.getAndIncrement();
        newThread.setName(this.f49240a + "[" + andIncrement + "]");
        return newThread;
    }
}
