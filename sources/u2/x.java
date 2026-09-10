package u2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends r1 {
    public final int f42483l;
    public final HashMap f42484m;
    public final HashMap f42485n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f42483l = Integer.MAX_VALUE;
        this.f42484m = new HashMap();
        this.f42485n = new HashMap();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        b2.k1 vVar;
        int i10 = this.f42483l;
        if (i10 != Integer.MAX_VALUE) {
            vVar = new w(k1Var, i10);
        } else {
            vVar = new v(k1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        int i10 = this.f42483l;
        a aVar = this.f42441k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, dVar, j3);
        }
        Object obj = g0Var.f42324a;
        int i11 = i2.a.f10097g;
        g0 a2 = g0Var.a(((Pair) obj).second);
        this.f42484m.put(a2, g0Var);
        e0 c10 = aVar.c(a2, dVar, j3);
        this.f42485n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.k1 h() {
        b0 b0Var = (b0) this.f42441k;
        int i10 = this.f42483l;
        if (i10 != Integer.MAX_VALUE) {
            return new w(b0Var.f42276o, i10);
        }
        return new v(b0Var.f42276o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f42441k.o(e0Var);
        g0 g0Var = (g0) this.f42485n.remove(e0Var);
        if (g0Var != null) {
            this.f42484m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f42483l != Integer.MAX_VALUE) {
            return (g0) this.f42484m.get(g0Var);
        }
        return g0Var;
    }
}
