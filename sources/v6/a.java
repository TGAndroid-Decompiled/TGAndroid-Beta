package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f44233b = new AtomicInteger();
    public final ThreadFactory f44234c = Executors.defaultThreadFactory();
    public final String f44232a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f44234c.newThread(new o(2, runnable));
        int andIncrement = this.f44233b.getAndIncrement();
        newThread.setName(this.f44232a + "[" + andIncrement + "]");
        return newThread;
    }
}
