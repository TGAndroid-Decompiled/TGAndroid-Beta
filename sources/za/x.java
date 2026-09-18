package za;
public final class x extends kd.c {
    public Object f48863a;
    public int f48864b;
    public final k1.p f48865c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f48865c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f48863a = obj;
        this.f48864b |= Integer.MIN_VALUE;
        return this.f48865c.a(null, this);
    }
}
