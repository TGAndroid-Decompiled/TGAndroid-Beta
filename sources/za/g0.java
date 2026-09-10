package za;
public final class g0 extends kd.c {
    public h0 f47898a;
    public Object f47899b;
    public final h0 f47900c;
    public int d;

    public g0(h0 h0Var, kd.c cVar) {
        super(cVar);
        this.f47900c = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f47899b = obj;
        this.d |= Integer.MIN_VALUE;
        return h0.b(this.f47900c, this);
    }
}
