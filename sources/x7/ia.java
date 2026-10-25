package x7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ia implements Closeable {
    public static final HashMap f51524f = new HashMap();
    public int f51525a;
    public long f51526b;
    public long f51527c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ia(String str) {
    }

    public void a() {
        this.f51526b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f51527c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f51525a = 0;
            this.f51526b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f51527c = elapsedRealtimeNanos;
        this.f51525a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f51525a % 50 == 0) {
            Locale locale = Locale.US;
            qa.b();
        }
        if (this.f51525a % 500 == 0) {
            this.f51525a = 0;
            this.f51526b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f51526b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
