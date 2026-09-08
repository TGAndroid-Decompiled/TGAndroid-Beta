package zd;

import v7.t7;
public final class p0 extends k1 {
    public final int f51612e;
    public final Object f51613f;

    public p0(Object obj, int i10) {
        this.f51612e = i10;
        this.f51613f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f51612e) {
            case 0:
                ((o0) this.f51613f).dispose();
                return;
            case 1:
                ((d1) this.f51613f).a(th2);
                return;
            case 2:
                ((u1) this.f51613f).u();
                throw null;
            case 3:
                l1 l1Var = (l1) this.f51613f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    l1Var.resumeWith(t7.a(((v) u10).f51638a));
                    return;
                } else {
                    l1Var.resumeWith(e0.u(u10));
                    return;
                }
            default:
                ((m) this.f51613f).resumeWith(gd.i.f10616a);
                return;
        }
    }

    public p0(u1 u1Var) {
        this.f51612e = 2;
        this.f51613f = u1Var;
    }
}
