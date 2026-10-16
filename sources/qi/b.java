package qi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f43392a = d.getAndIncrement();
    public final long f43393b = SystemClock.elapsedRealtime();
    public final i f43394c;

    public b(i iVar) {
        this.f43394c = iVar;
    }

    public final void a(String str, Throwable th2) {
        this.f43394c.error("AudioRecorder[" + this.f43392a + "] t+" + (SystemClock.elapsedRealtime() - this.f43393b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f43394c.log("AudioRecorder[" + this.f43392a + "] t+" + (SystemClock.elapsedRealtime() - this.f43393b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
