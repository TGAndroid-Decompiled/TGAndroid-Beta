package ri;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f45793a = d.getAndIncrement();
    public final long f45794b = SystemClock.elapsedRealtime();
    public final h f45795c;

    public b(h hVar) {
        this.f45795c = hVar;
    }

    public final void a(String str, Throwable th2) {
        this.f45795c.error("AudioRecorder[" + this.f45793a + "] t+" + (SystemClock.elapsedRealtime() - this.f45794b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f45795c.log("AudioRecorder[" + this.f45793a + "] t+" + (SystemClock.elapsedRealtime() - this.f45794b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
