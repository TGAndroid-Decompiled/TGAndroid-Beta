package w6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f50804b = new AtomicInteger();
    public final ThreadFactory f50805c = Executors.defaultThreadFactory();
    public final String f50803a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f50805c.newThread(new p(2, runnable));
        int andIncrement = this.f50804b.getAndIncrement();
        newThread.setName(this.f50803a + "[" + andIncrement + "]");
        return newThread;
    }
}
