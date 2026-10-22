package si;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f46738c = new AtomicLong(1);
    public final long f46739a = f46738c.getAndIncrement();
    public final long f46740b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f46739a + "] t+" + (SystemClock.elapsedRealtime() - this.f46740b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
