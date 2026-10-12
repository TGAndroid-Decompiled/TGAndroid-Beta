package qi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class l {
    public static final AtomicLong f46796c = new AtomicLong(1);
    public final long f46797a = f46796c.getAndIncrement();
    public final long f46798b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        FileLog.e(c() + str + ": " + th2);
        FileLog.e(th2);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f46797a + "] t+" + (SystemClock.elapsedRealtime() - this.f46798b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
