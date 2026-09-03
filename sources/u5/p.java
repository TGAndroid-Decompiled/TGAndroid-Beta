package u5;

import android.os.Looper;
import java.util.Locale;
import org.telegram.ui.Components.sl0;
public final class p {
    public static final Object f45187i = new Object();
    public final b f45188a;
    public final long f45189b;
    public final String f45190c;
    public o f45192g;
    public sl0 h;
    public long e = -1;
    public long f45191f = 0;
    public final a7.e d = new a7.e(Looper.getMainLooper(), 2);

    public p(long j10, String str) {
        this.f45189b = j10;
        this.f45190c = str;
        this.f45188a = new b("RequestTracker", str);
    }

    public final void a(long j10, o oVar) {
        o oVar2;
        long j11;
        long j12;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f45187i;
        synchronized (obj) {
            oVar2 = this.f45192g;
            j11 = this.e;
            j12 = this.f45191f;
            this.e = j10;
            this.f45192g = oVar;
            this.f45191f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.e(this.f45190c, j11, j12, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                sl0 sl0Var = this.h;
                if (sl0Var != null) {
                    this.d.removeCallbacks(sl0Var);
                }
                sl0 sl0Var2 = new sl0(this, 10);
                this.h = sl0Var2;
                this.d.postDelayed(sl0Var2, this.f45189b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(long j10, int i10, m mVar) {
        synchronized (f45187i) {
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
        synchronized (f45187i) {
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
        synchronized (f45187i) {
            if (this.e != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public final void e(String str, int i10, Object obj) {
        this.f45188a.b(str, new Object[0]);
        Object obj2 = f45187i;
        synchronized (obj2) {
            try {
                if (this.f45192g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.f45192g;
                    b6.m.h(oVar);
                    oVar.g(this.f45190c, this.e, i10, obj, this.f45191f, currentTimeMillis);
                }
                this.e = -1L;
                this.f45192g = null;
                synchronized (obj2) {
                    sl0 sl0Var = this.h;
                    if (sl0Var != null) {
                        this.d.removeCallbacks(sl0Var);
                        this.h = null;
                    }
                }
            } finally {
            }
        }
    }

    public final boolean f(int i10) {
        synchronized (f45187i) {
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
