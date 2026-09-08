package zd;
public final class m1 extends k1 {
    public final u1 f51603e;
    public final n1 f51604f;
    public final q h;
    public final Object f51605n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.f51603e = u1Var;
        this.f51604f = n1Var;
        this.h = qVar;
        this.f51605n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.f51603e;
        n1 n1Var = this.f51604f;
        Object obj = this.f51605n;
        if (D != null) {
            while (e0.n(D.f51617e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.f51644a) {
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
