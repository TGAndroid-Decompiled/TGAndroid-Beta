package u2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends t1 {
    public final int f46086l;
    public final HashMap f46087m;
    public final HashMap f46088n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f46086l = Integer.MAX_VALUE;
        this.f46087m = new HashMap();
        this.f46088n = new HashMap();
    }

    @Override
    public final void A(b2.p1 p1Var) {
        b2.p1 vVar;
        int i10 = this.f46086l;
        if (i10 != Integer.MAX_VALUE) {
            vVar = new w(p1Var, i10);
        } else {
            vVar = new v(p1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        int i10 = this.f46086l;
        a aVar = this.f46052k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, eVar, j10);
        }
        Object obj = g0Var.f45920a;
        int i11 = i2.a.f10911g;
        g0 a2 = g0Var.a(((Pair) obj).second);
        this.f46087m.put(a2, g0Var);
        e0 c10 = aVar.c(a2, eVar, j10);
        this.f46088n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.p1 h() {
        b0 b0Var = (b0) this.f46052k;
        int i10 = this.f46086l;
        if (i10 != Integer.MAX_VALUE) {
            return new w(b0Var.f45869o, i10);
        }
        return new v(b0Var.f45869o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f46052k.o(e0Var);
        g0 g0Var = (g0) this.f46088n.remove(e0Var);
        if (g0Var != null) {
            this.f46087m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f46086l != Integer.MAX_VALUE) {
            return (g0) this.f46087m.get(g0Var);
        }
        return g0Var;
    }
}
