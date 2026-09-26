package v6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f44186b = new AtomicInteger();
    public final ThreadFactory f44187c = Executors.defaultThreadFactory();
    public final String f44185a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f44187c.newThread(new o(2, runnable));
        int andIncrement = this.f44186b.getAndIncrement();
        newThread.setName(this.f44185a + "[" + andIncrement + "]");
        return newThread;
    }
}
