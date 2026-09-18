package u2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends p1 {
    public final int f43541l;
    public final HashMap f43542m;
    public final HashMap f43543n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f43541l = Integer.MAX_VALUE;
        this.f43542m = new HashMap();
        this.f43543n = new HashMap();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        b2.k1 uVar;
        int i10 = this.f43541l;
        if (i10 != Integer.MAX_VALUE) {
            uVar = new v(k1Var, i10);
        } else {
            uVar = new u(k1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        int i10 = this.f43541l;
        a aVar = this.f43496k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, dVar, j3);
        }
        Object obj = f0Var.f43385a;
        int i11 = i2.a.f10614g;
        f0 a2 = f0Var.a(((Pair) obj).second);
        this.f43542m.put(a2, f0Var);
        d0 c10 = aVar.c(a2, dVar, j3);
        this.f43543n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.k1 h() {
        a0 a0Var = (a0) this.f43496k;
        int i10 = this.f43541l;
        if (i10 != Integer.MAX_VALUE) {
            return new v(a0Var.f43335o, i10);
        }
        return new u(a0Var.f43335o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f43496k.o(d0Var);
        f0 f0Var = (f0) this.f43543n.remove(d0Var);
        if (f0Var != null) {
            this.f43542m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f43541l != Integer.MAX_VALUE) {
            return (f0) this.f43542m.get(f0Var);
        }
        return f0Var;
    }
}
