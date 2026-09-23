package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f42101a = new AtomicLong();
    public final String f42102b;
    public final int f42103c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f42102b = str;
        this.f42103c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new p2.b(10, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f42101a.getAndIncrement();
        newThread.setName(this.f42102b + " Thread #" + andIncrement);
        return newThread;
    }
}
