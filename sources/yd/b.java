package yd;

import b8.ib;
import b8.jc;
import be.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.b0;
import wd.c2;
public final class b implements c2 {
    public Object f59377a = e.f59402p;
    public wd.m f59378b;
    public final c f59379c;

    public b(c cVar) {
        this.f59379c = cVar;
    }

    @Override
    public final void a(be.r rVar, int i3) {
        wd.m mVar = this.f59378b;
        if (mVar != null) {
            mVar.a(rVar, i3);
        }
    }

    public final Object b(zd.d dVar) {
        k kVar;
        k kVar2;
        Object obj = this.f59377a;
        boolean z10 = true;
        if (obj == e.f59402p || obj == e.f59398l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.h;
            c cVar = this.f59379c;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.r(c.f59380b.get(cVar), true)) {
                long andIncrement = c.f59381c.getAndIncrement(cVar);
                long j10 = e.f59390b;
                long j11 = andIncrement / j10;
                int i3 = (int) (andIncrement % j10);
                if (kVar3.f3282c != j11) {
                    k l10 = cVar.l(j11, kVar3);
                    if (l10 == null) {
                        continue;
                    } else {
                        kVar = l10;
                    }
                } else {
                    kVar = kVar3;
                }
                Object z11 = cVar.z(kVar, i3, andIncrement, null);
                t tVar = e.f59399m;
                if (z11 != tVar) {
                    t tVar2 = e.f59401o;
                    if (z11 == tVar2) {
                        if (andIncrement < cVar.p()) {
                            kVar.b();
                        }
                        kVar3 = kVar;
                    } else if (z11 == e.f59400n) {
                        wd.m l11 = b0.l(jc.b(dVar));
                        try {
                            this.f59378b = l11;
                            try {
                                Object z12 = cVar.z(kVar, i3, andIncrement, this);
                                if (z12 == tVar) {
                                    a(kVar, i3);
                                } else {
                                    if (z12 == tVar2) {
                                        if (andIncrement < cVar.p()) {
                                            kVar.b();
                                        }
                                        k kVar4 = (k) c.h.get(cVar);
                                        while (true) {
                                            if (cVar.r(c.f59380b.get(cVar), true)) {
                                                wd.m mVar = this.f59378b;
                                                kotlin.jvm.internal.j.b(mVar);
                                                this.f59378b = null;
                                                this.f59377a = e.f59398l;
                                                Throwable m10 = cVar.m();
                                                if (m10 == null) {
                                                    mVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    mVar.resumeWith(ib.a(m10));
                                                }
                                            } else {
                                                long andIncrement2 = c.f59381c.getAndIncrement(cVar);
                                                long j12 = e.f59390b;
                                                long j13 = andIncrement2 / j12;
                                                int i10 = (int) (andIncrement2 % j12);
                                                if (kVar4.f3282c != j13) {
                                                    kVar2 = cVar.l(j13, kVar4);
                                                    if (kVar2 == null) {
                                                    }
                                                } else {
                                                    kVar2 = kVar4;
                                                }
                                                Object z13 = cVar.z(kVar2, i10, andIncrement2, this);
                                                if (z13 == e.f59399m) {
                                                    a(kVar2, i10);
                                                    break;
                                                } else if (z13 == e.f59401o) {
                                                    if (andIncrement2 < cVar.p()) {
                                                        kVar2.b();
                                                    }
                                                    kVar4 = kVar2;
                                                } else if (z13 != e.f59400n) {
                                                    kVar2.b();
                                                    this.f59377a = z13;
                                                    this.f59378b = null;
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        kVar.b();
                                        this.f59377a = z12;
                                        this.f59378b = null;
                                    }
                                    l11.B(Boolean.TRUE, null);
                                }
                                Object r5 = l11.r();
                                gd.a aVar = gd.a.f12241a;
                                return r5;
                            } catch (Throwable th2) {
                                th = th2;
                                l11.A();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        kVar.b();
                        this.f59377a = z11;
                        return Boolean.valueOf(z10);
                    }
                } else {
                    throw new IllegalStateException("unreachable");
                }
            }
            this.f59377a = e.f59398l;
            Throwable m11 = cVar.m();
            if (m11 == null) {
                z10 = false;
            } else {
                int i11 = be.s.f3283a;
                throw m11;
            }
        }
        return Boolean.valueOf(z10);
    }
}
