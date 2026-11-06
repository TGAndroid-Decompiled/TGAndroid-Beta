package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f58584e = TimeUnit.MINUTES.toMillis(30);
    public final j f58585a;
    public long f58586b;
    public int f58587c;

    public d() {
        if (sa.d.f54900b == null) {
            Pattern pattern = j.f57213c;
            sa.d.f54900b = new sa.d(28);
        }
        sa.d dVar = sa.d.f54900b;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        this.f58585a = j.d;
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
        double pow = Math.pow(2.0d, this.f58587c);
        this.f58585a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f58584e);
    }

    public final synchronized boolean b() {
        boolean z9;
        if (this.f58587c != 0) {
            this.f58585a.f57214a.getClass();
            if (System.currentTimeMillis() <= this.f58586b) {
                z9 = false;
            }
        }
        z9 = true;
        return z9;
    }

    public final synchronized void c() {
        this.f58587c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f58587c++;
            long a10 = a(i7);
            this.f58585a.f57214a.getClass();
            this.f58586b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
