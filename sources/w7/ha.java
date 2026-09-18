package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f44738f = new HashMap();
    public int f44739a;
    public long f44740b;
    public long f44741c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f44740b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f44741c;
        if (j10 != 0 && elapsedRealtimeNanos - j10 >= 1000000) {
            this.f44739a = 0;
            this.f44740b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f44741c = elapsedRealtimeNanos;
        this.f44739a++;
        this.d = Math.min(this.d, j3);
        this.e = Math.max(this.e, j3);
        if (this.f44739a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f44739a % 500 == 0) {
            this.f44739a = 0;
            this.f44740b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override
    public void close() {
        long j3 = this.f44740b;
        if (j3 != 0) {
            c(j3);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
