package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f58583e = TimeUnit.MINUTES.toMillis(30);
    public final j f58584a;
    public long f58585b;
    public int f58586c;

    public d() {
        if (sa.d.f54899b == null) {
            Pattern pattern = j.f57212c;
            sa.d.f54899b = new sa.d(28);
        }
        sa.d dVar = sa.d.f54899b;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        this.f58584a = j.d;
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
        double pow = Math.pow(2.0d, this.f58586c);
        this.f58584a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f58583e);
    }

    public final synchronized boolean b() {
        boolean z9;
        if (this.f58586c != 0) {
            this.f58584a.f57213a.getClass();
            if (System.currentTimeMillis() <= this.f58585b) {
                z9 = false;
            }
        }
        z9 = true;
        return z9;
    }

    public final synchronized void c() {
        this.f58586c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f58586c++;
            long a10 = a(i7);
            this.f58584a.f57213a.getClass();
            this.f58585b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
