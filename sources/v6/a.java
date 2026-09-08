package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f47396b = new AtomicInteger();
    public final ThreadFactory f47397c = Executors.defaultThreadFactory();
    public final String f47395a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f47397c.newThread(new o(2, runnable));
        int andIncrement = this.f47396b.getAndIncrement();
        newThread.setName(this.f47395a + "[" + andIncrement + "]");
        return newThread;
    }
}
