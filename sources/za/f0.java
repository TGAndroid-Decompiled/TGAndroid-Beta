package za;
public final class f0 extends kd.c {
    public g0 f53090a;
    public Object f53091b;
    public final g0 f53092c;
    public int d;

    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f53092c = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53091b = obj;
        this.d |= Integer.MIN_VALUE;
        return g0.b(this.f53092c, this);
    }
}
