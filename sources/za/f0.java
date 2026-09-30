package za;
public final class f0 extends kd.c {
    public Object f49151a;
    public final i0 f49152b;
    public int f49153c;

    public f0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f49152b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49151a = obj;
        this.f49153c |= Integer.MIN_VALUE;
        return i0.a(this.f49152b, this);
    }
}
