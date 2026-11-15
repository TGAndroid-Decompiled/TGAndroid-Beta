package zi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.a8;
public final class p {
    public static final AtomicLong f61669c = new AtomicLong(1);
    public final long f61670a = f61669c.getAndIncrement();
    public final long f61671b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        a8.d(c() + str + ": " + th2);
        a8.g(th2, true);
    }

    public final void b(String str) {
        a8.b(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f61670a + "] t+" + (SystemClock.elapsedRealtime() - this.f61671b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
