package p4;
public final class f1 extends e2.l1 {
    public static final Object f53179j = new Object();
    public final e2.l0 f53180e;
    public final boolean f53181f;
    public final boolean f53182g;
    public final e2.f0 h;
    public final long f53183i;

    public f1(g1 g1Var) {
        e2.f0 f0Var;
        this.f53180e = g1Var.w();
        this.f53181f = g1Var.e0();
        this.f53182g = g1Var.v0();
        if (g1Var.P0()) {
            f0Var = e2.f0.f10236f;
        } else {
            f0Var = null;
        }
        this.h = f0Var;
        this.f53183i = h2.m0.S(g1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f53179j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        i1Var.getClass();
        e2.c cVar = e2.c.f10190c;
        Object obj = f53179j;
        i1Var.h(obj, obj, 0, this.f53183i, 0L, cVar, false);
        i1Var.f10284f = false;
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        return f53179j;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        k1Var.b(f53179j, this.f53180e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f53181f, this.f53182g, this.h, 0L, this.f53183i, 0, 0, 0L);
        k1Var.f10332k = false;
        return k1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
