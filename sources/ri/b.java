package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f46226a = d.getAndIncrement();
    public final long f46227b = SystemClock.elapsedRealtime();
    public final g f46228c;

    public b(g gVar) {
        this.f46228c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f46228c.error("AudioRecorder[" + this.f46226a + "] t+" + (SystemClock.elapsedRealtime() - this.f46227b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f46228c.log("AudioRecorder[" + this.f46226a + "] t+" + (SystemClock.elapsedRealtime() - this.f46227b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
