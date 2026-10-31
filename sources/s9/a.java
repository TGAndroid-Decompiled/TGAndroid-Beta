package s9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import rh.o;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f48095a = new AtomicLong();
    public final String f48096b;
    public final int f48097c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f48096b = str;
        this.f48097c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new o(18, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f48095a.getAndIncrement();
        newThread.setName(this.f48096b + " Thread #" + andIncrement);
        return newThread;
    }
}
