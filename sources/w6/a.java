package w6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import m5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f50801b = new AtomicInteger();
    public final ThreadFactory f50802c = Executors.defaultThreadFactory();
    public final String f50800a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f50802c.newThread(new p(2, runnable));
        int andIncrement = this.f50801b.getAndIncrement();
        newThread.setName(this.f50800a + "[" + andIncrement + "]");
        return newThread;
    }
}
