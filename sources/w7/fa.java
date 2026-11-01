package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class fa implements Closeable {
    public static final HashMap f52535f = new HashMap();
    public int f52536a;
    public long f52537b;
    public long f52538c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public fa(String str) {
    }

    public void a() {
        this.f52537b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f52538c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f52536a = 0;
            this.f52537b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f52538c = elapsedRealtimeNanos;
        this.f52536a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f52536a % 50 == 0) {
            Locale locale = Locale.US;
            na.b();
        }
        if (this.f52536a % 500 == 0) {
            this.f52536a = 0;
            this.f52537b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f52537b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
