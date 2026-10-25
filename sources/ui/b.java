package ui;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f49915a = d.getAndIncrement();
    public final long f49916b = SystemClock.elapsedRealtime();
    public final g f49917c;

    public b(g gVar) {
        this.f49917c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f49917c.error("AudioRecorder[" + this.f49915a + "] t+" + (SystemClock.elapsedRealtime() - this.f49916b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f49917c.log("AudioRecorder[" + this.f49915a + "] t+" + (SystemClock.elapsedRealtime() - this.f49916b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
