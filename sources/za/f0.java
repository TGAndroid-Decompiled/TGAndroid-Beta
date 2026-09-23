package za;
public final class f0 extends kd.c {
    public Object f48715a;
    public final i0 f48716b;
    public int f48717c;

    public f0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f48716b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48715a = obj;
        this.f48717c |= Integer.MIN_VALUE;
        return i0.a(this.f48716b, this);
    }
}
