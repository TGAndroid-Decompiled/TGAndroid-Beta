package ui;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f49918a = d.getAndIncrement();
    public final long f49919b = SystemClock.elapsedRealtime();
    public final g f49920c;

    public b(g gVar) {
        this.f49920c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f49920c.error("AudioRecorder[" + this.f49918a + "] t+" + (SystemClock.elapsedRealtime() - this.f49919b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f49920c.log("AudioRecorder[" + this.f49918a + "] t+" + (SystemClock.elapsedRealtime() - this.f49919b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
