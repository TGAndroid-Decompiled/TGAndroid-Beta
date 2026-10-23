package si;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f46739c = new AtomicLong(1);
    public final long f46740a = f46739c.getAndIncrement();
    public final long f46741b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f46740a + "] t+" + (SystemClock.elapsedRealtime() - this.f46741b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
