package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory f57266e = Executors.defaultThreadFactory();
    public final AtomicLong f57267a = new AtomicLong();
    public final String f57268b;
    public final int f57269c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f57268b = str;
        this.f57269c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f57266e.newThread(new u9.f(10, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f57267a.getAndIncrement();
        newThread.setName(this.f57268b + " Thread #" + andIncrement);
        return newThread;
    }
}
