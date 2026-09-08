package za;
public final class d0 extends kd.c {
    public Object f51431a;
    public final g0 f51432b;
    public int f51433c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f51432b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51431a = obj;
        this.f51433c |= Integer.MIN_VALUE;
        return g0.a(this.f51432b, this);
    }
}
