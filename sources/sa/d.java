package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
import t7.u;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j f43191a;
    public long f43192b;
    public int f43193c;

    public d() {
        if (u.f43338b == null) {
            Pattern pattern = j.f41532c;
            u.f43338b = new Object();
        }
        u uVar = u.f43338b;
        if (j.d == null) {
            j.d = new j(uVar);
        }
        this.f43191a = j.d;
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
        double pow = Math.pow(2.0d, this.f43193c);
        this.f43191a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f43193c != 0) {
            this.f43191a.f41533a.getClass();
            if (System.currentTimeMillis() <= this.f43192b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f43193c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f43193c++;
            long a2 = a(i10);
            this.f43191a.f41533a.getClass();
            this.f43192b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
