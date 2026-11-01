package wd;
public final class f extends ed.c {
    public g f52830a;
    public Object f52831b;
    public final g f52832c;
    public int d;

    public f(g gVar, ed.c cVar) {
        super(cVar);
        this.f52832c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f52831b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f52832c.b(null, this);
    }
}
