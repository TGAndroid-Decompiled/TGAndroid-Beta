package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.p1;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f42404a = new AtomicLong();
    public final String f42405b;
    public final int f42406c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f42405b = str;
        this.f42406c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new p1(14, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f42404a.getAndIncrement();
        newThread.setName(this.f42405b + " Thread #" + andIncrement);
        return newThread;
    }
}
