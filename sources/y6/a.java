package y6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o5.o;
public final class a implements ThreadFactory {
    public final AtomicInteger f58878b = new AtomicInteger();
    public final ThreadFactory f58879c = Executors.defaultThreadFactory();
    public final String f58877a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f58879c.newThread(new o(2, runnable));
        int andIncrement = this.f58878b.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f58877a;
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        newThread.setName(sb2.toString());
        return newThread;
    }
}
