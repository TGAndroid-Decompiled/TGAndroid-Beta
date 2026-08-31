package ud;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.o;
import ld.m;
import qd.t;
public class h {
    public static final AtomicReferenceFieldUpdater f48489b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f48490c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater f48491e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f48492f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final o f48493a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public h(int i10) {
        if (i10 >= 0 && i10 <= 1) {
            j jVar = new j(0L, null, 2);
            this.head$volatile = jVar;
            this.tail$volatile = jVar;
            this._availablePermits$volatile = 1 - i10;
            this.f48493a = new o(this, 1);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        j jVar;
        m mVar = cVar.f48483a;
        d dVar = cVar.f48484b;
        while (true) {
            int andDecrement = f48492f.getAndDecrement(this);
            if (andDecrement <= 1) {
                sc.i iVar = sc.i.f47243a;
                if (andDecrement > 0) {
                    d.f48485g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f48491e.getAndIncrement(this);
                f fVar = f.f48487a;
                long j10 = andIncrement / i.f48498f;
                while (true) {
                    a2 = qd.a.a(jVar2, j10, fVar);
                    if (!qd.a.d(a2)) {
                        t b10 = qd.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (tVar.f44820c >= b10.f44820c) {
                                break;
                            } else if (!b10.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                        jVar2 = jVar;
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) qd.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = jVar3.f48499e;
                int i10 = (int) (andIncrement % i.f48498f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        com.google.android.gms.internal.clearcut.e eVar = i.f48495b;
                        com.google.android.gms.internal.clearcut.e eVar2 = i.f48496c;
                        while (!atomicReferenceArray.compareAndSet(i10, eVar, eVar2)) {
                            if (atomicReferenceArray.get(i10) != eVar) {
                                break;
                            }
                        }
                        d.f48485g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), iVar);
                        return;
                    }
                }
                cVar.a(jVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ud.h.b():void");
    }
}
