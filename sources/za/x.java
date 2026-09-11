package za;
public final class x extends kd.c {
    public Object f51483a;
    public int f51484b;
    public final k1.p f51485c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f51485c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f51483a = obj;
        this.f51484b |= Integer.MIN_VALUE;
        return this.f51485c.a(null, this);
    }
}
