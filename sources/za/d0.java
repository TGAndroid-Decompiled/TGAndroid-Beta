package za;
public final class d0 extends kd.c {
    public Object f49059a;
    public final g0 f49060b;
    public int f49061c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f49060b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49059a = obj;
        this.f49061c |= Integer.MIN_VALUE;
        return g0.a(this.f49060b, this);
    }
}
