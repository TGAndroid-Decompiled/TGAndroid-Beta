package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f47318f = new HashMap();
    public int f47319a;
    public long f47320b;
    public long f47321c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f47320b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f47321c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f47319a = 0;
            this.f47320b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f47321c = elapsedRealtimeNanos;
        this.f47319a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f47319a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f47319a % 500 == 0) {
            this.f47319a = 0;
            this.f47320b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f47320b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
