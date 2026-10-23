package si;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f47171c = new AtomicLong(1);
    public final long f47172a = f47171c.getAndIncrement();
    public final long f47173b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f47172a + "] t+" + (SystemClock.elapsedRealtime() - this.f47173b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
