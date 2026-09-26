package za;
public final class f0 extends kd.c {
    public Object f49043a;
    public final i0 f49044b;
    public int f49045c;

    public f0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f49044b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49043a = obj;
        this.f49045c |= Integer.MIN_VALUE;
        return i0.a(this.f49044b, this);
    }
}
