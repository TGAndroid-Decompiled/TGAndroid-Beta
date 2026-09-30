package za;
public final class f0 extends kd.c {
    public Object f49045a;
    public final i0 f49046b;
    public int f49047c;

    public f0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f49046b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49045a = obj;
        this.f49047c |= Integer.MIN_VALUE;
        return i0.a(this.f49046b, this);
    }
}
