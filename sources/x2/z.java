package x2;

import j$.util.Objects;
public final class z extends s {
    public static final Object h = new Object();
    public final Object f60297f;
    public final Object f60298g;

    public z(e2.l1 l1Var, Object obj, Object obj2) {
        super(l1Var);
        this.f60297f = obj;
        this.f60298g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f60298g) != null) {
            obj = obj2;
        }
        return this.f60216e.b(obj);
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        this.f60216e.f(i7, i1Var, z10);
        if (Objects.equals(i1Var.f10432b, this.f60298g) && z10) {
            i1Var.f10432b = h;
        }
        return i1Var;
    }

    @Override
    public final Object l(int i7) {
        Object l10 = this.f60216e.l(i7);
        if (Objects.equals(l10, this.f60298g)) {
            return h;
        }
        return l10;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        this.f60216e.m(i7, k1Var, j3);
        if (Objects.equals(k1Var.f10475a, this.f60297f)) {
            k1Var.f10475a = e2.k1.f10466q;
        }
        return k1Var;
    }
}
