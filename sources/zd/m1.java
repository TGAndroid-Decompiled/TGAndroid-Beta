package zd;
public final class m1 extends k1 {
    public final u1 e;
    public final n1 f49210f;
    public final q h;
    public final Object f49211n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.e = u1Var;
        this.f49210f = n1Var;
        this.h = qVar;
        this.f49211n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.e;
        n1 n1Var = this.f49210f;
        Object obj = this.f49211n;
        if (D != null) {
            while (e0.n(D.e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.f49243a) {
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
