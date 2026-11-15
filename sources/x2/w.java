package x2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends s1 {
    public final int f59700l;
    public final HashMap f59701m;
    public final HashMap f59702n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f59700l = Integer.MAX_VALUE;
        this.f59701m = new HashMap();
        this.f59702n = new HashMap();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        e2.l1 uVar;
        int i7 = this.f59700l;
        if (i7 != Integer.MAX_VALUE) {
            uVar = new v(l1Var, i7);
        } else {
            uVar = new u(l1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        int i7 = this.f59700l;
        a aVar = this.f59663k;
        if (i7 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, mVar, j3);
        }
        Object obj = f0Var.f59523a;
        int i10 = l2.a.f18879g;
        f0 a10 = f0Var.a(((Pair) obj).second);
        this.f59701m.put(a10, f0Var);
        d0 c10 = aVar.c(a10, mVar, j3);
        this.f59702n.put(c10, a10);
        return c10;
    }

    @Override
    public final e2.l1 h() {
        a0 a0Var = (a0) this.f59663k;
        int i7 = this.f59700l;
        if (i7 != Integer.MAX_VALUE) {
            return new v(a0Var.f59468o, i7);
        }
        return new u(a0Var.f59468o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f59663k.o(d0Var);
        f0 f0Var = (f0) this.f59702n.remove(d0Var);
        if (f0Var != null) {
            this.f59701m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f59700l != Integer.MAX_VALUE) {
            return (f0) this.f59701m.get(f0Var);
        }
        return f0Var;
    }
}
