package u2;

import android.util.Pair;
import java.util.HashMap;
public final class x extends t1 {
    public final int f49465l;
    public final HashMap f49466m;
    public final HashMap f49467n;

    public x(a aVar) {
        super(new b0(aVar, false));
        this.f49465l = Integer.MAX_VALUE;
        this.f49466m = new HashMap();
        this.f49467n = new HashMap();
    }

    @Override
    public final void A(b2.p1 p1Var) {
        b2.p1 vVar;
        int i10 = this.f49465l;
        if (i10 != Integer.MAX_VALUE) {
            vVar = new w(p1Var, i10);
        } else {
            vVar = new v(p1Var, 0);
        }
        n(vVar);
    }

    @Override
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        int i10 = this.f49465l;
        a aVar = this.f49431k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(g0Var, h0Var, j10);
        }
        Object obj = g0Var.f49294a;
        int i11 = i2.a.f13472g;
        g0 a2 = g0Var.a(((Pair) obj).second);
        this.f49466m.put(a2, g0Var);
        e0 c10 = aVar.c(a2, h0Var, j10);
        this.f49467n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.p1 h() {
        b0 b0Var = (b0) this.f49431k;
        int i10 = this.f49465l;
        if (i10 != Integer.MAX_VALUE) {
            return new w(b0Var.f49246o, i10);
        }
        return new v(b0Var.f49246o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(e0 e0Var) {
        this.f49431k.o(e0Var);
        g0 g0Var = (g0) this.f49467n.remove(e0Var);
        if (g0Var != null) {
            this.f49466m.remove(g0Var);
        }
    }

    @Override
    public final g0 z(g0 g0Var) {
        if (this.f49465l != Integer.MAX_VALUE) {
            return (g0) this.f49466m.get(g0Var);
        }
        return g0Var;
    }
}
