package zd;
public final class m extends hd.c {
    public ae.q f60416a;
    public Object f60417b;
    public Object f60418c;
    public final ae.q d;
    public int f60419e;

    public m(ae.q qVar, fd.c cVar) {
        super(cVar);
        this.d = qVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f60418c = obj;
        this.f60419e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
