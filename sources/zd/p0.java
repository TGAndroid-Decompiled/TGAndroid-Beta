package zd;

import v7.t7;
public final class p0 extends k1 {
    public final int f53280e;
    public final Object f53281f;

    public p0(Object obj, int i10) {
        this.f53280e = i10;
        this.f53281f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f53280e) {
            case 0:
                ((o0) this.f53281f).dispose();
                return;
            case 1:
                ((d1) this.f53281f).a(th2);
                return;
            case 2:
                ((u1) this.f53281f).u();
                throw null;
            case 3:
                l1 l1Var = (l1) this.f53281f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    l1Var.resumeWith(t7.a(((v) u10).f53306a));
                    return;
                } else {
                    l1Var.resumeWith(e0.u(u10));
                    return;
                }
            default:
                ((m) this.f53281f).resumeWith(gd.i.f10453a);
                return;
        }
    }

    public p0(u1 u1Var) {
        this.f53280e = 2;
        this.f53281f = u1Var;
    }
}
