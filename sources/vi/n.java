package vi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f50514c = new AtomicLong(1);
    public final long f50515a = f50514c.getAndIncrement();
    public final long f50516b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f50515a + "] t+" + (SystemClock.elapsedRealtime() - this.f50516b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
