package z7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ia implements Closeable {
    public static final HashMap f59835f = new HashMap();
    public int f59836a;
    public long f59837b;
    public long f59838c;
    public long d = 2147483647L;
    public long f59839e = -2147483648L;

    public ia(String str) {
    }

    public void a() {
        this.f59837b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f59838c;
        if (j10 != 0 && elapsedRealtimeNanos - j10 >= 1000000) {
            this.f59836a = 0;
            this.f59837b = 0L;
            this.d = 2147483647L;
            this.f59839e = -2147483648L;
        }
        this.f59838c = elapsedRealtimeNanos;
        this.f59836a++;
        this.d = Math.min(this.d, j3);
        this.f59839e = Math.max(this.f59839e, j3);
        if (this.f59836a % 50 == 0) {
            Locale locale = Locale.US;
            qa.b();
        }
        if (this.f59836a % 500 == 0) {
            this.f59836a = 0;
            this.f59837b = 0L;
            this.d = 2147483647L;
            this.f59839e = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override
    public void close() {
        long j3 = this.f59837b;
        if (j3 != 0) {
            c(j3);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
