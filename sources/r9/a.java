package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory f47312e = Executors.defaultThreadFactory();
    public final AtomicLong f47313a = new AtomicLong();
    public final String f47314b;
    public final int f47315c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f47314b = str;
        this.f47315c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f47312e.newThread(new p2.b(15, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f47313a.getAndIncrement();
        newThread.setName(this.f47314b + " Thread #" + andIncrement);
        return newThread;
    }
}
