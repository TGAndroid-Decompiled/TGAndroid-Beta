package qi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class l {
    public static final AtomicLong f46804c = new AtomicLong(1);
    public final long f46805a = f46804c.getAndIncrement();
    public final long f46806b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        FileLog.e(c() + str + ": " + th2);
        FileLog.e(th2);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f46805a + "] t+" + (SystemClock.elapsedRealtime() - this.f46806b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
