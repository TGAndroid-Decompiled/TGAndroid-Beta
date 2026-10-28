package ui;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f49953a = d.getAndIncrement();
    public final long f49954b = SystemClock.elapsedRealtime();
    public final g f49955c;

    public b(g gVar) {
        this.f49955c = gVar;
    }

    public final void a(String str, Throwable th2) {
        this.f49955c.error("AudioRecorder[" + this.f49953a + "] t+" + (SystemClock.elapsedRealtime() - this.f49954b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f49955c.log("AudioRecorder[" + this.f49953a + "] t+" + (SystemClock.elapsedRealtime() - this.f49954b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
