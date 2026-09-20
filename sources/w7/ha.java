package w7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ha implements Closeable {
    public static final HashMap f45011f = new HashMap();
    public int f45012a;
    public long f45013b;
    public long f45014c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ha(String str) {
    }

    public void a() {
        this.f45013b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.f45014c;
        if (j10 != 0 && elapsedRealtimeNanos - j10 >= 1000000) {
            this.f45012a = 0;
            this.f45013b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f45014c = elapsedRealtimeNanos;
        this.f45012a++;
        this.d = Math.min(this.d, j3);
        this.e = Math.max(this.e, j3);
        if (this.f45012a % 50 == 0) {
            Locale locale = Locale.US;
            pa.b();
        }
        if (this.f45012a % 500 == 0) {
            this.f45012a = 0;
            this.f45013b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override
    public void close() {
        long j3 = this.f45013b;
        if (j3 != 0) {
            c(j3);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
