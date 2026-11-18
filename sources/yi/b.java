package yi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f61298a = d.getAndIncrement();
    public final long f61299b = SystemClock.elapsedRealtime();
    public final f f61300c;

    public b(f fVar) {
        this.f61300c = fVar;
    }

    public final void a(String str, Throwable th2) {
        this.f61300c.F("AudioRecorder[" + this.f61298a + "] t+" + (SystemClock.elapsedRealtime() - this.f61299b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f61300c.D0("AudioRecorder[" + this.f61298a + "] t+" + (SystemClock.elapsedRealtime() - this.f61299b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
