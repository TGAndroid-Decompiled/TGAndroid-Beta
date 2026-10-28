package vi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f50554c = new AtomicLong(1);
    public final long f50555a = f50554c.getAndIncrement();
    public final long f50556b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        FileLog.e(c() + str + ": " + th2);
        FileLog.e(th2);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f50555a + "] t+" + (SystemClock.elapsedRealtime() - this.f50556b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
