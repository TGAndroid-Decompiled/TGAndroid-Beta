package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p4.o0;
public final class a implements ThreadFactory {
    public static final ThreadFactory f59305e = Executors.defaultThreadFactory();
    public final AtomicLong f59306a = new AtomicLong();
    public final String f59307b;
    public final int f59308c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f59307b = str;
        this.f59308c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f59305e.newThread(new o0(23, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f59306a.getAndIncrement();
        newThread.setName(this.f59307b + " Thread #" + andIncrement);
        return newThread;
    }
}
