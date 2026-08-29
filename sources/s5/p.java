package s5;

import android.os.Looper;
import c2.v0;
import java.util.Locale;
import org.telegram.ui.Components.rk0;
public final class p {
    public static final Object f47609i = new Object();
    public final b f47610a;
    public final long f47611b;
    public final String f47612c;
    public o f47615g;
    public rk0 h;
    public long f47613e = -1;
    public long f47614f = 0;
    public final v0 d = new v0(Looper.getMainLooper(), 1);

    public p(long j10, String str) {
        this.f47611b = j10;
        this.f47612c = str;
        this.f47610a = new b("RequestTracker", str);
    }

    public final void a(long j10, o oVar) {
        o oVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f47609i;
        synchronized (obj) {
            oVar2 = this.f47615g;
            j11 = this.f47613e;
            j12 = this.f47614f;
            this.f47613e = j10;
            this.f47615g = oVar;
            this.f47614f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.c(this.f47612c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                rk0 rk0Var = this.h;
                if (rk0Var != null) {
                    this.d.removeCallbacks(rk0Var);
                }
                rk0 rk0Var2 = new rk0(this, 9);
                this.h = rk0Var2;
                this.d.postDelayed(rk0Var2, this.f47611b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, m mVar) {
        synchronized (f47609i) {
            try {
                if (c(j10)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j10 + " completed", i10, mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(long j10) {
        boolean z10;
        synchronized (f47609i) {
            long j11 = this.f47613e;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f47609i) {
            if (this.f47613e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f47610a.b(str, new Object[0]);
        Object obj2 = f47609i;
        synchronized (obj2) {
            try {
                if (this.f47615g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.f47615g;
                    z5.l.h(oVar);
                    oVar.o(this.f47612c, this.f47613e, i10, obj, this.f47614f, currentTimeMillis);
                }
                this.f47613e = -1L;
                this.f47615g = null;
                synchronized (obj2) {
                    rk0 rk0Var = this.h;
                    if (rk0Var != null) {
                        this.d.removeCallbacks(rk0Var);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f47609i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j10 = this.f47613e;
                    e("clearing request " + j10, i10, null);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
