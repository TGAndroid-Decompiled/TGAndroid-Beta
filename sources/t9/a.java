package t9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f48764a = new AtomicLong();
    public final String f48765b;
    public final int f48766c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f48765b = str;
        this.f48766c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new s9.g(4, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f48764a.getAndIncrement();
        newThread.setName(this.f48765b + " Thread #" + andIncrement);
        return newThread;
    }
}
