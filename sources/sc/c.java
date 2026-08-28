package sc;

import hd.a0;
import hd.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class c extends a {
    private final qc.h _context;
    private transient qc.c intercepted;

    public c(qc.c cVar, qc.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override
    public qc.h getContext() {
        qc.h hVar = this._context;
        kotlin.jvm.internal.i.b(hVar);
        return hVar;
    }

    public final qc.c intercepted() {
        qc.c cVar;
        qc.c cVar2 = this.intercepted;
        if (cVar2 == null) {
            qc.e eVar = (qc.e) getContext().get(qc.d.f46139a);
            if (eVar != null) {
                cVar = new md.h((a0) eVar, this);
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
        qc.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            qc.f fVar = getContext().get(qc.d.f46139a);
            kotlin.jvm.internal.i.b(fVar);
            qc.e eVar = (qc.e) fVar;
            md.h hVar = (md.h) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = md.h.f17650n;
            do {
            } while (atomicReferenceFieldUpdater.get(hVar) == md.a.d);
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
        this.intercepted = b.f47507a;
    }

    public c(qc.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
