package z8;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import xf.o0;
public final class a implements ThreadFactory {
    public static final ThreadFactory f50358e = Executors.defaultThreadFactory();
    public final AtomicLong f50359a = new AtomicLong();
    public final String f50360b;
    public final int f50361c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i9, StrictMode.ThreadPolicy threadPolicy) {
        this.f50360b = str;
        this.f50361c = i9;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f50358e.newThread(new o0(7, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f50359a.getAndIncrement();
        newThread.setName(this.f50360b + " Thread #" + andIncrement);
        return newThread;
    }
}
