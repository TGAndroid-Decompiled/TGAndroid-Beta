package sd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.m;
import k1.n;
import od.u;
public class h {
    public static final AtomicReferenceFieldUpdater f47720b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater f47721c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater f47722e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater f47723f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;
    public final n f47724a;
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
            this.f47724a = new n(this, 1);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object a2;
        j jVar;
        m mVar = cVar.f47714a;
        d dVar = cVar.f47715b;
        while (true) {
            int andDecrement = f47723f.getAndDecrement(this);
            if (andDecrement <= 1) {
                qc.i iVar = qc.i.f46603a;
                if (andDecrement > 0) {
                    d.f47716g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f47722e.getAndIncrement(this);
                f fVar = f.f47718a;
                long j10 = andIncrement / i.f47729f;
                while (true) {
                    a2 = od.a.a(jVar2, j10, fVar);
                    if (!od.a.d(a2)) {
                        u b10 = od.a.b(a2);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (uVar.f19536c >= b10.f19536c) {
                                break;
                            } else if (!b10.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                        jVar2 = jVar;
                                    }
                                }
                                if (uVar.f()) {
                                    uVar.e();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) od.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = jVar3.f47730e;
                int i10 = (int) (andIncrement % i.f47729f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        fc.a aVar = i.f47726b;
                        fc.a aVar2 = i.f47727c;
                        while (!atomicReferenceArray.compareAndSet(i10, aVar, aVar2)) {
                            if (atomicReferenceArray.get(i10) != aVar) {
                                break;
                            }
                        }
                        d.f47716g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), iVar);
                        return;
                    }
                }
                cVar.b(jVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: sd.h.b():void");
    }
}
