package u2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends p1 {
    public final int f43851l;
    public final HashMap f43852m;
    public final HashMap f43853n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f43851l = Integer.MAX_VALUE;
        this.f43852m = new HashMap();
        this.f43853n = new HashMap();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        b2.k1 uVar;
        int i10 = this.f43851l;
        if (i10 != Integer.MAX_VALUE) {
            uVar = new v(k1Var, i10);
        } else {
            uVar = new u(k1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        int i10 = this.f43851l;
        a aVar = this.f43796k;
        if (i10 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, dVar, j3);
        }
        Object obj = f0Var.f43687a;
        int i11 = i2.a.f10602g;
        f0 a2 = f0Var.a(((Pair) obj).second);
        this.f43852m.put(a2, f0Var);
        d0 c10 = aVar.c(a2, dVar, j3);
        this.f43853n.put(c10, a2);
        return c10;
    }

    @Override
    public final b2.k1 h() {
        a0 a0Var = (a0) this.f43796k;
        int i10 = this.f43851l;
        if (i10 != Integer.MAX_VALUE) {
            return new v(a0Var.f43637o, i10);
        }
        return new u(a0Var.f43637o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f43796k.o(d0Var);
        f0 f0Var = (f0) this.f43853n.remove(d0Var);
        if (f0Var != null) {
            this.f43852m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f43851l != Integer.MAX_VALUE) {
            return (f0) this.f43852m.get(f0Var);
        }
        return f0Var;
    }
}
