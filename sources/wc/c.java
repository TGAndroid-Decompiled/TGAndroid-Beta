package wc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import ld.a0;
import ld.m;
public abstract class c extends a {
    private final uc.h _context;
    private transient uc.c intercepted;

    public c(uc.c cVar, uc.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public uc.h getContext() {
        uc.h hVar = this._context;
        j.b(hVar);
        return hVar;
    }

    public final uc.c intercepted() {
        uc.c cVar;
        uc.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            uc.e eVar = (uc.e) getContext().get(uc.d.f48479a);
            if (eVar != null) {
                cVar = new qd.h((a0) eVar, this);
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
        uc.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            uc.f fVar = getContext().get(uc.d.f48479a);
            j.b(fVar);
            uc.e eVar = (uc.e) fVar;
            qd.h hVar = (qd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.h.f44800n;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == qd.a.d);
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
        this.intercepted = b.f49489a;
    }

    public c(uc.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
