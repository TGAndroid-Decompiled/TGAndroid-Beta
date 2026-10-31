package ta;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ra.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j f48582a;
    public long f48583b;
    public int f48584c;

    public d() {
        if (hb.a.d == null) {
            Pattern pattern = j.f46476c;
            hb.a.d = new hb.a(22);
        }
        hb.a aVar = hb.a.d;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f48582a = j.d;
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
        double pow = Math.pow(2.0d, this.f48584c);
        this.f48582a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f48584c != 0) {
            this.f48582a.f46477a.getClass();
            if (System.currentTimeMillis() <= this.f48583b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f48584c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f48584c++;
            long a2 = a(i10);
            this.f48582a.f46477a.getClass();
            this.f48583b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
