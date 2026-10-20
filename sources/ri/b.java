package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f45801a = d.getAndIncrement();
    public final long f45802b = SystemClock.elapsedRealtime();
    public final g f45803c;

    public b(g gVar) {
        this.f45803c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f45803c.error("AudioRecorder[" + this.f45801a + "] t+" + (SystemClock.elapsedRealtime() - this.f45802b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f45803c.log("AudioRecorder[" + this.f45801a + "] t+" + (SystemClock.elapsedRealtime() - this.f45802b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
