package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.g1;
public final class a implements ThreadFactory {
    public static final ThreadFactory f45032e = Executors.defaultThreadFactory();
    public final AtomicLong f45033a = new AtomicLong();
    public final String f45034b;
    public final int f45035c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f45034b = str;
        this.f45035c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f45032e.newThread(new g1(13, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f45033a.getAndIncrement();
        newThread.setName(this.f45034b + " Thread #" + andIncrement);
        return newThread;
    }
}
