package td;
public final class p0 extends k1 {
    public final int e;
    public final Object f48661f;

    public p0(Object obj, int i10) {
        this.e = i10;
        this.f48661f = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.e) {
            case 0:
                ((o0) this.f48661f).dispose();
                return;
            case 1:
                ((d1) this.f48661f).a(th2);
                return;
            case 2:
                ((u1) this.f48661f).u();
                throw null;
            case 3:
                l1 l1Var = (l1) this.f48661f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    l1Var.resumeWith(l9.b.a(((v) u10).f48682a));
                    return;
                } else {
                    l1Var.resumeWith(e0.u(u10));
                    return;
                }
            default:
                ((m) this.f48661f).resumeWith(ad.j.f401a);
                return;
        }
    }

    public p0(u1 u1Var) {
        this.e = 2;
        this.f48661f = u1Var;
    }
}
