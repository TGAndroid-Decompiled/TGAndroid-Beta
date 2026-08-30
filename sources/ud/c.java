package ud;

import ld.i2;
import ld.l;
import ld.m;
import qd.t;
public final class c implements l, i2 {
    public final m f45222a;
    public final d f45223b;

    public c(d dVar, m mVar) {
        this.f45223b = dVar;
        this.f45222a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f45222a.a(tVar, i10);
    }

    @Override
    public final i5.c b(dd.l lVar, Object obj) {
        d dVar = this.f45223b;
        b bVar = new b(dVar, this, 1);
        i5.c F = this.f45222a.F(bVar, (sc.i) obj);
        if (F != null) {
            d.f45224g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f45222a.e(obj);
    }

    @Override
    public final uc.h getContext() {
        return this.f45222a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f45222a.resumeWith(obj);
    }
}
