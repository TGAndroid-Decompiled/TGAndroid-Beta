package xa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import va.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f60568e = TimeUnit.MINUTES.toMillis(30);
    public final j f60569a;
    public long f60570b;
    public int f60571c;

    public d() {
        if (z9.a.f61924a == null) {
            Pattern pattern = j.f59483c;
            z9.a.f61924a = new Object();
        }
        z9.a aVar = z9.a.f61924a;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f60569a = j.d;
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
        double pow = Math.pow(2.0d, this.f60571c);
        this.f60569a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f60568e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f60571c != 0) {
            this.f60569a.f59484a.getClass();
            if (System.currentTimeMillis() <= this.f60570b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f60571c = 0;
    }

    public final synchronized void d(int i7) {
        if ((i7 < 200 || i7 >= 300) && i7 != 401 && i7 != 404) {
            this.f60571c++;
            long a10 = a(i7);
            this.f60569a.f59484a.getClass();
            this.f60570b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
