package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f45819a = d.getAndIncrement();
    public final long f45820b = SystemClock.elapsedRealtime();
    public final h f45821c;

    public b(h hVar) {
        this.f45821c = hVar;
    }

    public final void a(String str, Throwable th2) {
        this.f45821c.error("AudioRecorder[" + this.f45819a + "] t+" + (SystemClock.elapsedRealtime() - this.f45820b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f45821c.log("AudioRecorder[" + this.f45819a + "] t+" + (SystemClock.elapsedRealtime() - this.f45820b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
