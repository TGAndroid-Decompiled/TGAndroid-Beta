package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f48162f = new HashMap();
    public int f48163a;
    public long f48164b;
    public long f48165c;
    public long d = 2147483647L;
    public long f48166e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f48164b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f48165c;
        if (j10 != 0 && elapsedRealtimeNanos - j10 >= 1000000) {
            this.f48163a = 0;
            this.f48164b = 0L;
            this.d = 2147483647L;
            this.f48166e = -2147483648L;
        }
        this.f48165c = elapsedRealtimeNanos;
        this.f48163a++;
        this.d = Math.min(this.d, j3);
        this.f48166e = Math.max(this.f48166e, j3);
        if (this.f48163a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f48163a % 500 == 0) {
            this.f48163a = 0;
            this.f48164b = 0L;
            this.d = 2147483647L;
            this.f48166e = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override
    public void close() {
        long j3 = this.f48164b;
        if (j3 != 0) {
            c(j3);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
