package rd;

import id.j2;
import id.l;
import id.m;
import java.lang.reflect.InvocationTargetException;
import nd.t;

public final class c implements l, j2 {

    public final m f46902a;

    public final d f46903b;

    public c(d dVar, m mVar) {
        this.f46903b = dVar;
        this.f46902a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f46902a.a(tVar, i10);
    }

    @Override
    public final ec.a b(ad.l lVar, Object obj) {
        d dVar = this.f46903b;
        b bVar = new b(dVar, this, 1);
        ec.a aVarF = this.f46902a.F(bVar, (pc.i) obj);
        if (aVarF != null) {
            d.f46904g.set(dVar, null);
        }
        return aVarF;
    }

    @Override
    public final void e(Object obj) {
        this.f46902a.e(obj);
    }

    @Override
    public final rc.h getContext() {
        return this.f46902a.f11167e;
    }

    @Override
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        this.f46902a.resumeWith(obj);
    }
}
