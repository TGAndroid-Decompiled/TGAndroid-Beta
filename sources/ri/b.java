package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f44716a = d.getAndIncrement();
    public final long f44717b = SystemClock.elapsedRealtime();
    public final i f44718c;

    public b(i iVar) {
        this.f44718c = iVar;
    }

    public final void a(String str, Throwable th2) {
        this.f44718c.error("AudioRecorder[" + this.f44716a + "] t+" + (SystemClock.elapsedRealtime() - this.f44717b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f44718c.log("AudioRecorder[" + this.f44716a + "] t+" + (SystemClock.elapsedRealtime() - this.f44717b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
