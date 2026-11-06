package wi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.a8;
public final class n {
    public static final AtomicLong f58018c = new AtomicLong(1);
    public final long f58019a = f58018c.getAndIncrement();
    public final long f58020b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        a8.d(c() + str + ": " + th2);
        a8.g(th2, true);
    }

    public final void b(String str) {
        a8.b(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f58019a + "] t+" + (SystemClock.elapsedRealtime() - this.f58020b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
