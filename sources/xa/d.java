package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f58688e = TimeUnit.MINUTES.toMillis(30);
    public final j f58689a;
    public long f58690b;
    public int f58691c;

    public d() {
        if (sa.d.f55004b == null) {
            Pattern pattern = j.f57317c;
            sa.d.f55004b = new sa.d(28);
        }
        sa.d dVar = sa.d.f55004b;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        this.f58689a = j.d;
    }

    public final synchronized long a(int i7) {
        boolean z9;
        if (i7 != 429 && (i7 < 500 || i7 >= 600)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f58691c);
        this.f58689a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f58688e);
    }

    public final synchronized boolean b() {
        boolean z9;
        if (this.f58691c != 0) {
            this.f58689a.f57318a.getClass();
            if (System.currentTimeMillis() <= this.f58690b) {
                z9 = false;
            }
        }
        z9 = true;
        return z9;
    }

    public final synchronized void c() {
        this.f58691c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f58691c++;
            long a10 = a(i7);
            this.f58689a.f57318a.getClass();
            this.f58690b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
