package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f49120b = new AtomicInteger();
    public final ThreadFactory f49121c = Executors.defaultThreadFactory();
    public final String f49119a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f49121c.newThread(new o(2, runnable));
        int andIncrement = this.f49120b.getAndIncrement();
        newThread.setName(this.f49119a + "[" + andIncrement + "]");
        return newThread;
    }
}
