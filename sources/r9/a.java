package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.o1;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f42539a = new AtomicLong();
    public final String f42540b;
    public final int f42541c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f42540b = str;
        this.f42541c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new o1(15, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f42539a.getAndIncrement();
        newThread.setName(this.f42540b + " Thread #" + andIncrement);
        return newThread;
    }
}
