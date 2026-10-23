package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f45805a = d.getAndIncrement();
    public final long f45806b = SystemClock.elapsedRealtime();
    public final g f45807c;

    public b(g gVar) {
        this.f45807c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f45807c.error("AudioRecorder[" + this.f45805a + "] t+" + (SystemClock.elapsedRealtime() - this.f45806b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f45807c.log("AudioRecorder[" + this.f45805a + "] t+" + (SystemClock.elapsedRealtime() - this.f45806b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
