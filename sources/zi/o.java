package zi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.a8;
public final class o {
    public static final AtomicLong f62276c = new AtomicLong(1);
    public final long f62277a = f62276c.getAndIncrement();
    public final long f62278b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        a8.d(c() + str + ": " + th2);
        a8.g(th2, true);
    }

    public final void b(String str) {
        a8.b(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f62277a + "] t+" + (SystemClock.elapsedRealtime() - this.f62278b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
