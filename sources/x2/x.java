package x2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends s1 {
    public final int f58510l;
    public final HashMap f58511m;
    public final HashMap f58512n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f58510l = Integer.MAX_VALUE;
        this.f58511m = new HashMap();
        this.f58512n = new HashMap();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        e2.l1 vVar;
        int i7 = this.f58510l;
        if (i7 != Integer.MAX_VALUE) {
            vVar = new w(l1Var, i7);
        } else {
            vVar = new v(l1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        int i7 = this.f58510l;
        a aVar = this.f58459k;
        if (i7 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, mVar, j3);
        }
        Object obj = g0Var.f58329a;
        int i10 = l2.a.f17737g;
        g0 a10 = g0Var.a(((Pair) obj).second);
        this.f58511m.put(a10, g0Var);
        e0 c10 = aVar.c(a10, mVar, j3);
        this.f58512n.put(c10, a10);
        return c10;
    }

    @Override
    public final e2.l1 h() {
        b0 b0Var = (b0) this.f58459k;
        int i7 = this.f58510l;
        if (i7 != Integer.MAX_VALUE) {
            return new w(b0Var.f58274o, i7);
        }
        return new v(b0Var.f58274o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f58459k.o(e0Var);
        g0 g0Var = (g0) this.f58512n.remove(e0Var);
        if (g0Var != null) {
            this.f58511m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f58510l != Integer.MAX_VALUE) {
            return (g0) this.f58511m.get(g0Var);
        }
        return g0Var;
    }
}
