package p4;
public final class g1 extends e2.l1 {
    public static final Object f55387j = new Object();
    public final e2.l0 f55388e;
    public final boolean f55389f;
    public final boolean f55390g;
    public final e2.f0 h;
    public final long f55391i;

    public g1(h1 h1Var) {
        e2.f0 f0Var;
        this.f55388e = h1Var.x();
        this.f55389f = h1Var.f0();
        this.f55390g = h1Var.w0();
        if (h1Var.Q0()) {
            f0Var = e2.f0.f10380f;
        } else {
            f0Var = null;
        }
        this.h = f0Var;
        this.f55391i = h2.l0.S(h1Var.B());
    }

    @Override
    public final int b(Object obj) {
        if (f55387j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        i1Var.getClass();
        e2.c cVar = e2.c.f10334c;
        Object obj = f55387j;
        i1Var.h(obj, obj, 0, this.f55391i, 0L, cVar, false);
        i1Var.f10428f = false;
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        return f55387j;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        k1Var.b(f55387j, this.f55388e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f55389f, this.f55390g, this.h, 0L, this.f55391i, 0, 0, 0L);
        k1Var.f10476k = false;
        return k1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
