package qd;

import hd.j2;
import hd.l;
import hd.m;
import md.t;
public final class c implements l, j2 {
    public final m f46143a;
    public final d f46144b;

    public c(d dVar, m mVar) {
        this.f46144b = dVar;
        this.f46143a = mVar;
    }

    @Override
    public final void a(t tVar, int i9) {
        this.f46143a.a(tVar, i9);
    }

    @Override
    public final e5.c b(zc.l lVar, Object obj) {
        d dVar = this.f46144b;
        b bVar = new b(dVar, this, 1);
        e5.c F = this.f46143a.F(bVar, (oc.i) obj);
        if (F != null) {
            d.f46145g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f46143a.e(obj);
    }

    @Override
    public final qc.h getContext() {
        return this.f46143a.f10458e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f46143a.resumeWith(obj);
    }
}
