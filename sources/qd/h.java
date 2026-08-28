package qd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.m;
import md.t;
public class h {
    public static final AtomicReferenceFieldUpdater f46149b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f46150c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater f46151e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f46152f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final m f46153a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public h(int i9) {
        if (i9 >= 0 && i9 <= 1) {
            j jVar = new j(0L, null, 2);
            this.head$volatile = jVar;
            this.tail$volatile = jVar;
            this._availablePermits$volatile = 1 - i9;
            this.f46153a = new m(this, 1);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        j jVar;
        hd.m mVar = cVar.f46143a;
        d dVar = cVar.f46144b;
        while (true) {
            int andDecrement = f46152f.getAndDecrement(this);
            if (andDecrement <= 1) {
                oc.i iVar = oc.i.f19197a;
                if (andDecrement > 0) {
                    d.f46145g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f46151e.getAndIncrement(this);
                f fVar = f.f46147a;
                long j10 = andIncrement / i.f46158f;
                while (true) {
                    a2 = md.a.a(jVar2, j10, fVar);
                    if (!md.a.d(a2)) {
                        t b10 = md.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (tVar.f17670c >= b10.f17670c) {
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
                j jVar3 = (j) md.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = jVar3.f46159e;
                int i9 = (int) (andIncrement % i.f46158f);
                while (!atomicReferenceArray.compareAndSet(i9, null, cVar)) {
                    if (atomicReferenceArray.get(i9) != null) {
                        e5.c cVar2 = i.f46155b;
                        e5.c cVar3 = i.f46156c;
                        while (!atomicReferenceArray.compareAndSet(i9, cVar2, cVar3)) {
                            if (atomicReferenceArray.get(i9) != cVar2) {
                                break;
                            }
                        }
                        d.f46145g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), iVar);
                        return;
                    }
                }
                cVar.a(jVar3, i9);
                return;
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: qd.h.b():void");
    }
}
