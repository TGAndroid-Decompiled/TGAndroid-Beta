package ud;

import ld.i2;
import ld.l;
import ld.m;
import qd.t;
public final class c implements l, i2 {
    public final m f48519a;
    public final d f48520b;

    public c(d dVar, m mVar) {
        this.f48520b = dVar;
        this.f48519a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f48519a.a(tVar, i10);
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e b(dd.l lVar, Object obj) {
        d dVar = this.f48520b;
        b bVar = new b(dVar, this, 1);
        com.google.android.gms.internal.clearcut.e F = this.f48519a.F(bVar, (sc.i) obj);
        if (F != null) {
            d.f48521g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f48519a.e(obj);
    }

    @Override
    public final uc.h getContext() {
        return this.f48519a.f12330e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f48519a.resumeWith(obj);
    }
}
