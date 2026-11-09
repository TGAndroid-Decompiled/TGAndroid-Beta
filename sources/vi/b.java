package vi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import w7.s;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f57535a = d.getAndIncrement();
    public final long f57536b = SystemClock.elapsedRealtime();
    public final s f57537c;

    public b(s sVar) {
        this.f57537c = sVar;
    }

    public final void a(String str, Throwable th2) {
        String str2 = "AudioRecorder[" + this.f57535a + "] t+" + (SystemClock.elapsedRealtime() - this.f57536b) + "ms [" + Thread.currentThread().getName() + "] " + str;
        switch (this.f57537c.f57623a) {
            case 16:
                a8.e("AudioRecorderV2 " + str2, th2);
                return;
            default:
                return;
        }
    }

    public final void b(String str) {
        String str2 = "AudioRecorder[" + this.f57535a + "] t+" + (SystemClock.elapsedRealtime() - this.f57536b) + "ms [" + Thread.currentThread().getName() + "] " + str;
        switch (this.f57537c.f57623a) {
            case 16:
                if (r2.f25212a) {
                    a8.b("AudioRecorderV2 " + str2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
