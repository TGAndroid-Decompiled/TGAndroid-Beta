package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p4.z;
public final class a implements ThreadFactory {
    public static final ThreadFactory f59343e = Executors.defaultThreadFactory();
    public final AtomicLong f59344a = new AtomicLong();
    public final String f59345b;
    public final int f59346c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f59345b = str;
        this.f59346c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f59343e.newThread(new z(25, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f59344a.getAndIncrement();
        newThread.setName(this.f59345b + " Thread #" + andIncrement);
        return newThread;
    }
}
