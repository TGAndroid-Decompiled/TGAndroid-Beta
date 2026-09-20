package za;
public final class f0 extends kd.c {
    public g0 f49075a;
    public Object f49076b;
    public final g0 f49077c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f49077c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49076b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f49077c, this);
    }
}
