package za;
public final class x extends kd.c {
    public Object f53155a;
    public int f53156b;
    public final k1.p f53157c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f53157c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f53155a = obj;
        this.f53156b |= Integer.MIN_VALUE;
        return this.f53157c.a(null, this);
    }
}
