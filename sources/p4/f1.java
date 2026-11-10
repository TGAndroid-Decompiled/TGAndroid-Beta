package p4;
public final class f1 extends e2.l1 {
    public static final Object f53284j = new Object();
    public final e2.l0 f53285e;
    public final boolean f53286f;
    public final boolean f53287g;
    public final e2.f0 h;
    public final long f53288i;

    public f1(g1 g1Var) {
        e2.f0 f0Var;
        this.f53285e = g1Var.w();
        this.f53286f = g1Var.e0();
        this.f53287g = g1Var.v0();
        if (g1Var.P0()) {
            f0Var = e2.f0.f10241f;
        } else {
            f0Var = null;
        }
        this.h = f0Var;
        this.f53288i = h2.m0.S(g1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f53284j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        i1Var.getClass();
        e2.c cVar = e2.c.f10195c;
        Object obj = f53284j;
        i1Var.h(obj, obj, 0, this.f53288i, 0L, cVar, false);
        i1Var.f10289f = false;
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        return f53284j;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        k1Var.b(f53284j, this.f53285e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f53286f, this.f53287g, this.h, 0L, this.f53288i, 0, 0, 0L);
        k1Var.f10337k = false;
        return k1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
