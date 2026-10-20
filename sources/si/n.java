package si;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f46735c = new AtomicLong(1);
    public final long f46736a = f46735c.getAndIncrement();
    public final long f46737b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f46736a + "] t+" + (SystemClock.elapsedRealtime() - this.f46737b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
