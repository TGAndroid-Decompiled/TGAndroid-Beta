package x7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ia implements Closeable {
    public static final HashMap f51585f = new HashMap();
    public int f51586a;
    public long f51587b;
    public long f51588c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ia(String str) {
    }

    public void a() {
        this.f51587b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f51588c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f51586a = 0;
            this.f51587b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f51588c = elapsedRealtimeNanos;
        this.f51586a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f51586a % 50 == 0) {
            Locale locale = Locale.US;
            qa.b();
        }
        if (this.f51586a % 500 == 0) {
            this.f51586a = 0;
            this.f51587b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f51587b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
