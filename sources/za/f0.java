package za;
public final class f0 extends kd.c {
    public Object f49044a;
    public final i0 f49045b;
    public int f49046c;

    public f0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f49045b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49044a = obj;
        this.f49046c |= Integer.MIN_VALUE;
        return i0.a(this.f49045b, this);
    }
}
