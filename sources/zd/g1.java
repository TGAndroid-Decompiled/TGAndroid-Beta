package zd;
public final class g1 extends e1 {
    public final n1 f59972e;
    public final h1 f59973f;
    public final q h;
    public final Object f59974n;

    public g1(n1 n1Var, h1 h1Var, q qVar, Object obj) {
        this.f59972e = n1Var;
        this.f59973f = h1Var;
        this.h = qVar;
        this.f59974n = obj;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void j(Throwable th2) {
        q qVar = this.h;
        q F = n1.F(qVar);
        n1 n1Var = this.f59972e;
        h1 h1Var = this.f59973f;
        Object obj = this.f59974n;
        if (F == null || !n1Var.P(h1Var, F, obj)) {
            h1Var.f59979a.c(new ee.h(2), 2);
            q F2 = n1.F(qVar);
            if (F2 != null && n1Var.P(h1Var, F2, obj)) {
                return;
            }
            n1Var.g(n1Var.q(h1Var, obj));
        }
    }
}
