package u2;

import j$.util.Objects;
public final class z extends s {
    public static final Object h = new Object();
    public final Object f42504f;
    public final Object f42505g;

    public z(b2.k1 k1Var, Object obj, Object obj2) {
        super(k1Var);
        this.f42504f = obj;
        this.f42505g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f42505g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        this.e.f(i10, h1Var, z10);
        if (Objects.equals(h1Var.f1706b, this.f42505g) && z10) {
            h1Var.f1706b = h;
        }
        return h1Var;
    }

    @Override
    public final Object l(int i10) {
        Object l4 = this.e.l(i10);
        if (Objects.equals(l4, this.f42505g)) {
            return h;
        }
        return l4;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        this.e.m(i10, j1Var, j3);
        if (Objects.equals(j1Var.f1751a, this.f42504f)) {
            j1Var.f1751a = b2.j1.f1742q;
        }
        return j1Var;
    }
}
