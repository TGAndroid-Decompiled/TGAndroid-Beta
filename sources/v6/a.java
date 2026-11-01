package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f50390b = new AtomicInteger();
    public final ThreadFactory f50391c = Executors.defaultThreadFactory();
    public final String f50389a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f50391c.newThread(new o(2, runnable));
        int andIncrement = this.f50390b.getAndIncrement();
        newThread.setName(this.f50389a + "[" + andIncrement + "]");
        return newThread;
    }
}
