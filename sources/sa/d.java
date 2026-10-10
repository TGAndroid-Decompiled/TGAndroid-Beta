package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f47927e = TimeUnit.MINUTES.toMillis(30);
    public final j f47928a;
    public long f47929b;
    public int f47930c;

    public d() {
        if (ob.a.f17105b == null) {
            Pattern pattern = j.f46109c;
            ob.a.f17105b = new ob.a(23);
        }
        ob.a aVar = ob.a.f17105b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f47928a = j.d;
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
        double pow = Math.pow(2.0d, this.f47930c);
        this.f47928a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f47927e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f47930c != 0) {
            this.f47928a.f46110a.getClass();
            if (System.currentTimeMillis() <= this.f47929b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f47930c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f47930c++;
            long a2 = a(i10);
            this.f47928a.f46110a.getClass();
            this.f47929b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
