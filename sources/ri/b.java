package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f45791a = d.getAndIncrement();
    public final long f45792b = SystemClock.elapsedRealtime();
    public final h f45793c;

    public b(h hVar) {
        this.f45793c = hVar;
    }

    public final void a(String str, Throwable th2) {
        this.f45793c.error("AudioRecorder[" + this.f45791a + "] t+" + (SystemClock.elapsedRealtime() - this.f45792b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f45793c.log("AudioRecorder[" + this.f45791a + "] t+" + (SystemClock.elapsedRealtime() - this.f45792b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
