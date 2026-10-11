package za;
public final class g0 extends ld.c {
    public h0 f54351a;
    public Object f54352b;
    public final h0 f54353c;
    public int d;

    public g0(h0 h0Var, ld.c cVar) {
        super(cVar);
        this.f54353c = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54352b = obj;
        this.d |= Integer.MIN_VALUE;
        return h0.b(this.f54353c, this);
    }
}
