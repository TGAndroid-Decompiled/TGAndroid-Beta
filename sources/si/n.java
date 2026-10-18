package si;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f46728c = new AtomicLong(1);
    public final long f46729a = f46728c.getAndIncrement();
    public final long f46730b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f46729a + "] t+" + (SystemClock.elapsedRealtime() - this.f46730b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
