package za;
public final class z extends kd.c {
    public Object f49115a;
    public int f49116b;
    public final k1.p f49117c;

    public z(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49117c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49115a = obj;
        this.f49116b |= Integer.MIN_VALUE;
        return this.f49117c.a(null, this);
    }
}
