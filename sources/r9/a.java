package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.f2;
public final class a implements ThreadFactory {
    public static final ThreadFactory f47320e = Executors.defaultThreadFactory();
    public final AtomicLong f47321a = new AtomicLong();
    public final String f47322b;
    public final int f47323c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f47322b = str;
        this.f47323c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f47320e.newThread(new f2(17, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f47321a.getAndIncrement();
        newThread.setName(this.f47322b + " Thread #" + andIncrement);
        return newThread;
    }
}
