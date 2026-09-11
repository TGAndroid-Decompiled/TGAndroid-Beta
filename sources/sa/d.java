package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f45977e = TimeUnit.MINUTES.toMillis(30);
    public final j f45978a;
    public long f45979b;
    public int f45980c;

    public d() {
        if (na.d.f16716a == null) {
            Pattern pattern = j.f44267c;
            na.d.f16716a = new Object();
        }
        na.d dVar = na.d.f16716a;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        this.f45978a = j.d;
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
        double pow = Math.pow(2.0d, this.f45980c);
        this.f45978a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f45977e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f45980c != 0) {
            this.f45978a.f44268a.getClass();
            if (System.currentTimeMillis() <= this.f45979b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f45980c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f45980c++;
            long a2 = a(i10);
            this.f45978a.f44268a.getClass();
            this.f45979b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
