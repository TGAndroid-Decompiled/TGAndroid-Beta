package zd;
public final class o extends hd.c {
    public l f60423a;
    public Object f60424b;
    public int f60425c;
    public final l d;
    public Object f60426e;

    public o(l lVar, fd.c cVar) {
        super(cVar);
        this.d = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f60424b = obj;
        this.f60425c |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
