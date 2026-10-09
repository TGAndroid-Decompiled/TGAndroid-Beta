package za;
public final class f0 extends ld.c {
    public Object f54219a;
    public final i0 f54220b;
    public int f54221c;

    public f0(i0 i0Var, ld.c cVar) {
        super(cVar);
        this.f54220b = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54219a = obj;
        this.f54221c |= Integer.MIN_VALUE;
        return i0.a(this.f54220b, this);
    }
}
