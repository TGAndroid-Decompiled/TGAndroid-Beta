package za;
public final class x extends kd.c {
    public Object f53156a;
    public int f53157b;
    public final k1.p f53158c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f53158c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53156a = obj;
        this.f53157b |= Integer.MIN_VALUE;
        return this.f53158c.a(null, this);
    }
}
