package za;
public final class e0 extends ld.c {
    public Object f54299a;
    public final h0 f54300b;
    public int f54301c;

    public e0(h0 h0Var, ld.c cVar) {
        super(cVar);
        this.f54300b = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54299a = obj;
        this.f54301c |= Integer.MIN_VALUE;
        return h0.a(this.f54300b, this);
    }
}
