package s9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f46549a = new AtomicLong();
    public final String f46550b;
    public final int f46551c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f46550b = str;
        this.f46551c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new p2.b(17, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f46549a.getAndIncrement();
        newThread.setName(this.f46550b + " Thread #" + andIncrement);
        return newThread;
    }
}
