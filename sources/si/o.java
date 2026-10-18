package si;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class o {
    public static final AtomicLong f46780c = new AtomicLong(1);
    public final long f46781a = f46780c.getAndIncrement();
    public final long f46782b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f46781a + "] t+" + (SystemClock.elapsedRealtime() - this.f46782b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
