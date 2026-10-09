package za;
public final class f0 extends ld.c {
    public Object f54217a;
    public final i0 f54218b;
    public int f54219c;

    public f0(i0 i0Var, ld.c cVar) {
        super(cVar);
        this.f54218b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54217a = obj;
        this.f54219c |= Integer.MIN_VALUE;
        return i0.a(this.f54218b, this);
    }
}
