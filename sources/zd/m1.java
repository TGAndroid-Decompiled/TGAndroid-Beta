package zd;
public final class m1 extends k1 {
    public final u1 f51604e;
    public final n1 f51605f;
    public final q h;
    public final Object f51606n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.f51604e = u1Var;
        this.f51605f = n1Var;
        this.h = qVar;
        this.f51606n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.f51604e;
        n1 n1Var = this.f51605f;
        Object obj = this.f51606n;
        if (D != null) {
            while (e0.n(D.f51618e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.f51645a) {
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
