package za;
public final class z extends kd.c {
    public Object f49114a;
    public int f49115b;
    public final k1.p f49116c;

    public z(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49116c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49114a = obj;
        this.f49115b |= Integer.MIN_VALUE;
        return this.f49116c.a(null, this);
    }
}
