package x2;

import android.util.Pair;
import java.util.HashMap;
public final class w extends r1 {
    public final int f58517l;
    public final HashMap f58518m;
    public final HashMap f58519n;

    public w(a aVar) {
        super(new a0(aVar, false));
        this.f58517l = Integer.MAX_VALUE;
        this.f58518m = new HashMap();
        this.f58519n = new HashMap();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        e2.l1 uVar;
        int i7 = this.f58517l;
        if (i7 != Integer.MAX_VALUE) {
            uVar = new v(l1Var, i7);
        } else {
            uVar = new u(l1Var, 0);
        }
        n(uVar);
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        int i7 = this.f58517l;
        a aVar = this.f58466k;
        if (i7 == Integer.MAX_VALUE) {
            return aVar.c(f0Var, mVar, j3);
        }
        Object obj = f0Var.f58342a;
        int i10 = l2.a.f17740g;
        f0 a10 = f0Var.a(((Pair) obj).second);
        this.f58518m.put(a10, f0Var);
        d0 c10 = aVar.c(a10, mVar, j3);
        this.f58519n.put(c10, a10);
        return c10;
    }

    @Override
    public final e2.l1 h() {
        a0 a0Var = (a0) this.f58466k;
        int i7 = this.f58517l;
        if (i7 != Integer.MAX_VALUE) {
            return new v(a0Var.f58287o, i7);
        }
        return new u(a0Var.f58287o, 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(d0 d0Var) {
        this.f58466k.o(d0Var);
        f0 f0Var = (f0) this.f58519n.remove(d0Var);
        if (f0Var != null) {
            this.f58518m.remove(f0Var);
        }
    }

    @Override
    public final f0 z(f0 f0Var) {
        if (this.f58517l != Integer.MAX_VALUE) {
            return (f0) this.f58518m.get(f0Var);
        }
        return f0Var;
    }
}
