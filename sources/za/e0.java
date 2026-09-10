package za;
public final class e0 extends kd.c {
    public Object f47882a;
    public final h0 f47883b;
    public int f47884c;

    public e0(h0 h0Var, kd.c cVar) {
        super(cVar);
        this.f47883b = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f47882a = obj;
        this.f47884c |= Integer.MIN_VALUE;
        return h0.a(this.f47883b, this);
    }
}
