package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f45804a = d.getAndIncrement();
    public final long f45805b = SystemClock.elapsedRealtime();
    public final g f45806c;

    public b(g gVar) {
        this.f45806c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f45806c.error("AudioRecorder[" + this.f45804a + "] t+" + (SystemClock.elapsedRealtime() - this.f45805b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f45806c.log("AudioRecorder[" + this.f45804a + "] t+" + (SystemClock.elapsedRealtime() - this.f45805b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
