package s9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import rh.n;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f48106a = new AtomicLong();
    public final String f48107b;
    public final int f48108c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f48107b = str;
        this.f48108c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new n(19, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f48106a.getAndIncrement();
        newThread.setName(this.f48107b + " Thread #" + andIncrement);
        return newThread;
    }
}
