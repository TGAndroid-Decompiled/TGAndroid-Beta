package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f46225a = d.getAndIncrement();
    public final long f46226b = SystemClock.elapsedRealtime();
    public final g f46227c;

    public b(g gVar) {
        this.f46227c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f46227c.error("AudioRecorder[" + this.f46225a + "] t+" + (SystemClock.elapsedRealtime() - this.f46226b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f46227c.log("AudioRecorder[" + this.f46225a + "] t+" + (SystemClock.elapsedRealtime() - this.f46226b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
