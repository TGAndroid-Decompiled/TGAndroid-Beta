package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f44654c = new AtomicLong(1);
    public final long f44655a = f44654c.getAndIncrement();
    public final long f44656b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f44655a + "] t+" + (SystemClock.elapsedRealtime() - this.f44656b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
