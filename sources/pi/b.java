package pi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f45771a = d.getAndIncrement();
    public final long f45772b = SystemClock.elapsedRealtime();
    public final l f45773c;

    public b(l lVar) {
        this.f45773c = lVar;
    }

    public final void a(String str, Throwable th2) {
        this.f45773c.error("AudioRecorder[" + this.f45771a + "] t+" + (SystemClock.elapsedRealtime() - this.f45772b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f45773c.log("AudioRecorder[" + this.f45771a + "] t+" + (SystemClock.elapsedRealtime() - this.f45772b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
