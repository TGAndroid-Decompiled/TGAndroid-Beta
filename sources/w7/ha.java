package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f50011f = new HashMap();
    public int f50012a;
    public long f50013b;
    public long f50014c;
    public long d = 2147483647L;
    public long f50015e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f50013b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f50014c;
        if (j10 != 0 && elapsedRealtimeNanos - j10 >= 1000000) {
            this.f50012a = 0;
            this.f50013b = 0L;
            this.d = 2147483647L;
            this.f50015e = -2147483648L;
        }
        this.f50014c = elapsedRealtimeNanos;
        this.f50012a++;
        this.d = Math.min(this.d, j3);
        this.f50015e = Math.max(this.f50015e, j3);
        if (this.f50012a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f50012a % 500 == 0) {
            this.f50012a = 0;
            this.f50013b = 0L;
            this.d = 2147483647L;
            this.f50015e = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override
    public void close() {
        long j3 = this.f50013b;
        if (j3 != 0) {
            c(j3);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
