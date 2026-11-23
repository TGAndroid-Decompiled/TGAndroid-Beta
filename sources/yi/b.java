package yi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f61428a = d.getAndIncrement();
    public final long f61429b = SystemClock.elapsedRealtime();
    public final f f61430c;

    public b(f fVar) {
        this.f61430c = fVar;
    }

    public final void a(String str, Throwable th2) {
        this.f61430c.B("AudioRecorder[" + this.f61428a + "] t+" + (SystemClock.elapsedRealtime() - this.f61429b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f61430c.u0("AudioRecorder[" + this.f61428a + "] t+" + (SystemClock.elapsedRealtime() - this.f61429b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
