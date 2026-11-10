package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f58686e = TimeUnit.MINUTES.toMillis(30);
    public final j f58687a;
    public long f58688b;
    public int f58689c;

    public d() {
        if (sa.d.f55003b == null) {
            Pattern pattern = j.f57313c;
            sa.d.f55003b = new sa.d(28);
        }
        sa.d dVar = sa.d.f55003b;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        this.f58687a = j.d;
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
        double pow = Math.pow(2.0d, this.f58689c);
        this.f58687a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f58686e);
    }

    public final synchronized boolean b() {
        boolean z9;
        if (this.f58689c != 0) {
            this.f58687a.f57314a.getClass();
            if (System.currentTimeMillis() <= this.f58688b) {
                z9 = false;
            }
        }
        z9 = true;
        return z9;
    }

    public final synchronized void c() {
        this.f58689c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f58689c++;
            long a10 = a(i7);
            this.f58687a.f57314a.getClass();
            this.f58688b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
