package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import ti.p;
public final class a implements ThreadFactory {
    public static final ThreadFactory f57161e = Executors.defaultThreadFactory();
    public final AtomicLong f57162a = new AtomicLong();
    public final String f57163b;
    public final int f57164c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f57163b = str;
        this.f57164c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f57161e.newThread(new p(14, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f57162a.getAndIncrement();
        newThread.setName(this.f57163b + " Thread #" + andIncrement);
        return newThread;
    }
}
