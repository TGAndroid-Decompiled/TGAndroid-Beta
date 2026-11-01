package wd;

import r2.y;
public final class a extends ed.c {
    public xd.g f52821a;
    public Object f52822b;
    public final y f52823c;
    public int d;

    public a(y yVar, ed.c cVar) {
        super(cVar);
        this.f52823c = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f52822b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f52823c.p(null, this);
    }
}
