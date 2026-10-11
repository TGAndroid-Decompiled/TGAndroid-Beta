package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.f2;
public final class a implements ThreadFactory {
    public static final ThreadFactory f47222e = Executors.defaultThreadFactory();
    public final AtomicLong f47223a = new AtomicLong();
    public final String f47224b;
    public final int f47225c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f47224b = str;
        this.f47225c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f47222e.newThread(new f2(15, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f47223a.getAndIncrement();
        newThread.setName(this.f47224b + " Thread #" + andIncrement);
        return newThread;
    }
}
