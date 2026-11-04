package wi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.a8;
public final class n {
    public static final AtomicLong f57976c = new AtomicLong(1);
    public final long f57977a = f57976c.getAndIncrement();
    public final long f57978b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        a8.d(c() + str + ": " + th2);
        a8.g(th2, true);
    }

    public final void b(String str) {
        a8.b(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f57977a + "] t+" + (SystemClock.elapsedRealtime() - this.f57978b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
