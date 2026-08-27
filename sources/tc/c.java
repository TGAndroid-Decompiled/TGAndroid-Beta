package tc;

import id.a0;
import id.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;

public abstract class c extends a {
    private final rc.h _context;
    private transient rc.c intercepted;

    public c(rc.c cVar, rc.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public rc.h getContext() {
        rc.h hVar = this._context;
        j.b(hVar);
        return hVar;
    }

    public final rc.c intercepted() {
        rc.c cVar = this.intercepted;
        if (cVar != null) {
            return cVar;
        }
        rc.e eVar = (rc.e) getContext().get(rc.d.f46898a);
        rc.c hVar = eVar != null ? new nd.h((a0) eVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override
    public void releaseIntercepted() {
        rc.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            rc.f fVar = getContext().get(rc.d.f46898a);
            j.b(fVar);
            nd.h hVar = (nd.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.h.f18486n;
            while (atomicReferenceFieldUpdater.get(hVar) == nd.a.d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            m mVar = obj instanceof m ? (m) obj : null;
            if (mVar != null) {
                mVar.o();
            }
        }
        this.intercepted = b.f48156a;
    }

    public c(rc.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
