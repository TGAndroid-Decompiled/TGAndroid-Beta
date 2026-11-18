package yi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f61299a = d.getAndIncrement();
    public final long f61300b = SystemClock.elapsedRealtime();
    public final f f61301c;

    public b(f fVar) {
        this.f61301c = fVar;
    }

    public final void a(String str, Throwable th2) {
        this.f61301c.F("AudioRecorder[" + this.f61299a + "] t+" + (SystemClock.elapsedRealtime() - this.f61300b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f61301c.D0("AudioRecorder[" + this.f61299a + "] t+" + (SystemClock.elapsedRealtime() - this.f61300b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
