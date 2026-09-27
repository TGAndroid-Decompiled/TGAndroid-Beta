package r9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.web.g2;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f42479a = new AtomicLong();
    public final String f42480b;
    public final int f42481c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f42480b = str;
        this.f42481c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new g2(13, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f42479a.getAndIncrement();
        newThread.setName(this.f42480b + " Thread #" + andIncrement);
        return newThread;
    }
}
