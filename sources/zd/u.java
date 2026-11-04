package zd;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class u extends ae.b implements s, b, ae.g {
    public static final AtomicReferenceFieldUpdater f60441e = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int d;

    public u(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final java.lang.Object U(zd.c r18, hd.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: zd.u.U(zd.c, hd.c):java.lang.Object");
    }

    @Override
    public final Object b(Object obj, fd.c cVar) {
        if (obj == null) {
            obj = ae.i.f401a;
        }
        c(null, obj);
        return dd.k.f8801a;
    }

    public final boolean c(Object obj, Object obj2) {
        int i3;
        w[] wVarArr;
        be.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f60441e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.j.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.d;
            if ((i10 & 1) == 0) {
                int i11 = i10 + 1;
                this.d = i11;
                w[] wVarArr2 = this.f384a;
                while (true) {
                    if (wVarArr2 != null) {
                        for (w wVar : wVarArr2) {
                            if (wVar != null) {
                                AtomicReference atomicReference = wVar.f60444a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (tVar = v.f60443b)) {
                                        be.t tVar2 = v.f60442a;
                                        if (obj4 == tVar2) {
                                            while (!atomicReference.compareAndSet(obj4, tVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((wd.m) obj4).resumeWith(dd.k.f8801a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i3 = this.d;
                        if (i3 == i11) {
                            this.d = i11 + 1;
                            return true;
                        }
                        wVarArr = this.f384a;
                    }
                    wVarArr2 = wVarArr;
                    i11 = i3;
                }
            } else {
                this.d = i10 + 2;
                return true;
            }
        }
    }

    @Override
    public final b h(fd.h hVar, int i3, yd.a aVar) {
        if ((((i3 >= 0 && i3 < 2) || i3 == -2) && aVar == yd.a.f59375b) || ((i3 == 0 || i3 == -3) && aVar == yd.a.f59374a)) {
            return this;
        }
        return new ae.e(this, hVar, i3, aVar, 0);
    }
}
