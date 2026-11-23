package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p4.z;
public final class a implements ThreadFactory {
    public static final ThreadFactory f59347e = Executors.defaultThreadFactory();
    public final AtomicLong f59348a = new AtomicLong();
    public final String f59349b;
    public final int f59350c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f59349b = str;
        this.f59350c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f59347e.newThread(new z(25, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f59348a.getAndIncrement();
        newThread.setName(this.f59349b + " Thread #" + andIncrement);
        return newThread;
    }
}
