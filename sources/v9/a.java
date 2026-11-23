package v9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.t1;
public final class a implements ThreadFactory {
    public static final ThreadFactory f59429e = Executors.defaultThreadFactory();
    public final AtomicLong f59430a = new AtomicLong();
    public final String f59431b;
    public final int f59432c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f59431b = str;
        this.f59432c = i7;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f59429e.newThread(new t1(29, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f59430a.getAndIncrement();
        newThread.setName(this.f59431b + " Thread #" + andIncrement);
        return newThread;
    }
}
