package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f50376b = new AtomicInteger();
    public final ThreadFactory f50377c = Executors.defaultThreadFactory();
    public final String f50375a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f50377c.newThread(new o(2, runnable));
        int andIncrement = this.f50376b.getAndIncrement();
        newThread.setName(this.f50375a + "[" + andIncrement + "]");
        return newThread;
    }
}
