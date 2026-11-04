package yd;

import b8.ib;
import b8.jc;
import be.t;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.p1;
import wd.c2;
public class c implements g {
    public static final AtomicLongFieldUpdater f59380b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f59381c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater f59382e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f59383f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater f59384n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f59385r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f59386s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f59387a;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public c(int i3) {
        long j10;
        this.f59387a = i3;
        if (i3 >= 0) {
            k kVar = e.f59389a;
            if (i3 != 0) {
                if (i3 != Integer.MAX_VALUE) {
                    j10 = i3;
                } else {
                    j10 = Long.MAX_VALUE;
                }
            } else {
                j10 = 0;
            }
            this.bufferEnd$volatile = j10;
            this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
            k kVar2 = new k(0L, null, this, 3);
            this.sendSegment$volatile = kVar2;
            this.receiveSegment$volatile = kVar2;
            if (t()) {
                kVar2 = e.f59389a;
                kotlin.jvm.internal.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = kVar2;
            this._closeCause$volatile = e.f59405s;
            return;
        }
        throw new IllegalArgumentException(p1.j(i3, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static final k c(c cVar, long j10, k kVar) {
        Object b10;
        c cVar2;
        k kVar2 = e.f59389a;
        d dVar = d.f59388a;
        loop0: while (true) {
            b10 = be.a.b(kVar, j10, dVar);
            if (!be.a.e(b10)) {
                be.r c2 = be.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59383f;
                    be.r rVar = (be.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f3282c >= c2.f3282c) {
                        break loop0;
                    } else if (!c2.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, c2)) {
                            if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                                if (c2.f()) {
                                    c2.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean e10 = be.a.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f59381c;
        if (e10) {
            cVar.i();
            if (kVar.f3282c * e.f59390b < atomicLongFieldUpdater.get(cVar)) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) be.a.c(b10);
            long j11 = kVar3.f3282c;
            if (j11 > j10) {
                long j12 = e.f59390b * j11;
                while (true) {
                    long j13 = f59380b.get(cVar);
                    long j14 = 1152921504606846975L & j13;
                    if (j14 >= j12) {
                        cVar2 = cVar;
                        break;
                    }
                    cVar2 = cVar;
                    if (f59380b.compareAndSet(cVar2, j13, (((int) (j13 >> 60)) << 60) + j14)) {
                        break;
                    }
                    cVar = cVar2;
                }
                if (j11 * e.f59390b < atomicLongFieldUpdater.get(cVar2)) {
                    kVar3.b();
                }
            } else {
                return kVar3;
            }
        }
        return null;
    }

    public static final void d(c cVar, Object obj, wd.m mVar) {
        mVar.resumeWith(ib.a(cVar.o()));
    }

    public static final int e(c cVar, k kVar, int i3, Object obj, long j10, Object obj2, boolean z10) {
        kVar.n(i3, obj);
        if (z10) {
            return cVar.A(kVar, i3, obj, j10, obj2, z10);
        }
        Object l10 = kVar.l(i3);
        if (l10 == null) {
            if (cVar.f(j10)) {
                if (kVar.k(i3, null, e.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (kVar.k(i3, null, obj2)) {
                    return 2;
                }
            }
        } else if (l10 instanceof c2) {
            kVar.n(i3, null);
            if (cVar.x(l10, obj)) {
                kVar.o(i3, e.f59395i);
                return 0;
            }
            t tVar = e.f59397k;
            if (kVar.f59412f.getAndSet((i3 * 2) + 1, tVar) != tVar) {
                kVar.m(i3, true);
                return 5;
            }
            return 5;
        }
        return cVar.A(kVar, i3, obj, j10, obj2, z10);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f59382e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean y(Object obj) {
        if (obj instanceof wd.l) {
            wd.l lVar = (wd.l) obj;
            k kVar = e.f59389a;
            t f10 = lVar.f(dd.k.f8801a, null);
            if (f10 != null) {
                lVar.e(f10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final int A(k kVar, int i3, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object l10 = kVar.l(i3);
            if (l10 == null) {
                if (f(j10) && !z10) {
                    if (kVar.k(i3, null, e.d)) {
                        break;
                    }
                } else if (z10) {
                    if (kVar.k(i3, null, e.f59396j)) {
                        kVar.i();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (kVar.k(i3, null, obj2)) {
                        return 2;
                    }
                }
            } else if (l10 == e.f59392e) {
                if (kVar.k(i3, l10, e.d)) {
                    break;
                }
            } else {
                t tVar = e.f59397k;
                if (l10 == tVar) {
                    kVar.n(i3, null);
                    return 5;
                } else if (l10 == e.h) {
                    kVar.n(i3, null);
                    return 5;
                } else if (l10 == e.f59398l) {
                    kVar.n(i3, null);
                    i();
                    return 4;
                } else {
                    kVar.n(i3, null);
                    if (l10 instanceof s) {
                        l10 = ((s) l10).f59417a;
                    }
                    if (x(l10, obj)) {
                        kVar.o(i3, e.f59395i);
                        return 0;
                    }
                    if (kVar.f59412f.getAndSet((i3 * 2) + 1, tVar) != tVar) {
                        kVar.m(i3, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void B(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        c cVar = this;
        if (!cVar.t()) {
            while (true) {
                atomicLongFieldUpdater = d;
                if (atomicLongFieldUpdater.get(cVar) > j10) {
                    break;
                }
                cVar = this;
            }
            int i3 = e.f59391c;
            int i10 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f59382e;
                if (i10 < i3) {
                    long j11 = atomicLongFieldUpdater.get(cVar);
                    if (j11 != (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) || j11 != atomicLongFieldUpdater.get(cVar)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j12 = atomicLongFieldUpdater2.get(cVar);
                        if (atomicLongFieldUpdater2.compareAndSet(cVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        cVar = this;
                    }
                    while (true) {
                        long j13 = atomicLongFieldUpdater.get(cVar);
                        long j14 = atomicLongFieldUpdater2.get(cVar);
                        long j15 = j14 & 4611686018427387903L;
                        if ((j14 & 4611686018427387904L) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (j13 == j15 && j13 == atomicLongFieldUpdater.get(cVar)) {
                            break;
                        } else if (!z10) {
                            cVar = this;
                            atomicLongFieldUpdater2.compareAndSet(cVar, j14, 4611686018427387904L + j15);
                        } else {
                            cVar = this;
                        }
                    }
                    while (true) {
                        long j16 = atomicLongFieldUpdater2.get(cVar);
                        if (atomicLongFieldUpdater2.compareAndSet(cVar, j16, j16 & 4611686018427387903L)) {
                            return;
                        }
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override
    public java.lang.Object a(fd.c r24, java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: yd.c.a(fd.c, java.lang.Object):java.lang.Object");
    }

    @Override
    public Object b(Object obj) {
        boolean z10;
        c2 c2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f59380b;
        long j10 = atomicLongFieldUpdater.get(this);
        boolean z11 = false;
        long j11 = 1152921504606846975L;
        if (r(j10, false)) {
            z10 = false;
        } else {
            z10 = !f(j10 & 1152921504606846975L);
        }
        i iVar = j.f59409b;
        if (z10) {
            return iVar;
        }
        t tVar = e.f59396j;
        k kVar = (k) f59383f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = andIncrement & j11;
            boolean r5 = r(andIncrement, z11);
            int i3 = e.f59390b;
            long j13 = i3;
            long j14 = j12 / j13;
            int i10 = (int) (j12 % j13);
            if (kVar.f3282c != j14) {
                k c2 = c(this, j14, kVar);
                if (c2 == null) {
                    if (r5) {
                        return new h(o());
                    }
                    z11 = false;
                    j11 = 1152921504606846975L;
                } else {
                    kVar = c2;
                }
            }
            int e10 = e(this, kVar, i10, obj, j12, tVar, r5);
            dd.k kVar2 = dd.k.f8801a;
            if (e10 != 0) {
                if (e10 != 1) {
                    if (e10 != 2) {
                        if (e10 != 3) {
                            if (e10 != 4) {
                                if (e10 == 5) {
                                    kVar.b();
                                }
                                z11 = false;
                                j11 = 1152921504606846975L;
                            } else {
                                if (j12 < f59381c.get(this)) {
                                    kVar.b();
                                }
                                return new h(o());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (r5) {
                        kVar.i();
                        return new h(o());
                    } else {
                        if (tVar instanceof c2) {
                            c2Var = (c2) tVar;
                        } else {
                            c2Var = null;
                        }
                        if (c2Var != null) {
                            c2Var.a(kVar, i10 + i3);
                        }
                        kVar.i();
                        return iVar;
                    }
                } else {
                    return kVar2;
                }
            } else {
                kVar.b();
                return kVar2;
            }
        }
    }

    @Override
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean f(long j10) {
        if (j10 >= d.get(this) && j10 >= f59381c.get(this) + this.f59387a) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.Throwable r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: yd.c.g(java.lang.Throwable, boolean):boolean");
    }

    public final yd.k h(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: yd.c.h(long):yd.k");
    }

    public final void i() {
        r(f59380b.get(this), false);
    }

    public final void j(long j10) {
        k kVar = (k) h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f59381c;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f59387a + j11, d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = e.f59390b;
                long j13 = j11 / j12;
                int i3 = (int) (j11 % j12);
                if (kVar.f3282c != j13) {
                    k l10 = l(j13, kVar);
                    if (l10 != null) {
                        kVar = l10;
                    }
                }
                k kVar2 = kVar;
                if (z(kVar2, i3, j11, null) == e.f59401o) {
                    if (j11 < p()) {
                        kVar2.b();
                    }
                } else {
                    kVar2.b();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object b10;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59384n;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j10 = andIncrement / e.f59390b;
            if (p() <= andIncrement) {
                if (kVar.f3282c < j10 && kVar.c() != null) {
                    u(j10, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f3282c != j10) {
                d dVar = d.f59388a;
                while (true) {
                    b10 = be.a.b(kVar, j10, dVar);
                    if (!be.a.e(b10)) {
                        be.r c2 = be.a.c(b10);
                        while (true) {
                            be.r rVar = (be.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f3282c >= c2.f3282c) {
                                break;
                            } else if (!c2.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c2)) {
                                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                        if (c2.f()) {
                                            c2.e();
                                        }
                                    }
                                }
                                if (rVar.f()) {
                                    rVar.e();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (be.a.e(b10)) {
                    i();
                    u(j10, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) be.a.c(b10);
                    long j11 = kVar3.f3282c;
                    if (j11 > j10) {
                        long j12 = j11 * e.f59390b;
                        if (d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f59382e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i3 = (int) (andIncrement % e.f59390b);
            Object l10 = kVar.l(i3);
            boolean z10 = l10 instanceof c2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f59381c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.k(i3, l10, e.f59394g)) {
                while (true) {
                    Object l11 = kVar.l(i3);
                    if (l11 instanceof c2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (kVar.k(i3, l11, new s((c2) l11))) {
                                break loop0;
                            }
                        } else if (kVar.k(i3, l11, e.f59394g)) {
                            if (y(l11)) {
                                kVar.o(i3, e.d);
                                break;
                            } else {
                                kVar.o(i3, e.f59396j);
                                kVar.i();
                            }
                        }
                    } else if (l11 != e.f59396j) {
                        if (l11 == null) {
                            if (kVar.k(i3, l11, e.f59392e)) {
                                break loop0;
                            }
                        } else if (l11 == e.d || l11 == e.h || l11 == e.f59395i || l11 == e.f59397k || l11 == e.f59398l) {
                            break loop0;
                        } else if (l11 != e.f59393f) {
                            throw new IllegalStateException(("Unexpected cell state: " + l11).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (y(l10)) {
                kVar.o(i3, e.d);
                break;
            } else {
                kVar.o(i3, e.f59396j);
                kVar.i();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j10, k kVar) {
        Object b10;
        long j11;
        k kVar2 = e.f59389a;
        d dVar = d.f59388a;
        loop0: while (true) {
            b10 = be.a.b(kVar, j10, dVar);
            if (!be.a.e(b10)) {
                be.r c2 = be.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    be.r rVar = (be.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f3282c >= c2.f3282c) {
                        break loop0;
                    } else if (!c2.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c2)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (c2.f()) {
                                    c2.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (be.a.e(b10)) {
            i();
            if (kVar.f3282c * e.f59390b < p()) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) be.a.c(b10);
            long j12 = kVar3.f3282c;
            if (!t() && j10 <= d.get(this) / e.f59390b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f59384n;
                    be.r rVar2 = (be.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f3282c >= j12 || !kVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.f()) {
                                kVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j12 > j10) {
                long j13 = j12 * e.f59390b;
                do {
                    j11 = f59381c.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!f59381c.compareAndSet(this, j11, j13));
                if (j12 * e.f59390b < p()) {
                    kVar3.b();
                }
            } else {
                return kVar3;
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f59385r.get(this);
    }

    public final Throwable n() {
        Throwable m10 = m();
        if (m10 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return m10;
    }

    public final Throwable o() {
        Throwable m10 = m();
        if (m10 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return m10;
    }

    public final long p() {
        return f59380b.get(this) & 1152921504606846975L;
    }

    public final boolean r(long r14, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: yd.c.r(long, boolean):boolean");
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j10 = d.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: yd.c.toString():java.lang.String");
    }

    public final void u(long r5, yd.k r7) {
        throw new UnsupportedOperationException("Method not decompiled: yd.c.u(long, yd.k):void");
    }

    public final Object v(fd.c cVar, Object obj) {
        wd.m mVar = new wd.m(1, jc.b(cVar));
        mVar.s();
        mVar.resumeWith(ib.a(o()));
        Object r5 = mVar.r();
        if (r5 == gd.a.f12241a) {
            return r5;
        }
        return dd.k.f8801a;
    }

    public final void w(c2 c2Var, boolean z10) {
        Throwable o10;
        if (c2Var instanceof wd.l) {
            fd.c cVar = (fd.c) c2Var;
            if (z10) {
                o10 = n();
            } else {
                o10 = o();
            }
            cVar.resumeWith(ib.a(o10));
        } else if (c2Var instanceof b) {
            b bVar = (b) c2Var;
            wd.m mVar = bVar.f59378b;
            kotlin.jvm.internal.j.b(mVar);
            bVar.f59378b = null;
            bVar.f59377a = e.f59398l;
            Throwable m10 = bVar.f59379c.m();
            if (m10 == null) {
                mVar.resumeWith(Boolean.FALSE);
            } else {
                mVar.resumeWith(ib.a(m10));
            }
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + c2Var).toString());
        }
    }

    public final boolean x(Object obj, Object obj2) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            wd.m mVar = bVar.f59378b;
            kotlin.jvm.internal.j.b(mVar);
            bVar.f59378b = null;
            bVar.f59377a = obj2;
            Boolean bool = Boolean.TRUE;
            k kVar = e.f59389a;
            t f10 = mVar.f(bool, null);
            if (f10 == null) {
                return false;
            }
            mVar.e(f10);
            return true;
        } else if (obj instanceof wd.l) {
            wd.l lVar = (wd.l) obj;
            k kVar2 = e.f59389a;
            t f11 = lVar.f(obj2, null);
            if (f11 == null) {
                return false;
            }
            lVar.e(f11);
            return true;
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final Object z(k kVar, int i3, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f59412f;
        Object l10 = kVar.l(i3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f59380b;
        if (l10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f59400n;
                }
                if (kVar.k(i3, l10, obj)) {
                    k();
                    return e.f59399m;
                }
            }
        } else if (l10 == e.d && kVar.k(i3, l10, e.f59395i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            kVar.n(i3, null);
            return obj2;
        }
        while (true) {
            Object l11 = kVar.l(i3);
            if (l11 != null && l11 != e.f59392e) {
                if (l11 == e.d) {
                    if (kVar.k(i3, l11, e.f59395i)) {
                        k();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        kVar.n(i3, null);
                        return obj3;
                    }
                } else {
                    t tVar = e.f59396j;
                    if (l11 == tVar) {
                        return e.f59401o;
                    }
                    if (l11 == e.h) {
                        return e.f59401o;
                    }
                    if (l11 == e.f59398l) {
                        k();
                        return e.f59401o;
                    } else if (l11 != e.f59394g && kVar.k(i3, l11, e.f59393f)) {
                        boolean z10 = l11 instanceof s;
                        if (z10) {
                            l11 = ((s) l11).f59417a;
                        }
                        if (y(l11)) {
                            kVar.o(i3, e.f59395i);
                            k();
                            Object obj4 = atomicReferenceArray.get(i3 * 2);
                            kVar.n(i3, null);
                            return obj4;
                        }
                        kVar.o(i3, tVar);
                        kVar.i();
                        if (z10) {
                            k();
                        }
                        return e.f59401o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kVar.k(i3, l11, e.h)) {
                    k();
                    return e.f59401o;
                }
            } else if (obj == null) {
                return e.f59400n;
            } else {
                if (kVar.k(i3, l11, obj)) {
                    k();
                    return e.f59399m;
                }
            }
        }
    }
}
