package za;
public final class e0 extends ld.c {
    public Object f54436a;
    public final h0 f54437b;
    public int f54438c;

    public e0(h0 h0Var, ld.c cVar) {
        super(cVar);
        this.f54437b = h0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54436a = obj;
        this.f54438c |= Integer.MIN_VALUE;
        return h0.a(this.f54437b, this);
    }
}
