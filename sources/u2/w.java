package u2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends p1 {
    public final int f48739l;
    public final HashMap f48740m;
    public final HashMap f48741n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f48739l = Integer.MAX_VALUE;
        this.f48740m = new HashMap();
        this.f48741n = new HashMap();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        b2.k1 uVar;
        int i10 = this.f48739l;
        if (i10 != Integer.MAX_VALUE) {
            uVar = new v(k1Var, i10);
        } else {
            uVar = new u(k1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        int i10 = this.f48739l;
        a aVar = this.f48689k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, dVar, j3);
        }
        Object obj = f0Var.f48572a;
        int i11 = i2.a.f11600g;
        f0 a2 = f0Var.a(((Pair) obj).second);
        this.f48740m.put(a2, f0Var);
        d0 c10 = aVar.c(a2, dVar, j3);
        this.f48741n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.k1 h() {
        a0 a0Var = (a0) this.f48689k;
        int i10 = this.f48739l;
        if (i10 != Integer.MAX_VALUE) {
            return new v(a0Var.f48518o, i10);
        }
        return new u(a0Var.f48518o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f48689k.o(d0Var);
        f0 f0Var = (f0) this.f48741n.remove(d0Var);
        if (f0Var != null) {
            this.f48740m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f48739l != Integer.MAX_VALUE) {
            return (f0) this.f48740m.get(f0Var);
        }
        return f0Var;
    }
}
