package y6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o5.p;
public final class a implements ThreadFactory {
    public final AtomicInteger f60887b = new AtomicInteger();
    public final ThreadFactory f60888c = Executors.defaultThreadFactory();
    public final String f60886a = "GAC_Executor";

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f60888c.newThread(new p(2, runnable));
        int andIncrement = this.f60887b.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f60886a;
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        newThread.setName(sb2.toString());
        return newThread;
    }
}
