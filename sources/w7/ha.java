package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f43670f = new HashMap();
    public int f43671a;
    public long f43672b;
    public long f43673c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f43672b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f43673c;
        if (j10 != 0 && elapsedRealtimeNanos - j10 >= 1000000) {
            this.f43671a = 0;
            this.f43672b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f43673c = elapsedRealtimeNanos;
        this.f43671a++;
        this.d = Math.min(this.d, j3);
        this.e = Math.max(this.e, j3);
        if (this.f43671a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f43671a % 500 == 0) {
            this.f43671a = 0;
            this.f43672b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override
    public void close() {
        long j3 = this.f43672b;
        if (j3 != 0) {
            c(j3);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
