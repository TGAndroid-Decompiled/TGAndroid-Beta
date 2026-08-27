package r5;

import android.os.Looper;
import c2.t0;
import java.util.Locale;
import org.telegram.ui.Components.mu0;

public final class p {

    public static final Object f46797i = new Object();

    public final b f46798a;

    public final long f46799b;

    public final String f46800c;

    public o f46803g;
    public mu0 h;

    public long f46801e = -1;

    public long f46802f = 0;
    public final t0 d = new t0(Looper.getMainLooper(), 1);

    public p(long j10, String str) {
        this.f46799b = j10;
        this.f46800c = str;
        this.f46798a = new b("RequestTracker", str);
    }

    public final void a(long j10, o oVar) {
        o oVar2;
        long j11;
        long j12;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = f46797i;
        synchronized (obj) {
            oVar2 = this.f46803g;
            j11 = this.f46801e;
            j12 = this.f46802f;
            this.f46801e = j10;
            this.f46803g = oVar;
            this.f46802f = jCurrentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.d(this.f46800c, j11, j12, jCurrentTimeMillis);
        }
        synchronized (obj) {
            try {
                mu0 mu0Var = this.h;
                if (mu0Var != null) {
                    this.d.removeCallbacks(mu0Var);
                }
                mu0 mu0Var2 = new mu0(this, 5);
                this.h = mu0Var2;
                this.d.postDelayed(mu0Var2, this.f46799b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j10, int i10, m mVar) {
        synchronized (f46797i) {
            try {
                if (c(j10)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j10 + " completed", i10, mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(long j10) {
        boolean z10;
        synchronized (f46797i) {
            long j11 = this.f46801e;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f46797i) {
            z10 = this.f46801e != -1;
        }
        return z10;
    }

    public final void e(String str, int i10, Object obj) {
        this.f46798a.b(str, new Object[0]);
        Object obj2 = f46797i;
        synchronized (obj2) {
            try {
                if (this.f46803g != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    o oVar = this.f46803g;
                    y5.l.h(oVar);
                    oVar.j(this.f46800c, this.f46801e, i10, obj, this.f46802f, jCurrentTimeMillis);
                }
                this.f46801e = -1L;
                this.f46803g = null;
                synchronized (obj2) {
                    try {
                        mu0 mu0Var = this.h;
                        if (mu0Var != null) {
                            this.d.removeCallbacks(mu0Var);
                            this.h = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f46797i) {
            try {
                if (!d()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                e("clearing request " + this.f46801e, i10, null);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
