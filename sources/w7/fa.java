package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class fa implements Closeable {
    public static final HashMap f52517f = new HashMap();
    public int f52518a;
    public long f52519b;
    public long f52520c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public fa(String str) {
    }

    public void a() {
        this.f52519b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f52520c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f52518a = 0;
            this.f52519b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f52520c = elapsedRealtimeNanos;
        this.f52518a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f52518a % 50 == 0) {
            Locale locale = Locale.US;
            na.b();
        }
        if (this.f52518a % 500 == 0) {
            this.f52518a = 0;
            this.f52519b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f52519b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
