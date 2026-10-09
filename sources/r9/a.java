package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.w1;
public final class a implements ThreadFactory {
    public static final ThreadFactory f47098e = Executors.defaultThreadFactory();
    public final AtomicLong f47099a = new AtomicLong();
    public final String f47100b;
    public final int f47101c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f47100b = str;
        this.f47101c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f47098e.newThread(new w1(13, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f47099a.getAndIncrement();
        newThread.setName(this.f47100b + " Thread #" + andIncrement);
        return newThread;
    }
}
