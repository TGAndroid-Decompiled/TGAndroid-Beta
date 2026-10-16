package ta;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ra.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j f45560a;
    public long f45561b;
    public int f45562c;

    public d() {
        if (sb.a.f45085b == null) {
            Pattern pattern = j.f43843c;
            sb.a.f45085b = new sb.a(24);
        }
        sb.a aVar = sb.a.f45085b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f45560a = j.d;
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
        double pow = Math.pow(2.0d, this.f45562c);
        this.f45560a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f45562c != 0) {
            this.f45560a.f43844a.getClass();
            if (System.currentTimeMillis() <= this.f45561b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f45562c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f45562c++;
            long a2 = a(i10);
            this.f45560a.f43844a.getClass();
            this.f45561b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
