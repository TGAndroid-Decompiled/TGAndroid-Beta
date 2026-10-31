package wd;
public final class d extends ed.c {
    public Object f52806a;
    public int f52807b;
    public final u9.b f52808c;
    public u9.b d;
    public c e;

    public d(u9.b bVar, ed.c cVar) {
        super(cVar);
        this.f52808c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f52806a = obj;
        this.f52807b |= Integer.MIN_VALUE;
        return this.f52808c.p(null, this);
    }
}
