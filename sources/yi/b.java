package yi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f61309a = d.getAndIncrement();
    public final long f61310b = SystemClock.elapsedRealtime();
    public final f f61311c;

    public b(f fVar) {
        this.f61311c = fVar;
    }

    public final void a(String str, Throwable th2) {
        this.f61311c.F("AudioRecorder[" + this.f61309a + "] t+" + (SystemClock.elapsedRealtime() - this.f61310b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f61311c.D0("AudioRecorder[" + this.f61309a + "] t+" + (SystemClock.elapsedRealtime() - this.f61310b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
