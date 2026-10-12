package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f48114e = TimeUnit.MINUTES.toMillis(30);
    public final j f48115a;
    public long f48116b;
    public int f48117c;

    public d() {
        if (qb.b.f46006b == null) {
            Pattern pattern = j.f46002c;
            qb.b.f46006b = new qb.b(23);
        }
        qb.b bVar = qb.b.f46006b;
        if (j.d == null) {
            j.d = new j(bVar);
        }
        this.f48115a = j.d;
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
        double pow = Math.pow(2.0d, this.f48117c);
        this.f48115a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f48114e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f48117c != 0) {
            this.f48115a.f46003a.getClass();
            if (System.currentTimeMillis() <= this.f48116b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f48117c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f48117c++;
            long a2 = a(i10);
            this.f48115a.f46003a.getClass();
            this.f48116b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
