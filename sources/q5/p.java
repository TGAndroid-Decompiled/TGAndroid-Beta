package q5;

import android.os.Looper;
import c2.u0;
import java.util.Locale;
import org.telegram.ui.Components.ju0;
public final class p {
    public static final Object f46038i = new Object();
    public final b f46039a;
    public final long f46040b;
    public final String f46041c;
    public o f46044g;
    public ju0 h;
    public long f46042e = -1;
    public long f46043f = 0;
    public final u0 d = new u0(Looper.getMainLooper(), 1);

    public p(long j10, String str) {
        this.f46040b = j10;
        this.f46041c = str;
        this.f46039a = new b("RequestTracker", str);
    }

    public final void a(long j10, o oVar) {
        o oVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f46038i;
        synchronized (obj) {
            oVar2 = this.f46044g;
            j11 = this.f46042e;
            j12 = this.f46043f;
            this.f46042e = j10;
            this.f46044g = oVar;
            this.f46043f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.b(this.f46041c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                ju0 ju0Var = this.h;
                if (ju0Var != null) {
                    this.d.removeCallbacks(ju0Var);
                }
                ju0 ju0Var2 = new ju0(this, 5);
                this.h = ju0Var2;
                this.d.postDelayed(ju0Var2, this.f46040b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j10, int i9, m mVar) {
        synchronized (f46038i) {
            try {
                if (c(j10)) {
                    Locale locale = Locale.ROOT;
                    e("request " + j10 + " completed", i9, mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(long j10) {
        boolean z10;
        synchronized (f46038i) {
            long j11 = this.f46042e;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (f46038i) {
            if (this.f46042e != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void e(String str, int i9, Object obj) {
        this.f46039a.b(str, new Object[0]);
        Object obj2 = f46038i;
        synchronized (obj2) {
            try {
                if (this.f46044g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.f46044g;
                    x5.l.h(oVar);
                    oVar.p(this.f46041c, this.f46042e, i9, obj, this.f46043f, currentTimeMillis);
                }
                this.f46042e = -1L;
                this.f46044g = null;
                synchronized (obj2) {
                    ju0 ju0Var = this.h;
                    if (ju0Var != null) {
                        this.d.removeCallbacks(ju0Var);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i9) {
        synchronized (f46038i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j10 = this.f46042e;
                    e("clearing request " + j10, i9, null);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
