package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f60439e = TimeUnit.MINUTES.toMillis(30);
    public final j f60440a;
    public long f60441b;
    public int f60442c;

    public d() {
        if (z9.a.f61794a == null) {
            Pattern pattern = j.f59355c;
            z9.a.f61794a = new Object();
        }
        z9.a aVar = z9.a.f61794a;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f60440a = j.d;
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
        double pow = Math.pow(2.0d, this.f60442c);
        this.f60440a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f60439e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f60442c != 0) {
            this.f60440a.f59356a.getClass();
            if (System.currentTimeMillis() <= this.f60441b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f60442c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f60442c++;
            long a10 = a(i7);
            this.f60440a.f59356a.getClass();
            this.f60441b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
