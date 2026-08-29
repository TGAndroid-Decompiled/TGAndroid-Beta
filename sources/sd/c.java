package sd;

import jd.i2;
import jd.l;
import jd.m;
import od.u;
public final class c implements l, i2 {
    public final m f47714a;
    public final d f47715b;

    public c(d dVar, m mVar) {
        this.f47715b = dVar;
        this.f47714a = mVar;
    }

    @Override
    public final fc.a a(bd.l lVar, Object obj) {
        d dVar = this.f47715b;
        b bVar = new b(dVar, this, 1);
        fc.a F = this.f47714a.F(bVar, (qc.i) obj);
        if (F != null) {
            d.f47716g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void b(u uVar, int i10) {
        this.f47714a.b(uVar, i10);
    }

    @Override
    public final void e(Object obj) {
        this.f47714a.e(obj);
    }

    @Override
    public final sc.h getContext() {
        return this.f47714a.f11494e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f47714a.resumeWith(obj);
    }
}
