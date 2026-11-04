package y7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ia implements Closeable {
    public static final HashMap f59159f = new HashMap();
    public int f59160a;
    public long f59161b;
    public long f59162c;
    public long d = 2147483647L;
    public long f59163e = -2147483648L;

    public ia(String str) {
    }

    public void a() {
        this.f59161b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f59162c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f59160a = 0;
            this.f59161b = 0L;
            this.d = 2147483647L;
            this.f59163e = -2147483648L;
        }
        this.f59162c = elapsedRealtimeNanos;
        this.f59160a++;
        this.d = Math.min(this.d, j10);
        this.f59163e = Math.max(this.f59163e, j10);
        if (this.f59160a % 50 == 0) {
            Locale locale = Locale.US;
            qa.b();
        }
        if (this.f59160a % 500 == 0) {
            this.f59160a = 0;
            this.f59161b = 0L;
            this.d = 2147483647L;
            this.f59163e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f59161b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
