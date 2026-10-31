package td;
public final class m1 extends k1 {
    public final u1 e;
    public final n1 f48643f;
    public final q h;
    public final Object f48644n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.e = u1Var;
        this.f48643f = n1Var;
        this.h = qVar;
        this.f48644n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.e;
        n1 n1Var = this.f48643f;
        Object obj = this.f48644n;
        if (D != null) {
            while (e0.n(D.e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.f48676a) {
                D = u1.D(D);
                if (D == null) {
                    u1Var.b(u1Var.o(n1Var, obj));
                }
            }
            return;
        }
        u1Var.b(u1Var.o(n1Var, obj));
    }
}
