package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.x1;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f41366a = new AtomicLong();
    public final String f41367b;
    public final int f41368c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f41367b = str;
        this.f41368c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new x1(15, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f41366a.getAndIncrement();
        newThread.setName(this.f41367b + " Thread #" + andIncrement);
        return newThread;
    }
}
