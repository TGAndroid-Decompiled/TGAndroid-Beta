package u2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends t1 {
    public final int f47472l;
    public final HashMap f47473m;
    public final HashMap f47474n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f47472l = Integer.MAX_VALUE;
        this.f47473m = new HashMap();
        this.f47474n = new HashMap();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        b2.o1 vVar;
        int i10 = this.f47472l;
        if (i10 != Integer.MAX_VALUE) {
            vVar = new w(o1Var, i10);
        } else {
            vVar = new v(o1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        int i10 = this.f47472l;
        a aVar = this.f47438k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, eVar, j10);
        }
        Object obj = g0Var.f47306a;
        int i11 = i2.a.f12306g;
        g0 a2 = g0Var.a(((Pair) obj).second);
        this.f47473m.put(a2, g0Var);
        e0 c10 = aVar.c(a2, eVar, j10);
        this.f47474n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.o1 h() {
        b0 b0Var = (b0) this.f47438k;
        int i10 = this.f47472l;
        if (i10 != Integer.MAX_VALUE) {
            return new w(b0Var.f47255o, i10);
        }
        return new v(b0Var.f47255o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f47438k.o(e0Var);
        g0 g0Var = (g0) this.f47474n.remove(e0Var);
        if (g0Var != null) {
            this.f47473m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f47472l != Integer.MAX_VALUE) {
            return (g0) this.f47473m.get(g0Var);
        }
        return g0Var;
    }
}
