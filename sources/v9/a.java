package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import ug.t1;
public final class a implements ThreadFactory {
    public static final ThreadFactory f58735e = Executors.defaultThreadFactory();
    public final AtomicLong f58736a = new AtomicLong();
    public final String f58737b;
    public final int f58738c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f58737b = str;
        this.f58738c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f58735e.newThread(new t1(1, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f58736a.getAndIncrement();
        newThread.setName(this.f58737b + " Thread #" + andIncrement);
        return newThread;
    }
}
