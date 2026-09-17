package za;
public final class f0 extends kd.c {
    public g0 f51419a;
    public Object f51420b;
    public final g0 f51421c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f51421c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51420b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f51421c, this);
    }
}
