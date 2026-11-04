package wa;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ra.e;
import ua.k;
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long f57439e = TimeUnit.MINUTES.toMillis(30);
    public final k f57440a;
    public long f57441b;
    public int f57442c;

    public d() {
        if (e.f54462c == null) {
            Pattern pattern = k.f55804c;
            e.f54462c = new e(27);
        }
        e eVar = e.f54462c;
        if (k.d == null) {
            k.d = new k(eVar);
        }
        this.f57440a = k.d;
    }

    public final synchronized long a(int i3) {
        boolean z10;
        if (i3 != 429 && (i3 < 500 || i3 >= 600)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return d;
        }
        double pow = Math.pow(2.0d, this.f57442c);
        this.f57440a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f57439e);
    }

    public final synchronized boolean b() {
        boolean z10;
        if (this.f57442c != 0) {
            this.f57440a.f55805a.getClass();
            if (System.currentTimeMillis() <= this.f57441b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public final synchronized void c() {
        this.f57442c = 0;
    }

    public final synchronized void d(int i3) {
        if ((i3 < 200 || i3 >= 300) && i3 != 401 && i3 != 404) {
            this.f57442c++;
            long a10 = a(i3);
            this.f57440a.f55805a.getClass();
            this.f57441b = System.currentTimeMillis() + a10;
            return;
        }
        c();
    }
}
