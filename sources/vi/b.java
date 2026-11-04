package vi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f56960a = d.getAndIncrement();
    public final long f56961b = SystemClock.elapsedRealtime();
    public final g f56962c;

    public b(g gVar) {
        this.f56962c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f56962c.e("AudioRecorder[" + this.f56960a + "] t+" + (SystemClock.elapsedRealtime() - this.f56961b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f56962c.m("AudioRecorder[" + this.f56960a + "] t+" + (SystemClock.elapsedRealtime() - this.f56961b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
