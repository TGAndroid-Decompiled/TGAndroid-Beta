package ud;

import ld.i2;
import ld.l;
import ld.m;
import qd.t;
public final class c implements l, i2 {
    public final m f45284a;
    public final d f45285b;

    public c(d dVar, m mVar) {
        this.f45285b = dVar;
        this.f45284a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f45284a.a(tVar, i10);
    }

    @Override
    public final o3.c b(dd.l lVar, Object obj) {
        d dVar = this.f45285b;
        b bVar = new b(dVar, this, 1);
        o3.c F = this.f45284a.F(bVar, (sc.i) obj);
        if (F != null) {
            d.f45286g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f45284a.e(obj);
    }

    @Override
    public final uc.h getContext() {
        return this.f45284a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f45284a.resumeWith(obj);
    }
}
