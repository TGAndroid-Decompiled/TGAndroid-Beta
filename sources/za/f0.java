package za;
public final class f0 extends kd.c {
    public Object f49032a;
    public final i0 f49033b;
    public int f49034c;

    public f0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f49033b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49032a = obj;
        this.f49034c |= Integer.MIN_VALUE;
        return i0.a(this.f49033b, this);
    }
}
