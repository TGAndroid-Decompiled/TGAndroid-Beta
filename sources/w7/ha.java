package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f48714f = new HashMap();
    public int f48715a;
    public long f48716b;
    public long f48717c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f48716b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f48717c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f48715a = 0;
            this.f48716b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f48717c = elapsedRealtimeNanos;
        this.f48715a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f48715a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f48715a % 500 == 0) {
            this.f48715a = 0;
            this.f48716b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f48716b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
