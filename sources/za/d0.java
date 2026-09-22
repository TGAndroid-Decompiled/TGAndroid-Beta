package za;
public final class d0 extends kd.c {
    public Object f49079a;
    public final g0 f49080b;
    public int f49081c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f49080b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49079a = obj;
        this.f49081c |= Integer.MIN_VALUE;
        return g0.a(this.f49080b, this);
    }
}
