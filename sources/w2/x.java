package w2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends t1 {
    public final int f57266l;
    public final HashMap f57267m;
    public final HashMap f57268n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f57266l = Integer.MAX_VALUE;
        this.f57267m = new HashMap();
        this.f57268n = new HashMap();
    }

    @Override
    public final void A(d2.n1 n1Var) {
        d2.n1 vVar;
        int i3 = this.f57266l;
        if (i3 != Integer.MAX_VALUE) {
            vVar = new w(n1Var, i3);
        } else {
            vVar = new v(n1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        int i3 = this.f57266l;
        a aVar = this.f57229k;
        if (i3 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, a0Var, j10);
        }
        Object obj = g0Var.f57081a;
        int i10 = k2.a.f16436g;
        g0 a10 = g0Var.a(((Pair) obj).second);
        this.f57267m.put(a10, g0Var);
        e0 c2 = aVar.c(a10, a0Var, j10);
        this.f57268n.put(c2, a10);
        return c2;
    }

    @Override
    public final d2.n1 h() {
        b0 b0Var = (b0) this.f57229k;
        int i3 = this.f57266l;
        if (i3 != Integer.MAX_VALUE) {
            return new w(b0Var.f57029o, i3);
        }
        return new v(b0Var.f57029o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f57229k.o(e0Var);
        g0 g0Var = (g0) this.f57268n.remove(e0Var);
        if (g0Var != null) {
            this.f57267m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f57266l != Integer.MAX_VALUE) {
            return (g0) this.f57267m.get(g0Var);
        }
        return g0Var;
    }
}
