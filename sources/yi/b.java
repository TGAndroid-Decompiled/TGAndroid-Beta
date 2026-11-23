package yi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f61344a = d.getAndIncrement();
    public final long f61345b = SystemClock.elapsedRealtime();
    public final f f61346c;

    public b(f fVar) {
        this.f61346c = fVar;
    }

    public final void a(String str, Throwable th2) {
        this.f61346c.F("AudioRecorder[" + this.f61344a + "] t+" + (SystemClock.elapsedRealtime() - this.f61345b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f61346c.D0("AudioRecorder[" + this.f61344a + "] t+" + (SystemClock.elapsedRealtime() - this.f61345b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
