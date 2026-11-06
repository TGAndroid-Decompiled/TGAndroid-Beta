package vi;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import w7.s;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f57406a = d.getAndIncrement();
    public final long f57407b = SystemClock.elapsedRealtime();
    public final s f57408c;

    public b(s sVar) {
        this.f57408c = sVar;
    }

    public final void a(String str, Throwable th2) {
        String str2 = "AudioRecorder[" + this.f57406a + "] t+" + (SystemClock.elapsedRealtime() - this.f57407b) + "ms [" + Thread.currentThread().getName() + "] " + str;
        switch (this.f57408c.f57494a) {
            case 16:
                a8.e("AudioRecorderV2 " + str2, th2);
                return;
            default:
                return;
        }
    }

    public final void b(String str) {
        String str2 = "AudioRecorder[" + this.f57406a + "] t+" + (SystemClock.elapsedRealtime() - this.f57407b) + "ms [" + Thread.currentThread().getName() + "] " + str;
        switch (this.f57408c.f57494a) {
            case 16:
                if (r2.f25191a) {
                    a8.b("AudioRecorderV2 " + str2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
