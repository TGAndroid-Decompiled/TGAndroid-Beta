package s9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.g2;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f46117a = new AtomicLong();
    public final String f46118b;
    public final int f46119c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f46118b = str;
        this.f46119c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new g2(16, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f46117a.getAndIncrement();
        newThread.setName(this.f46118b + " Thread #" + andIncrement);
        return newThread;
    }
}
