package t9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import sg.u;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f48726a = new AtomicLong();
    public final String f48727b;
    public final int f48728c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f48727b = str;
        this.f48728c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new u(3, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f48726a.getAndIncrement();
        newThread.setName(this.f48727b + " Thread #" + andIncrement);
        return newThread;
    }
}
