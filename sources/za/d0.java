package za;
public final class d0 extends kd.c {
    public Object f49013a;
    public final g0 f49014b;
    public int f49015c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f49014b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49013a = obj;
        this.f49015c |= Integer.MIN_VALUE;
        return g0.a(this.f49014b, this);
    }
}
