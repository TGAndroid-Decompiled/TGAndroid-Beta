package zd;
public final class m1 extends k1 {
    public final u1 f53245e;
    public final n1 f53246f;
    public final q h;
    public final Object f53247n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.f53245e = u1Var;
        this.f53246f = n1Var;
        this.h = qVar;
        this.f53247n = obj;
    }

    @Override
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.f53245e;
        n1 n1Var = this.f53246f;
        Object obj = this.f53247n;
        if (D != null) {
            while (e0.n(D.f53259e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.f53286a) {
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
