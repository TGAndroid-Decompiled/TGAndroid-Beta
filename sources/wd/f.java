package wd;
public final class f extends ed.c {
    public g f52812a;
    public Object f52813b;
    public final g f52814c;
    public int d;

    public f(g gVar, ed.c cVar) {
        super(cVar);
        this.f52814c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f52813b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f52814c.b(null, this);
    }
}
