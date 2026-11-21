package yi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f61340a = d.getAndIncrement();
    public final long f61341b = SystemClock.elapsedRealtime();
    public final f f61342c;

    public b(f fVar) {
        this.f61342c = fVar;
    }

    public final void a(String str, Throwable th2) {
        this.f61342c.F("AudioRecorder[" + this.f61340a + "] t+" + (SystemClock.elapsedRealtime() - this.f61341b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f61342c.D0("AudioRecorder[" + this.f61340a + "] t+" + (SystemClock.elapsedRealtime() - this.f61341b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
