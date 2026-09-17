package za;
public final class f0 extends kd.c {
    public g0 f48798a;
    public Object f48799b;
    public final g0 f48800c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f48800c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48799b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f48800c, this);
    }
}
