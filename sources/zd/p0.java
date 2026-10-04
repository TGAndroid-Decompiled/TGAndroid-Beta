package zd;

import v7.t7;
public final class p0 extends k1 {
    public final int f53253e;
    public final Object f53254f;

    public p0(Object obj, int i10) {
        this.f53253e = i10;
        this.f53254f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f53253e) {
            case 0:
                ((o0) this.f53254f).dispose();
                return;
            case 1:
                ((d1) this.f53254f).a(th2);
                return;
            case 2:
                ((u1) this.f53254f).u();
                throw null;
            case 3:
                l1 l1Var = (l1) this.f53254f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    l1Var.resumeWith(t7.a(((v) u10).f53279a));
                    return;
                } else {
                    l1Var.resumeWith(e0.u(u10));
                    return;
                }
            default:
                ((m) this.f53254f).resumeWith(gd.i.f10452a);
                return;
        }
    }

    public p0(u1 u1Var) {
        this.f53253e = 2;
        this.f53254f = u1Var;
    }
}
