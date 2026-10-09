package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f49118b = new AtomicInteger();
    public final ThreadFactory f49119c = Executors.defaultThreadFactory();
    public final String f49117a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f49119c.newThread(new o(2, runnable));
        int andIncrement = this.f49118b.getAndIncrement();
        newThread.setName(this.f49117a + "[" + andIncrement + "]");
        return newThread;
    }
}
