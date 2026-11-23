package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f60485e = TimeUnit.MINUTES.toMillis(30);
    public final j f60486a;
    public long f60487b;
    public int f60488c;

    public d() {
        if (z9.a.f61840a == null) {
            Pattern pattern = j.f59398c;
            z9.a.f61840a = new Object();
        }
        z9.a aVar = z9.a.f61840a;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f60486a = j.d;
    }

    public final synchronized long a(int i7) {
        boolean z10;
        if (i7 != 429 && (i7 < 500 || i7 >= 600)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f60488c);
        this.f60486a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f60485e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f60488c != 0) {
            this.f60486a.f59399a.getClass();
            if (System.currentTimeMillis() <= this.f60487b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f60488c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f60488c++;
            long a10 = a(i7);
            this.f60486a.f59399a.getClass();
            this.f60487b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
