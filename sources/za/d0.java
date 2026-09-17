package za;
public final class d0 extends kd.c {
    public Object f48782a;
    public final g0 f48783b;
    public int f48784c;

    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.f48783b = g0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48782a = obj;
        this.f48784c |= Integer.MIN_VALUE;
        return g0.a(this.f48783b, this);
    }
}
