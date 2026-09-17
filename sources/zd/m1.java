package zd;
public final class m1 extends k1 {
    public final u1 f51573e;
    public final n1 f51574f;
    public final q h;
    public final Object f51575n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.f51573e = u1Var;
        this.f51574f = n1Var;
        this.h = qVar;
        this.f51575n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.f51573e;
        n1 n1Var = this.f51574f;
        Object obj = this.f51575n;
        if (D != null) {
            while (e0.n(D.f51587e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.f51614a) {
                D = u1.D(D);
                if (D == null) {
                    u1Var.f(u1Var.o(n1Var, obj));
                }
            }
            return;
        }
        u1Var.f(u1Var.o(n1Var, obj));
    }
}
