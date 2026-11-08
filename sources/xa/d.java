package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f58678e = TimeUnit.MINUTES.toMillis(30);
    public final j f58679a;
    public long f58680b;
    public int f58681c;

    public d() {
        if (sa.d.f54991b == null) {
            Pattern pattern = j.f57304c;
            sa.d.f54991b = new sa.d(28);
        }
        sa.d dVar = sa.d.f54991b;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        this.f58679a = j.d;
    }

    public final synchronized long a(int i7) {
        boolean z9;
        if (i7 != 429 && (i7 < 500 || i7 >= 600)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f58681c);
        this.f58679a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f58678e);
    }

    public final synchronized boolean b() {
        boolean z9;
        if (this.f58681c != 0) {
            this.f58679a.f57305a.getClass();
            if (System.currentTimeMillis() <= this.f58680b) {
                z9 = false;
            }
        }
        z9 = true;
        return z9;
    }

    public final synchronized void c() {
        this.f58681c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f58681c++;
            long a10 = a(i7);
            this.f58679a.f57305a.getClass();
            this.f58680b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
