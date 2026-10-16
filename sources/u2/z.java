package u2;

import j$.util.Objects;
public final class z extends s {
    public static final Object h = new Object();
    public final Object f46108f;
    public final Object f46109g;

    public z(b2.p1 p1Var, Object obj, Object obj2) {
        super(p1Var);
        this.f46108f = obj;
        this.f46109g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f46109g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        this.e.f(i10, m1Var, z10);
        if (Objects.equals(m1Var.f2216b, this.f46109g) && z10) {
            m1Var.f2216b = h;
        }
        return m1Var;
    }

    @Override
    public final Object l(int i10) {
        Object l4 = this.e.l(i10);
        if (Objects.equals(l4, this.f46109g)) {
            return h;
        }
        return l4;
    }

    @Override
    public final b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        this.e.m(i10, o1Var, j10);
        if (Objects.equals(o1Var.f2262a, this.f46108f)) {
            o1Var.f2262a = b2.o1.f2253q;
        }
        return o1Var;
    }
}
