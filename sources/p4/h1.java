package p4;
public final class h1 extends e2.l1 {
    public static final Object f55270j = new Object();
    public final e2.l0 f55271e;
    public final boolean f55272f;
    public final boolean f55273g;
    public final e2.f0 h;
    public final long f55274i;

    public h1(i1 i1Var) {
        e2.f0 f0Var;
        this.f55271e = i1Var.w();
        this.f55272f = i1Var.e0();
        this.f55273g = i1Var.v0();
        if (i1Var.P0()) {
            f0Var = e2.f0.f10390f;
        } else {
            f0Var = null;
        }
        this.h = f0Var;
        this.f55274i = h2.l0.S(i1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f55270j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        i1Var.getClass();
        e2.c cVar = e2.c.f10344c;
        Object obj = f55270j;
        i1Var.h(obj, obj, 0, this.f55274i, 0L, cVar, false);
        i1Var.f10438f = false;
        return i1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i7) {
        return f55270j;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        k1Var.b(f55270j, this.f55271e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f55272f, this.f55273g, this.h, 0L, this.f55274i, 0, 0, 0L);
        k1Var.f10486k = false;
        return k1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
