package s9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f46145a = new AtomicLong();
    public final String f46146b;
    public final int f46147c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f46146b = str;
        this.f46147c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new p2.b(15, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f46145a.getAndIncrement();
        newThread.setName(this.f46146b + " Thread #" + andIncrement);
        return newThread;
    }
}
