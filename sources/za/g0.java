package za;
public final class g0 extends ld.c {
    public h0 f54462a;
    public Object f54463b;
    public final h0 f54464c;
    public int d;

    public g0(h0 h0Var, ld.c cVar) {
        super(cVar);
        this.f54464c = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54463b = obj;
        this.d |= Integer.MIN_VALUE;
        return h0.b(this.f54464c, this);
    }
}
