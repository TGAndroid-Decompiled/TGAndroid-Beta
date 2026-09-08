package u2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends p1 {
    public final int f46863l;
    public final HashMap f46864m;
    public final HashMap f46865n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f46863l = Integer.MAX_VALUE;
        this.f46864m = new HashMap();
        this.f46865n = new HashMap();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        b2.k1 uVar;
        int i10 = this.f46863l;
        if (i10 != Integer.MAX_VALUE) {
            uVar = new v(k1Var, i10);
        } else {
            uVar = new u(k1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        int i10 = this.f46863l;
        a aVar = this.f46813k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, dVar, j3);
        }
        Object obj = f0Var.f46695a;
        int i11 = i2.a.f11475g;
        f0 a2 = f0Var.a(((Pair) obj).second);
        this.f46864m.put(a2, f0Var);
        d0 c10 = aVar.c(a2, dVar, j3);
        this.f46865n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.k1 h() {
        a0 a0Var = (a0) this.f46813k;
        int i10 = this.f46863l;
        if (i10 != Integer.MAX_VALUE) {
            return new v(a0Var.f46641o, i10);
        }
        return new u(a0Var.f46641o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f46813k.o(d0Var);
        f0 f0Var = (f0) this.f46865n.remove(d0Var);
        if (f0Var != null) {
            this.f46864m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f46863l != Integer.MAX_VALUE) {
            return (f0) this.f46864m.get(f0Var);
        }
        return f0Var;
    }
}
