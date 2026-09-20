package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.g1;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f42448a = new AtomicLong();
    public final String f42449b;
    public final int f42450c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f42449b = str;
        this.f42450c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new g1(16, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f42448a.getAndIncrement();
        newThread.setName(this.f42449b + " Thread #" + andIncrement);
        return newThread;
    }
}
