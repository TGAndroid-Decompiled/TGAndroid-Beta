package wd;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class m extends xd.b implements k, b {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public m(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final Object b(Object obj, ed.c cVar) {
        d(obj);
        return ad.j.f401a;
    }

    public final Object c() {
        Object obj = e.get(this);
        if (obj == xd.e.f53683a) {
            return null;
        }
        return obj;
    }

    public final void d(Object obj) {
        int i10;
        o[] oVarArr;
        ea.a aVar;
        if (obj == null) {
            obj = xd.e.f53683a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (kotlin.jvm.internal.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.d;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.d = i12;
                o[] oVarArr2 = this.f53677a;
                while (true) {
                    if (oVarArr2 != null) {
                        for (o oVar : oVarArr2) {
                            if (oVar != null) {
                                AtomicReference atomicReference = oVar.f52851a;
                                while (true) {
                                    Object obj2 = atomicReference.get();
                                    if (obj2 != null && obj2 != (aVar = n.f52850b)) {
                                        ea.a aVar2 = n.f52849a;
                                        if (obj2 == aVar2) {
                                            while (!atomicReference.compareAndSet(obj2, aVar)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj2, aVar2)) {
                                                if (atomicReference.get() != obj2) {
                                                    break;
                                                }
                                            }
                                            ((td.m) obj2).resumeWith(ad.j.f401a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.d;
                        if (i10 == i12) {
                            this.d = i12 + 1;
                            return;
                        }
                        oVarArr = this.f53677a;
                    }
                    oVarArr2 = oVarArr;
                    i12 = i10;
                }
            } else {
                this.d = i11 + 2;
            }
        }
    }

    @Override
    public final java.lang.Object p(wd.c r18, ed.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: wd.m.p(wd.c, ed.c):java.lang.Object");
    }
}
