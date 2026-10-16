package s9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.v;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f45045a = new AtomicLong();
    public final String f45046b;
    public final int f45047c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f45046b = str;
        this.f45047c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new v(29, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f45045a.getAndIncrement();
        newThread.setName(this.f45046b + " Thread #" + andIncrement);
        return newThread;
    }
}
