package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f48122e = TimeUnit.MINUTES.toMillis(30);
    public final j f48123a;
    public long f48124b;
    public int f48125c;

    public d() {
        if (qb.b.f46014b == null) {
            Pattern pattern = j.f46010c;
            qb.b.f46014b = new qb.b(23);
        }
        qb.b bVar = qb.b.f46014b;
        if (j.d == null) {
            j.d = new j(bVar);
        }
        this.f48123a = j.d;
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
        double pow = Math.pow(2.0d, this.f48125c);
        this.f48123a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f48122e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f48125c != 0) {
            this.f48123a.f46011a.getClass();
            if (System.currentTimeMillis() <= this.f48124b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f48125c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f48125c++;
            long a2 = a(i10);
            this.f48123a.f46011a.getClass();
            this.f48124b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
