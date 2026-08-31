package u5;

import android.os.Looper;
import java.util.Locale;
import org.telegram.ui.Components.ul0;
public final class p {
    public static final Object f48378i = new Object();
    public final b f48379a;
    public final long f48380b;
    public final String f48381c;
    public o f48384g;
    public ul0 h;
    public long f48382e = -1;
    public long f48383f = 0;
    public final a7.e d = new a7.e(Looper.getMainLooper(), 2);

    public p(long j10, String str) {
        this.f48380b = j10;
        this.f48381c = str;
        this.f48379a = new b("RequestTracker", str);
    }

    public final void a(long j10, o oVar) {
        o oVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f48378i;
        synchronized (obj) {
            oVar2 = this.f48384g;
            j11 = this.f48382e;
            j12 = this.f48383f;
            this.f48382e = j10;
            this.f48384g = oVar;
            this.f48383f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.m(this.f48381c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                ul0 ul0Var = this.h;
                if (ul0Var != null) {
                    this.d.removeCallbacks(ul0Var);
                }
                ul0 ul0Var2 = new ul0(this, 10);
                this.h = ul0Var2;
                this.d.postDelayed(ul0Var2, this.f48380b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, m mVar) {
        synchronized (f48378i) {
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
        boolean z4;
        synchronized (f48378i) {
            long j11 = this.f48382e;
            z4 = false;
            if (j11 != -1 && j11 == j10) {
                z4 = true;
            }
        }
        return z4;
    }

    public final boolean d() {
        boolean z4;
        synchronized (f48378i) {
            if (this.f48382e != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public final void e(String str, int i10, Object obj) {
        this.f48379a.b(str, new Object[0]);
        Object obj2 = f48378i;
        synchronized (obj2) {
            try {
                if (this.f48384g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.f48384g;
                    b6.m.h(oVar);
                    oVar.n(this.f48381c, this.f48382e, i10, obj, this.f48383f, currentTimeMillis);
                }
                this.f48382e = -1L;
                this.f48384g = null;
                synchronized (obj2) {
                    ul0 ul0Var = this.h;
                    if (ul0Var != null) {
                        this.d.removeCallbacks(ul0Var);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f48378i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j10 = this.f48382e;
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
