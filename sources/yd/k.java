package yd;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class k extends be.r {
    public final c f59411e;
    public final AtomicReferenceArray f59412f;

    public k(long j10, k kVar, c cVar, int i3) {
        super(j10, kVar, i3);
        this.f59411e = cVar;
        this.f59412f = new AtomicReferenceArray(e.f59390b * 2);
    }

    @Override
    public final int g() {
        return e.f59390b;
    }

    @Override
    public final void h(int r5, fd.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: yd.k.h(int, fd.h):void");
    }

    public final boolean k(int i3, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i3 * 2) + 1;
        do {
            atomicReferenceArray = this.f59412f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i3) {
        return this.f59412f.get((i3 * 2) + 1);
    }

    public final void m(int i3, boolean z10) {
        if (z10) {
            c cVar = this.f59411e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.B((this.f3282c * e.f59390b) + i3);
        }
        i();
    }

    public final void n(int i3, Object obj) {
        this.f59412f.set(i3 * 2, obj);
    }

    public final void o(int i3, Object obj) {
        this.f59412f.set((i3 * 2) + 1, obj);
    }
}
