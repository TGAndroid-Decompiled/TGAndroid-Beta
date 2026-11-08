package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory f57253e = Executors.defaultThreadFactory();
    public final AtomicLong f57254a = new AtomicLong();
    public final String f57255b;
    public final int f57256c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f57255b = str;
        this.f57256c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f57253e.newThread(new u9.f(9, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f57254a.getAndIncrement();
        newThread.setName(this.f57255b + " Thread #" + andIncrement);
        return newThread;
    }
}
