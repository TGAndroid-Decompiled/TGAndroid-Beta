package xd;

import android.os.Handler;
import android.os.Looper;
import b1.e;
import be.n;
import fd.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import l1.u0;
import u9.k;
import wd.a1;
import wd.g0;
import wd.j0;
import wd.l0;
import wd.m;
import wd.p1;
import wd.x;
import wd.y;
import wd.y1;
public final class c extends x implements g0 {
    public final Handler f58618c;
    public final boolean d;
    public final c f58619e;

    public c(Handler handler, boolean z10) {
        c cVar;
        this.f58618c = handler;
        this.d = z10;
        if (z10) {
            cVar = this;
        } else {
            cVar = new c(handler, true);
        }
        this.f58619e = cVar;
    }

    @Override
    public final void a(long j10, m mVar) {
        k kVar = new k(mVar, this, false, 7);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f58618c.postDelayed(kVar, j10)) {
            mVar.u(new e(3, this, kVar));
        } else {
            g(mVar.f57513e, kVar);
        }
    }

    @Override
    public final l0 b(long j10, y1 y1Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f58618c.postDelayed(y1Var, j10)) {
            return new u0(1, this, y1Var);
        }
        g(hVar, y1Var);
        return p1.f57525a;
    }

    @Override
    public final void c(h hVar, Runnable runnable) {
        if (!this.f58618c.post(runnable)) {
            g(hVar, runnable);
        }
    }

    @Override
    public final boolean e(h hVar) {
        if (this.d && j.a(Looper.myLooper(), this.f58618c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f58618c == this.f58618c && cVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        a1 a1Var = (a1) hVar.get(y.f57551b);
        if (a1Var != null) {
            a1Var.cancel(cancellationException);
        }
        de.e eVar = j0.f57503a;
        de.d.f8823c.c(hVar, runnable);
    }

    public final int hashCode() {
        int i3;
        int identityHashCode = System.identityHashCode(this.f58618c);
        if (this.d) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return identityHashCode ^ i3;
    }

    @Override
    public final String toString() {
        c cVar;
        String str;
        de.e eVar = j0.f57503a;
        c cVar2 = n.f3280a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f58619e;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            if (this == cVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.f58618c.toString();
            if (this.d) {
                return t4.c.q(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }
}
