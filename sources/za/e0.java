package za;
public final class e0 extends ld.c {
    public Object f54444a;
    public final h0 f54445b;
    public int f54446c;

    public e0(h0 h0Var, ld.c cVar) {
        super(cVar);
        this.f54445b = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54444a = obj;
        this.f54446c |= Integer.MIN_VALUE;
        return h0.a(this.f54445b, this);
    }
}
