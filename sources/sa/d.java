package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f47973e = TimeUnit.MINUTES.toMillis(30);
    public final j f47974a;
    public long f47975b;
    public int f47976c;

    public d() {
        if (ob.a.f17151b == null) {
            Pattern pattern = j.f46143c;
            ob.a.f17151b = new ob.a(23);
        }
        ob.a aVar = ob.a.f17151b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f47974a = j.d;
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
        double pow = Math.pow(2.0d, this.f47976c);
        this.f47974a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f47973e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f47976c != 0) {
            this.f47974a.f46144a.getClass();
            if (System.currentTimeMillis() <= this.f47975b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f47976c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f47976c++;
            long a2 = a(i10);
            this.f47974a.f46144a.getClass();
            this.f47975b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
