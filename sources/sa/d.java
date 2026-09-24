package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
import t7.u;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j f43163a;
    public long f43164b;
    public int f43165c;

    public d() {
        if (u.f43310b == null) {
            Pattern pattern = j.f41504c;
            u.f43310b = new Object();
        }
        u uVar = u.f43310b;
        if (j.d == null) {
            j.d = new j(uVar);
        }
        this.f43163a = j.d;
    }

    public final synchronized long a(int i10) {
        boolean z10;
        if (i10 != 429 && (i10 < 500 || i10 >= 600)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f43165c);
        this.f43163a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f43165c != 0) {
            this.f43163a.f41505a.getClass();
            if (System.currentTimeMillis() <= this.f43164b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f43165c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f43165c++;
            long a2 = a(i10);
            this.f43163a.f41505a.getClass();
            this.f43164b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
