package za;
public final class x extends kd.c {
    public Object f49155a;
    public int f49156b;
    public final k1.p f49157c;

    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.f49157c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f49155a = obj;
        this.f49156b |= Integer.MIN_VALUE;
        return this.f49157c.a(null, this);
    }
}
