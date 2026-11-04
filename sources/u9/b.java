package u9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class b implements ThreadFactory {
    public static final ThreadFactory f55746e = Executors.defaultThreadFactory();
    public final AtomicLong f55747a = new AtomicLong();
    public final String f55748b;
    public final int f55749c;
    public final StrictMode.ThreadPolicy d;

    public b(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        this.f55748b = str;
        this.f55749c = i3;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f55746e.newThread(new a(0, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f55747a.getAndIncrement();
        newThread.setName(this.f55748b + " Thread #" + andIncrement);
        return newThread;
    }
}
