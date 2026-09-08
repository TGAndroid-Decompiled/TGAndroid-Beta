package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f48191f = new HashMap();
    public int f48192a;
    public long f48193b;
    public long f48194c;
    public long d = 2147483647L;
    public long f48195e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f48193b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f48194c;
        if (j10 != 0 && elapsedRealtimeNanos - j10 >= 1000000) {
            this.f48192a = 0;
            this.f48193b = 0L;
            this.d = 2147483647L;
            this.f48195e = -2147483648L;
        }
        this.f48194c = elapsedRealtimeNanos;
        this.f48192a++;
        this.d = Math.min(this.d, j3);
        this.f48195e = Math.max(this.f48195e, j3);
        if (this.f48192a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f48192a % 500 == 0) {
            this.f48192a = 0;
            this.f48193b = 0L;
            this.d = 2147483647L;
            this.f48195e = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override
    public void close() {
        long j3 = this.f48193b;
        if (j3 != 0) {
            c(j3);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
