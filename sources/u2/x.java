package u2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends t1 {
    public final int f47493l;
    public final HashMap f47494m;
    public final HashMap f47495n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f47493l = Integer.MAX_VALUE;
        this.f47494m = new HashMap();
        this.f47495n = new HashMap();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        b2.o1 vVar;
        int i10 = this.f47493l;
        if (i10 != Integer.MAX_VALUE) {
            vVar = new w(o1Var, i10);
        } else {
            vVar = new v(o1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        int i10 = this.f47493l;
        a aVar = this.f47459k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, eVar, j10);
        }
        Object obj = g0Var.f47327a;
        int i11 = i2.a.f12307g;
        g0 a2 = g0Var.a(((Pair) obj).second);
        this.f47494m.put(a2, g0Var);
        e0 c10 = aVar.c(a2, eVar, j10);
        this.f47495n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.o1 h() {
        b0 b0Var = (b0) this.f47459k;
        int i10 = this.f47493l;
        if (i10 != Integer.MAX_VALUE) {
            return new w(b0Var.f47276o, i10);
        }
        return new v(b0Var.f47276o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f47459k.o(e0Var);
        g0 g0Var = (g0) this.f47495n.remove(e0Var);
        if (g0Var != null) {
            this.f47494m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f47493l != Integer.MAX_VALUE) {
            return (g0) this.f47494m.get(g0Var);
        }
        return g0Var;
    }
}
