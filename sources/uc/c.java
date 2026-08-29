package uc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.a0;
import jd.m;
import kotlin.jvm.internal.j;
public abstract class c extends a {
    private final sc.h _context;
    private transient sc.c intercepted;

    public c(sc.c cVar, sc.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public sc.h getContext() {
        sc.h hVar = this._context;
        j.b(hVar);
        return hVar;
    }

    public final sc.c intercepted() {
        sc.c cVar;
        sc.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            sc.e eVar = (sc.e) getContext().get(sc.d.f47710a);
            if (eVar != null) {
                cVar = new od.h((a0) eVar, this);
            } else {
                cVar = this;
            }
            this.intercepted = cVar;
            return cVar;
        }
        return cVar2;
    }

    @Override
    public void releaseIntercepted() {
        m mVar;
        sc.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            sc.f fVar = getContext().get(sc.d.f47710a);
            j.b(fVar);
            sc.e eVar = (sc.e) fVar;
            od.h hVar = (od.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = od.h.f19513n;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == od.a.d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof m) {
                mVar = (m) obj;
            } else {
                mVar = null;
            }
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.f49168a;
    }

    public c(sc.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
