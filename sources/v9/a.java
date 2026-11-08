package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory f57254e = Executors.defaultThreadFactory();
    public final AtomicLong f57255a = new AtomicLong();
    public final String f57256b;
    public final int f57257c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f57256b = str;
        this.f57257c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f57254e.newThread(new u9.f(9, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f57255a.getAndIncrement();
        newThread.setName(this.f57256b + " Thread #" + andIncrement);
        return newThread;
    }
}
