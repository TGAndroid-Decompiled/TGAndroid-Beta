package u2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends o1 {
    public final int f48955l;
    public final HashMap f48956m;
    public final HashMap f48957n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f48955l = Integer.MAX_VALUE;
        this.f48956m = new HashMap();
        this.f48957n = new HashMap();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        b2.k1 uVar;
        int i10 = this.f48955l;
        if (i10 != Integer.MAX_VALUE) {
            uVar = new v(k1Var, i10);
        } else {
            uVar = new u(k1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        int i10 = this.f48955l;
        a aVar = this.f48887k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, dVar, j3);
        }
        Object obj = f0Var.f48781a;
        int i11 = i2.a.f11598g;
        f0 a2 = f0Var.a(((Pair) obj).second);
        this.f48956m.put(a2, f0Var);
        d0 c10 = aVar.c(a2, dVar, j3);
        this.f48957n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.k1 h() {
        a0 a0Var = (a0) this.f48887k;
        int i10 = this.f48955l;
        if (i10 != Integer.MAX_VALUE) {
            return new v(a0Var.f48749o, i10);
        }
        return new u(a0Var.f48749o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f48887k.o(d0Var);
        f0 f0Var = (f0) this.f48957n.remove(d0Var);
        if (f0Var != null) {
            this.f48956m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f48955l != Integer.MAX_VALUE) {
            return (f0) this.f48956m.get(f0Var);
        }
        return f0Var;
    }
}
