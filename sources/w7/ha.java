package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f49152f = new HashMap();
    public int f49153a;
    public long f49154b;
    public long f49155c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f49154b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f49155c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f49153a = 0;
            this.f49154b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f49155c = elapsedRealtimeNanos;
        this.f49153a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f49153a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f49153a % 500 == 0) {
            this.f49153a = 0;
            this.f49154b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f49154b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
