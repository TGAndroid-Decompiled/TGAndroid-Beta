package za;
public final class d0 extends kd.c {
    public Object f49075a;
    public final g0 f49076b;
    public int f49077c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f49076b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49075a = obj;
        this.f49077c |= Integer.MIN_VALUE;
        return g0.a(this.f49076b, this);
    }
}
