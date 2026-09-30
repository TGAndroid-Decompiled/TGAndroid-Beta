package za;
public final class z extends kd.c {
    public Object f49117a;
    public int f49118b;
    public final k1.p f49119c;

    public z(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49119c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49117a = obj;
        this.f49118b |= Integer.MIN_VALUE;
        return this.f49119c.a(null, this);
    }
}
