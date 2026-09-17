package za;
public final class d0 extends kd.c {
    public Object f51432a;
    public final g0 f51433b;
    public int f51434c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f51433b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51432a = obj;
        this.f51434c |= Integer.MIN_VALUE;
        return g0.a(this.f51433b, this);
    }
}
