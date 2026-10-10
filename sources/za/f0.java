package za;
public final class f0 extends ld.c {
    public Object f54263a;
    public final i0 f54264b;
    public int f54265c;

    public f0(i0 i0Var, ld.c cVar) {
        super(cVar);
        this.f54264b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54263a = obj;
        this.f54265c |= Integer.MIN_VALUE;
        return i0.a(this.f54264b, this);
    }
}
