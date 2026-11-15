package yi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f60731a = d.getAndIncrement();
    public final long f60732b = SystemClock.elapsedRealtime();
    public final g f60733c;

    public b(g gVar) {
        this.f60733c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f60733c.F("AudioRecorder[" + this.f60731a + "] t+" + (SystemClock.elapsedRealtime() - this.f60732b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f60733c.D0("AudioRecorder[" + this.f60731a + "] t+" + (SystemClock.elapsedRealtime() - this.f60732b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
