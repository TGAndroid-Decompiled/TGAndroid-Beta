package x2;

import j$.util.Objects;
public final class z extends s {
    public static final Object h = new Object();
    public final Object f58439f;
    public final Object f58440g;

    public z(e2.l1 l1Var, Object obj, Object obj2) {
        super(l1Var);
        this.f58439f = obj;
        this.f58440g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f58440g) != null) {
            obj = obj2;
        }
        return this.f58360e.b(obj);
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        this.f58360e.f(i7, i1Var, z9);
        if (Objects.equals(i1Var.f10281b, this.f58440g) && z9) {
            i1Var.f10281b = h;
        }
        return i1Var;
    }

    @Override
    public final Object l(int i7) {
        Object l10 = this.f58360e.l(i7);
        if (Objects.equals(l10, this.f58440g)) {
            return h;
        }
        return l10;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        this.f58360e.m(i7, k1Var, j3);
        if (Objects.equals(k1Var.f10324a, this.f58439f)) {
            k1Var.f10324a = e2.k1.f10315q;
        }
        return k1Var;
    }
}
