package wd;
public final class h extends ed.c {
    public i f52835a;
    public Object f52836b;
    public Object f52837c;
    public final i d;
    public int e;

    public h(i iVar, ed.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f52837c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
