package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.g1;
public final class a implements ThreadFactory {
    public static final ThreadFactory f45059e = Executors.defaultThreadFactory();
    public final AtomicLong f45060a = new AtomicLong();
    public final String f45061b;
    public final int f45062c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f45061b = str;
        this.f45062c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f45059e.newThread(new g1(13, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f45060a.getAndIncrement();
        newThread.setName(this.f45061b + " Thread #" + andIncrement);
        return newThread;
    }
}
