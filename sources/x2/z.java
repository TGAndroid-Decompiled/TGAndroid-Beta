package x2;

import j$.util.Objects;
public final class z extends s {
    public static final Object h = new Object();
    public final Object f60342f;
    public final Object f60343g;

    public z(e2.l1 l1Var, Object obj, Object obj2) {
        super(l1Var);
        this.f60342f = obj;
        this.f60343g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f60343g) != null) {
            obj = obj2;
        }
        return this.f60261e.b(obj);
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        this.f60261e.f(i7, i1Var, z10);
        if (Objects.equals(i1Var.f10464b, this.f60343g) && z10) {
            i1Var.f10464b = h;
        }
        return i1Var;
    }

    @Override
    public final Object l(int i7) {
        Object l10 = this.f60261e.l(i7);
        if (Objects.equals(l10, this.f60343g)) {
            return h;
        }
        return l10;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        this.f60261e.m(i7, k1Var, j3);
        if (Objects.equals(k1Var.f10507a, this.f60342f)) {
            k1Var.f10507a = e2.k1.f10498q;
        }
        return k1Var;
    }
}
