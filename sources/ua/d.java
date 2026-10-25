package ua;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import sa.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final j f49635a;
    public long f49636b;
    public int f49637c;

    public d() {
        if (qb.a.f47026c == null) {
            Pattern pattern = j.f48035c;
            qb.a.f47026c = new qb.a(25);
        }
        qb.a aVar = qb.a.f47026c;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f49635a = j.d;
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
        double pow = Math.pow(2.0d, this.f49637c);
        this.f49635a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f49637c != 0) {
            this.f49635a.f48036a.getClass();
            if (System.currentTimeMillis() <= this.f49636b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f49637c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f49637c++;
            long a2 = a(i10);
            this.f49635a.f48036a.getClass();
            this.f49636b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
