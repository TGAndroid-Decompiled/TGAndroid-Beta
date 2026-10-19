package si;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f46730c = new AtomicLong(1);
    public final long f46731a = f46730c.getAndIncrement();
    public final long f46732b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f46731a + "] t+" + (SystemClock.elapsedRealtime() - this.f46732b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
