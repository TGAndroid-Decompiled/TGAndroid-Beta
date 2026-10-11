package za;
public final class e0 extends ld.c {
    public Object f54333a;
    public final h0 f54334b;
    public int f54335c;

    public e0(h0 h0Var, ld.c cVar) {
        super(cVar);
        this.f54334b = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54333a = obj;
        this.f54335c |= Integer.MIN_VALUE;
        return h0.a(this.f54334b, this);
    }
}
