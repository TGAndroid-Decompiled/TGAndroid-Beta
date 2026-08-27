package rd;

import id.l;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.m;
import nd.t;

public class h {

    public static final AtomicReferenceFieldUpdater f46908b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    public static final AtomicLongFieldUpdater f46909c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    public static final AtomicLongFieldUpdater f46910e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    public static final AtomicIntegerFieldUpdater f46911f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;

    public final m f46912a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public h(int i10) {
        if (i10 < 0 || i10 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1 - i10;
        this.f46912a = new m(this, 1);
    }

    public final void a(c cVar) throws IllegalAccessException, InvocationTargetException {
        Object objA;
        j jVar;
        id.m mVar = cVar.f46902a;
        d dVar = cVar.f46903b;
        while (true) {
            int andDecrement = f46911f.getAndDecrement(this);
            if (andDecrement <= 1) {
                pc.i iVar = pc.i.f45696a;
                if (andDecrement > 0) {
                    d.f46904g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f46910e.getAndIncrement(this);
                f fVar = f.f46906a;
                long j10 = andIncrement / ((long) i.f46917f);
                while (true) {
                    objA = nd.a.a(jVar2, j10, fVar);
                    if (nd.a.d(objA)) {
                        break;
                    }
                    t tVarB = nd.a.b(objA);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        jVar = jVar2;
                        if (tVar.f18506c >= tVarB.f18506c) {
                            break;
                        }
                        if (!tVarB.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarB)) {
                                if (!tVar.f()) {
                                    break;
                                }
                                tVar.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == tVar);
                        if (tVarB.f()) {
                            tVarB.e();
                        }
                        jVar2 = jVar;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) nd.a.b(objA);
                AtomicReferenceArray atomicReferenceArray = jVar3.f46918e;
                int i10 = (int) (andIncrement % ((long) i.f46917f));
                do {
                    if (atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                        cVar.a(jVar3, i10);
                        return;
                    }
                } while (atomicReferenceArray.get(i10) == null);
                ec.a aVar = i.f46914b;
                ec.a aVar2 = i.f46915c;
                do {
                    if (atomicReferenceArray.compareAndSet(i10, aVar, aVar2)) {
                        d.f46904g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), iVar);
                        return;
                    }
                } while (atomicReferenceArray.get(i10) == aVar);
            }
        }
    }

    public final void b() {
        boolean z10;
        int i10;
        Object objA;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f46911f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z10 = true;
            if (andIncrement >= 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46908b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f46909c.getAndIncrement(this);
            long j10 = andIncrement2 / ((long) i.f46917f);
            g gVar = g.f46907a;
            while (true) {
                objA = nd.a.a(jVar, j10, gVar);
                if (!nd.a.d(objA)) {
                    t tVarB = nd.a.b(objA);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.f18506c >= tVarB.f18506c) {
                            break;
                        }
                        if (!tVarB.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarB)) {
                                if (!tVar.f()) {
                                    break;
                                }
                                tVar.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == tVar);
                        if (tVarB.f()) {
                            tVarB.e();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) nd.a.b(objA);
            AtomicReferenceArray atomicReferenceArray = jVar2.f46918e;
            jVar2.b();
            long j11 = jVar2.f18506c;
            boolean z11 = false;
            if (j11 <= j10) {
                int i11 = (int) (andIncrement2 % ((long) i.f46917f));
                Object andSet = atomicReferenceArray.getAndSet(i11, i.f46914b);
                if (andSet == null) {
                    int i12 = i.f46913a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            ec.a aVar = i.f46914b;
                            ec.a aVar2 = i.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i11, aVar, aVar2)) {
                                    z11 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i11) == aVar);
                            z10 = true ^ z11;
                            break;
                        }
                        if (atomicReferenceArray.get(i11) == i.f46915c) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                } else if (andSet == i.f46916e) {
                    z10 = false;
                } else {
                    if (!(andSet instanceof l)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    l lVar = (l) andSet;
                    ec.a aVarB = lVar.b(this.f46912a, pc.i.f45696a);
                    if (aVarB != null) {
                        lVar.e(aVarB);
                    } else {
                        z10 = false;
                    }
                }
            } else {
                z10 = false;
            }
        } while (!z10);
    }
}
