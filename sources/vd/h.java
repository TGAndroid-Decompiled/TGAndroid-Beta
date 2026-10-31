package vd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.l;
import yd.t;
public final class h extends t {
    public final b e;
    public final AtomicReferenceArray f50794f;

    public h(long j10, h hVar, b bVar, int i10) {
        super(j10, hVar, i10);
        this.e = bVar;
        this.f50794f = new AtomicReferenceArray(d.f50778b * 2);
    }

    @Override
    public final int g() {
        return d.f50778b;
    }

    @Override
    public final void h(int r5, cd.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: vd.h.h(int, cd.h):void");
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f50794f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f50794f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            b bVar = this.e;
            kotlin.jvm.internal.i.b(bVar);
            bVar.q((this.f54419c * d.f50778b) + i10);
        }
        i();
    }

    public final void n(int i10, l lVar) {
        this.f50794f.set(i10 * 2, lVar);
    }

    public final void o(int i10, Object obj) {
        this.f50794f.set((i10 * 2) + 1, obj);
    }
}
