package za;
public final class y extends ld.c {
    public Object f54525a;
    public int f54526b;
    public final k1.p f54527c;

    public y(k1.p pVar, ld.c cVar) {
        super(cVar);
        this.f54527c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f54525a = obj;
        this.f54526b |= Integer.MIN_VALUE;
        return this.f54527c.b(null, this);
    }
}
