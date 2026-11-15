package p4;
public final class f1 extends e2.l1 {
    public static final Object f54690j = new Object();
    public final e2.l0 f54691e;
    public final boolean f54692f;
    public final boolean f54693g;
    public final e2.f0 h;
    public final long f54694i;

    public f1(g1 g1Var) {
        e2.f0 f0Var;
        this.f54691e = g1Var.w();
        this.f54692f = g1Var.e0();
        this.f54693g = g1Var.v0();
        if (g1Var.P0()) {
            f0Var = e2.f0.f10072f;
        } else {
            f0Var = null;
        }
        this.h = f0Var;
        this.f54694i = h2.l0.S(g1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f54690j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        i1Var.getClass();
        e2.c cVar = e2.c.f10026c;
        Object obj = f54690j;
        i1Var.h(obj, obj, 0, this.f54694i, 0L, cVar, false);
        i1Var.f10120f = false;
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        return f54690j;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        k1Var.b(f54690j, this.f54691e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f54692f, this.f54693g, this.h, 0L, this.f54694i, 0, 0, 0L);
        k1Var.f10168k = false;
        return k1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
