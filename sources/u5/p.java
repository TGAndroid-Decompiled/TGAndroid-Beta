package u5;

import android.os.Looper;
import java.util.Locale;
import org.telegram.ui.Components.tl0;
public final class p {
    public static final Object f45125i = new Object();
    public final b f45126a;
    public final long f45127b;
    public final String f45128c;
    public o f45130g;
    public tl0 h;
    public long e = -1;
    public long f45129f = 0;
    public final a7.e d = new a7.e(Looper.getMainLooper(), 2);

    public p(long j10, String str) {
        this.f45127b = j10;
        this.f45128c = str;
        this.f45126a = new b("RequestTracker", str);
    }

    public final void a(long j10, o oVar) {
        o oVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f45125i;
        synchronized (obj) {
            oVar2 = this.f45130g;
            j11 = this.e;
            j12 = this.f45129f;
            this.e = j10;
            this.f45130g = oVar;
            this.f45129f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.c(this.f45128c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                tl0 tl0Var = this.h;
                if (tl0Var != null) {
                    this.d.removeCallbacks(tl0Var);
                }
                tl0 tl0Var2 = new tl0(this, 10);
                this.h = tl0Var2;
                this.d.postDelayed(tl0Var2, this.f45127b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, m mVar) {
        synchronized (f45125i) {
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
        synchronized (f45125i) {
            long j11 = this.e;
            z4 = false;
            if (j11 != -1 && j11 == j10) {
                z4 = true;
            }
        }
        return z4;
    }

    public final boolean d() {
        boolean z4;
        synchronized (f45125i) {
            if (this.e != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public final void e(String str, int i10, Object obj) {
        this.f45126a.b(str, new Object[0]);
        Object obj2 = f45125i;
        synchronized (obj2) {
            try {
                if (this.f45130g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.f45130g;
                    b6.m.h(oVar);
                    oVar.g(this.f45128c, this.e, i10, obj, this.f45129f, currentTimeMillis);
                }
                this.e = -1L;
                this.f45130g = null;
                synchronized (obj2) {
                    tl0 tl0Var = this.h;
                    if (tl0Var != null) {
                        this.d.removeCallbacks(tl0Var);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f45125i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    long j10 = this.e;
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
