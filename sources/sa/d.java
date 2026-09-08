package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f46005e = TimeUnit.MINUTES.toMillis(30);
    public final j f46006a;
    public long f46007b;
    public int f46008c;

    public d() {
        if (na.d.f16743a == null) {
            Pattern pattern = j.f44295c;
            na.d.f16743a = new Object();
        }
        na.d dVar = na.d.f16743a;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        this.f46006a = j.d;
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
        double pow = Math.pow(2.0d, this.f46008c);
        this.f46006a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f46005e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f46008c != 0) {
            this.f46006a.f44296a.getClass();
            if (System.currentTimeMillis() <= this.f46007b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f46008c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f46008c++;
            long a2 = a(i10);
            this.f46006a.f44296a.getClass();
            this.f46007b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
