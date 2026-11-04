package zd;
public final class f extends hd.c {
    public Object f60392a;
    public int f60393b;
    public final g f60394c;
    public Object d;
    public c f60395e;

    public f(g gVar, hd.c cVar) {
        super(cVar);
        this.f60394c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f60392a = obj;
        this.f60393b |= Integer.MIN_VALUE;
        return this.f60394c.U(null, this);
    }
}
