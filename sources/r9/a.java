package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.x1;
public final class a implements ThreadFactory {
    public static final ThreadFactory f45939e = Executors.defaultThreadFactory();
    public final AtomicLong f45940a = new AtomicLong();
    public final String f45941b;
    public final int f45942c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f45941b = str;
        this.f45942c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f45939e.newThread(new x1(16, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f45940a.getAndIncrement();
        newThread.setName(this.f45941b + " Thread #" + andIncrement);
        return newThread;
    }
}
