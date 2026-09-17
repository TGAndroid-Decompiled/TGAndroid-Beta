package u2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends p1 {
    public final int f46836l;
    public final HashMap f46837m;
    public final HashMap f46838n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f46836l = Integer.MAX_VALUE;
        this.f46837m = new HashMap();
        this.f46838n = new HashMap();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        b2.k1 uVar;
        int i10 = this.f46836l;
        if (i10 != Integer.MAX_VALUE) {
            uVar = new v(k1Var, i10);
        } else {
            uVar = new u(k1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        int i10 = this.f46836l;
        a aVar = this.f46786k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, dVar, j3);
        }
        Object obj = f0Var.f46668a;
        int i11 = i2.a.f11449g;
        f0 a2 = f0Var.a(((Pair) obj).second);
        this.f46837m.put(a2, f0Var);
        d0 c10 = aVar.c(a2, dVar, j3);
        this.f46838n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.k1 h() {
        a0 a0Var = (a0) this.f46786k;
        int i10 = this.f46836l;
        if (i10 != Integer.MAX_VALUE) {
            return new v(a0Var.f46614o, i10);
        }
        return new u(a0Var.f46614o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f46786k.o(d0Var);
        f0 f0Var = (f0) this.f46838n.remove(d0Var);
        if (f0Var != null) {
            this.f46837m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f46836l != Integer.MAX_VALUE) {
            return (f0) this.f46837m.get(f0Var);
        }
        return f0Var;
    }
}
