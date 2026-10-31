package ud;

import android.os.Handler;
import android.os.Looper;
import cd.h;
import java.util.concurrent.CancellationException;
import k1.i;
import td.a0;
import td.e0;
import td.f2;
import td.j0;
import td.m;
import td.m0;
import td.o0;
import td.w1;
import td.z1;
import yd.o;
public final class d extends a0 implements j0 {
    public final Handler f50222c;
    public final boolean d;
    public final d e;

    public d(Handler handler, boolean z10) {
        d dVar;
        this.f50222c = handler;
        this.d = z10;
        if (z10) {
            dVar = this;
        } else {
            dVar = new d(handler, true);
        }
        this.e = dVar;
    }

    @Override
    public final void a(long j10, m mVar) {
        z1 z1Var = new z1(mVar, this, false, 6);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f50222c.postDelayed(z1Var, j10)) {
            mVar.u(new i(1, this, z1Var));
        } else {
            f(mVar.e, z1Var);
        }
    }

    @Override
    public final o0 b(long j10, final f2 f2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f50222c.postDelayed(f2Var, j10)) {
            return new o0() {
                @Override
                public final void dispose() {
                    d.this.f50222c.removeCallbacks(f2Var);
                }
            };
        }
        f(hVar, f2Var);
        return w1.f48676a;
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f50222c.post(runnable)) {
            f(hVar, runnable);
        }
    }

    @Override
    public final boolean d() {
        if (this.d && kotlin.jvm.internal.i.a(Looper.myLooper(), this.f50222c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f50222c == this.f50222c && dVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(h hVar, Runnable runnable) {
        e0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m0.f48642b.c(hVar, runnable);
    }

    public final int hashCode() {
        int i10;
        int identityHashCode = System.identityHashCode(this.f50222c);
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return identityHashCode ^ i10;
    }

    @Override
    public final String toString() {
        d dVar;
        String str;
        ae.e eVar = m0.f48641a;
        d dVar2 = o.f54417a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.e;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            if (this == dVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.f50222c.toString();
            if (this.d) {
                return sc.e.A(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
