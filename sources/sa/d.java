package sa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qa.j;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f48007e = TimeUnit.MINUTES.toMillis(30);
    public final j f48008a;
    public long f48009b;
    public int f48010c;

    public d() {
        if (ob.a.f17187b == null) {
            Pattern pattern = j.f46177c;
            ob.a.f17187b = new ob.a(23);
        }
        ob.a aVar = ob.a.f17187b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        this.f48008a = j.d;
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
        double pow = Math.pow(2.0d, this.f48010c);
        this.f48008a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f48007e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f48010c != 0) {
            this.f48008a.f46178a.getClass();
            if (System.currentTimeMillis() <= this.f48009b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f48010c = 0;
    }

    public final synchronized void d(int i10) {
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            this.f48010c++;
            long a2 = a(i10);
            this.f48008a.f46178a.getClass();
            this.f48009b = System.currentTimeMillis() + a2;
            return;
        }
        c();
    }
}
