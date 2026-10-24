package u2;

import j$.util.Objects;
public final class a0 extends t {
    public static final Object h = new Object();
    public final Object f47693f;
    public final Object f47694g;

    public a0(b2.o1 o1Var, Object obj, Object obj2) {
        super(o1Var);
        this.f47693f = obj;
        this.f47694g = obj2;
    }

    @Override
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.f47694g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        this.e.f(i10, l1Var, z10);
        if (Objects.equals(l1Var.f3828b, this.f47694g) && z10) {
            l1Var.f3828b = h;
        }
        return l1Var;
    }

    @Override
    public final Object l(int i10) {
        Object l4 = this.e.l(i10);
        if (Objects.equals(l4, this.f47694g)) {
            return h;
        }
        return l4;
    }

    @Override
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        this.e.m(i10, n1Var, j10);
        if (Objects.equals(n1Var.f3874a, this.f47693f)) {
            n1Var.f3874a = b2.n1.f3865q;
        }
        return n1Var;
    }
}
