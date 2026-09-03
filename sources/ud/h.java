package ud;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.o;
import ld.m;
import qd.t;
public class h {
    public static final AtomicReferenceFieldUpdater f45290b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f45291c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f45292f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final o f45293a;
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
            this.f45293a = new o(this, 1);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        j jVar;
        m mVar = cVar.f45284a;
        d dVar = cVar.f45285b;
        while (true) {
            int andDecrement = f45292f.getAndDecrement(this);
            if (andDecrement <= 1) {
                sc.i iVar = sc.i.f44318a;
                if (andDecrement > 0) {
                    d.f45286g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.f45288a;
                long j10 = andIncrement / i.f45297f;
                while (true) {
                    a2 = qd.a.a(jVar2, j10, fVar);
                    if (!qd.a.d(a2)) {
                        t b10 = qd.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (tVar.f43071c >= b10.f43071c) {
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
                AtomicReferenceArray atomicReferenceArray = jVar3.e;
                int i10 = (int) (andIncrement % i.f45297f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        o3.c cVar2 = i.f45295b;
                        o3.c cVar3 = i.f45296c;
                        while (!atomicReferenceArray.compareAndSet(i10, cVar2, cVar3)) {
                            if (atomicReferenceArray.get(i10) != cVar2) {
                                break;
                            }
                        }
                        d.f45286g.set(dVar, null);
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
