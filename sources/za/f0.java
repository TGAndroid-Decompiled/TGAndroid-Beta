package za;
public final class f0 extends kd.c {
    public g0 f48775a;
    public Object f48776b;
    public final g0 f48777c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f48777c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48776b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f48777c, this);
    }
}
