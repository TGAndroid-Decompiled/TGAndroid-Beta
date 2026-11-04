package wd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class c1 extends n1 {
    public final boolean f57478c;

    public c1() {
        super(true);
        q qVar;
        q qVar2;
        boolean z10 = true;
        y(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.f57520b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar instanceof q) {
            qVar = (q) pVar;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            n1 h = qVar.h();
            while (!h.t()) {
                p pVar2 = (p) atomicReferenceFieldUpdater.get(h);
                if (pVar2 instanceof q) {
                    qVar2 = (q) pVar2;
                } else {
                    qVar2 = null;
                }
                if (qVar2 != null) {
                    h = qVar2.h();
                }
            }
            this.f57478c = z10;
        }
        z10 = false;
        this.f57478c = z10;
    }

    @Override
    public final boolean t() {
        return this.f57478c;
    }

    @Override
    public final boolean u() {
        return true;
    }
}
