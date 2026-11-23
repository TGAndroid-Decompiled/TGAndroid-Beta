package x2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends t1 {
    public final int f60318l;
    public final HashMap f60319m;
    public final HashMap f60320n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f60318l = Integer.MAX_VALUE;
        this.f60319m = new HashMap();
        this.f60320n = new HashMap();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        e2.l1 vVar;
        int i7 = this.f60318l;
        if (i7 != Integer.MAX_VALUE) {
            vVar = new w(l1Var, i7);
        } else {
            vVar = new v(l1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        int i7 = this.f60318l;
        a aVar = this.f60281k;
        if (i7 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, mVar, j3);
        }
        Object obj = g0Var.f60133a;
        int i10 = l2.a.f19274g;
        g0 a10 = g0Var.a(((Pair) obj).second);
        this.f60319m.put(a10, g0Var);
        e0 c10 = aVar.c(a10, mVar, j3);
        this.f60320n.put(c10, a10);
        return c10;
    }

    @Override
    public final e2.l1 h() {
        b0 b0Var = (b0) this.f60281k;
        int i7 = this.f60318l;
        if (i7 != Integer.MAX_VALUE) {
            return new w(b0Var.f60081o, i7);
        }
        return new v(b0Var.f60081o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f60281k.o(e0Var);
        g0 g0Var = (g0) this.f60320n.remove(e0Var);
        if (g0Var != null) {
            this.f60319m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f60318l != Integer.MAX_VALUE) {
            return (g0) this.f60319m.get(g0Var);
        }
        return g0Var;
    }
}
