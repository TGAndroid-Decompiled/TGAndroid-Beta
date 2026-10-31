package u2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends t1 {
    public final int f50047l;
    public final HashMap f50048m;
    public final HashMap f50049n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f50047l = Integer.MAX_VALUE;
        this.f50048m = new HashMap();
        this.f50049n = new HashMap();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        b2.o1 vVar;
        int i10 = this.f50047l;
        if (i10 != Integer.MAX_VALUE) {
            vVar = new w(o1Var, i10);
        } else {
            vVar = new v(o1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        int i10 = this.f50047l;
        a aVar = this.f50013k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, a0Var, j10);
        }
        Object obj = g0Var.f49875a;
        int i11 = i2.a.f7788g;
        g0 a2 = g0Var.a(((Pair) obj).second);
        this.f50048m.put(a2, g0Var);
        e0 c10 = aVar.c(a2, a0Var, j10);
        this.f50049n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.o1 h() {
        b0 b0Var = (b0) this.f50013k;
        int i10 = this.f50047l;
        if (i10 != Integer.MAX_VALUE) {
            return new w(b0Var.f49827o, i10);
        }
        return new v(b0Var.f49827o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f50013k.o(e0Var);
        g0 g0Var = (g0) this.f50049n.remove(e0Var);
        if (g0Var != null) {
            this.f50048m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f50047l != Integer.MAX_VALUE) {
            return (g0) this.f50048m.get(g0Var);
        }
        return g0Var;
    }
}
