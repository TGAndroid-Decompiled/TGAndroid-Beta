package pi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f45766a = d.getAndIncrement();
    public final long f45767b = SystemClock.elapsedRealtime();
    public final k f45768c;

    public b(k kVar) {
        this.f45768c = kVar;
    }

    public final void a(String str, Throwable th2) {
        this.f45768c.error("AudioRecorder[" + this.f45766a + "] t+" + (SystemClock.elapsedRealtime() - this.f45767b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f45768c.log("AudioRecorder[" + this.f45766a + "] t+" + (SystemClock.elapsedRealtime() - this.f45767b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
