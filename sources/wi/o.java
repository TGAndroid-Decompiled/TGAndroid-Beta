package wi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.a8;
public final class o {
    public static final AtomicLong f58117c = new AtomicLong(1);
    public final long f58118a = f58117c.getAndIncrement();
    public final long f58119b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        a8.d(c() + str + ": " + th2);
        a8.g(th2, true);
    }

    public final void b(String str) {
        a8.b(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f58118a + "] t+" + (SystemClock.elapsedRealtime() - this.f58119b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
