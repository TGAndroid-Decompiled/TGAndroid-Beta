package vd;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.j2;
import td.l;
import yd.t;
public class b {
    public static final AtomicLongFieldUpdater f50783b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater f50784c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater f50785f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater f50786g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater f50787i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater f50788j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    public final int f50789a;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public b(int i10) {
        long j10;
        this.f50789a = i10;
        if (i10 >= 0) {
            h hVar = d.f50791a;
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    j10 = i10;
                } else {
                    j10 = Long.MAX_VALUE;
                }
            } else {
                j10 = 0;
            }
            this.bufferEnd$volatile = j10;
            this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
            h hVar2 = new h(0L, null, this, 3);
            this.sendSegment$volatile = hVar2;
            this.receiveSegment$volatile = hVar2;
            if (j()) {
                hVar2 = d.f50791a;
                kotlin.jvm.internal.i.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = hVar2;
            this._closeCause$volatile = d.f50805r;
            return;
        }
        throw new IllegalArgumentException(i0.a.j(i10, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean n(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            h hVar = d.f50791a;
            ea.a d10 = lVar.d(null, ad.j.f401a);
            if (d10 != null) {
                lVar.f(d10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final boolean a(long j10) {
        if (j10 >= d.get(this) && j10 >= f50784c.get(this) + this.f50789a) {
            return false;
        }
        return true;
    }

    public final h b(long j10) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f50785f.get(this);
        if (hVar.f54440c > ((h) obj2).f54440c) {
            obj2 = hVar;
        }
        h hVar2 = (h) f50786g.get(this);
        int i10 = (hVar2.f54440c > ((h) obj2).f54440c ? 1 : (hVar2.f54440c == ((h) obj2).f54440c ? 0 : -1));
        h hVar3 = obj2;
        if (i10 > 0) {
            hVar3 = hVar2;
        }
        yd.d dVar = (yd.d) hVar3;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.d.f54418a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            ea.a aVar = yd.a.f54413b;
            obj = null;
            if (obj3 == aVar) {
                break;
            }
            yd.d dVar2 = (yd.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        h hVar4 = (h) dVar;
        h hVar5 = hVar4;
        loop2: while (hVar5 != null) {
            int i11 = d.f50792b - 1;
            obj = obj;
            while (-1 < i11) {
                if ((hVar5.f54440c * d.f50792b) + i11 < j10) {
                    break loop2;
                }
                while (true) {
                    Object l4 = hVar5.l(i11);
                    if (l4 != null && l4 != d.e) {
                        if (l4 instanceof j) {
                            if (hVar5.k(i11, l4, d.f50799l)) {
                                obj = yd.a.e(obj, ((j) l4).f50809a);
                                hVar5.m(i11, true);
                                break;
                            }
                        } else if (!(l4 instanceof j2)) {
                            break;
                        } else if (hVar5.k(i11, l4, d.f50799l)) {
                            obj = yd.a.e(obj, l4);
                            hVar5.m(i11, true);
                            break;
                        }
                    } else if (hVar5.k(i11, l4, d.f50799l)) {
                        hVar5.i();
                        break;
                    }
                }
                i11--;
                obj = obj;
            }
            hVar5 = (h) ((yd.d) yd.d.f54419b.get(hVar5));
            obj = obj;
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                l((j2) obj, true);
                return hVar4;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((j2) arrayList.get(size), true);
            }
        }
        return hVar4;
    }

    public final void c() {
        i(f50783b.get(this), false);
    }

    public final void d() {
        Object a2;
        if (j()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        h hVar = (h) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j10 = andIncrement / d.f50792b;
            if (g() <= andIncrement) {
                if (hVar.f54440c < j10 && hVar.c() != null) {
                    k(j10, hVar);
                }
                h(this);
                return;
            }
            if (hVar.f54440c != j10) {
                c cVar = c.f50790a;
                while (true) {
                    a2 = yd.a.a(hVar, j10, cVar);
                    if (!yd.a.d(a2)) {
                        t b10 = yd.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f54440c >= b10.f54440c) {
                                break;
                            } else if (!b10.j()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
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
                }
                h hVar2 = null;
                if (yd.a.d(a2)) {
                    c();
                    k(j10, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) yd.a.b(a2);
                    long j11 = hVar3.f54440c;
                    if (j11 > j10) {
                        long j12 = j11 * d.f50792b;
                        if (d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            h(this);
                        }
                    } else {
                        hVar2 = hVar3;
                    }
                }
                if (hVar2 == null) {
                    continue;
                } else {
                    hVar = hVar2;
                }
            }
            int i10 = (int) (andIncrement % d.f50792b);
            Object l4 = hVar.l(i10);
            boolean z10 = l4 instanceof j2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f50784c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, l4, d.f50795g)) {
                while (true) {
                    Object l10 = hVar.l(i10);
                    if (l10 instanceof j2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (hVar.k(i10, l10, new j((j2) l10))) {
                                break loop0;
                            }
                        } else if (hVar.k(i10, l10, d.f50795g)) {
                            if (n(l10)) {
                                hVar.o(i10, d.d);
                                break;
                            } else {
                                hVar.o(i10, d.f50797j);
                                hVar.i();
                            }
                        }
                    } else if (l10 != d.f50797j) {
                        if (l10 == null) {
                            if (hVar.k(i10, l10, d.e)) {
                                break loop0;
                            }
                        } else if (l10 == d.d || l10 == d.h || l10 == d.f50796i || l10 == d.f50798k || l10 == d.f50799l) {
                            break loop0;
                        } else if (l10 != d.f50794f) {
                            throw new IllegalStateException(("Unexpected cell state: " + l10).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (n(l4)) {
                hVar.o(i10, d.d);
                break;
            } else {
                hVar.o(i10, d.f50797j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j10, h hVar) {
        Object a2;
        long j11;
        h hVar2 = d.f50791a;
        c cVar = c.f50790a;
        loop0: while (true) {
            a2 = yd.a.a(hVar, j10, cVar);
            if (!yd.a.d(a2)) {
                t b10 = yd.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50786g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f54440c >= b10.f54440c) {
                        break loop0;
                    } else if (!b10.j()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (b10.f()) {
                                    b10.e();
                                }
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
        }
        if (yd.a.d(a2)) {
            c();
            if (hVar.f54440c * d.f50792b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) yd.a.b(a2);
            long j12 = hVar3.f54440c;
            if (!j() && j10 <= d.get(this) / d.f50792b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f54440c >= j12 || !hVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, hVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (hVar3.f()) {
                                hVar3.e();
                            }
                        }
                    }
                    if (tVar2.f()) {
                        tVar2.e();
                    }
                }
            }
            if (j12 > j10) {
                long j13 = j12 * d.f50792b;
                do {
                    j11 = f50784c.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!f50784c.compareAndSet(this, j11, j13));
                if (j12 * d.f50792b < g()) {
                    hVar3.b();
                }
            } else {
                return hVar3;
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th2 = (Throwable) f50787i.get(this);
        if (th2 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return th2;
    }

    public final long g() {
        return f50783b.get(this) & 1152921504606846975L;
    }

    public final boolean i(long r14, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: vd.b.i(long, boolean):boolean");
    }

    public final boolean j() {
        long j10 = d.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final void k(long r5, vd.h r7) {
        throw new UnsupportedOperationException("Method not decompiled: vd.b.k(long, vd.h):void");
    }

    public final void l(j2 j2Var, boolean z10) {
        Throwable f7;
        if (j2Var instanceof l) {
            cd.c cVar = (cd.c) j2Var;
            if (z10) {
                f7 = (Throwable) f50787i.get(this);
                if (f7 == null) {
                    f7 = new NoSuchElementException("Channel was closed");
                }
            } else {
                f7 = f();
            }
            cVar.resumeWith(l9.b.a(f7));
            return;
        }
        throw new IllegalStateException(("Unexpected waiter: " + j2Var).toString());
    }

    public final boolean m(Object obj, k1.l lVar) {
        if (obj instanceof l) {
            l lVar2 = (l) obj;
            h hVar = d.f50791a;
            ea.a d10 = lVar2.d(null, lVar);
            if (d10 != null) {
                lVar2.f(d10);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object o(h hVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f50808f;
        Object l4 = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f50783b;
        if (l4 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f50801n;
                }
                if (hVar.k(i10, l4, obj)) {
                    d();
                    return d.f50800m;
                }
            }
        } else if (l4 == d.d && hVar.k(i10, l4, d.f50796i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object l10 = hVar.l(i10);
            if (l10 != null && l10 != d.e) {
                if (l10 == d.d) {
                    if (hVar.k(i10, l10, d.f50796i)) {
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                } else {
                    ea.a aVar = d.f50797j;
                    if (l10 == aVar) {
                        return d.f50802o;
                    }
                    if (l10 == d.h) {
                        return d.f50802o;
                    }
                    if (l10 == d.f50799l) {
                        d();
                        return d.f50802o;
                    } else if (l10 != d.f50795g && hVar.k(i10, l10, d.f50794f)) {
                        boolean z10 = l10 instanceof j;
                        if (z10) {
                            l10 = ((j) l10).f50809a;
                        }
                        if (n(l10)) {
                            hVar.o(i10, d.f50796i);
                            d();
                            Object obj4 = atomicReferenceArray.get(i10 * 2);
                            hVar.n(i10, null);
                            return obj4;
                        }
                        hVar.o(i10, aVar);
                        hVar.i();
                        if (z10) {
                            d();
                        }
                        return d.f50802o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (hVar.k(i10, l10, d.h)) {
                    d();
                    return d.f50802o;
                }
            } else if (obj == null) {
                return d.f50801n;
            } else {
                if (hVar.k(i10, l10, obj)) {
                    d();
                    return d.f50800m;
                }
            }
        }
    }

    public final int p(h hVar, int i10, k1.l lVar, long j10, Object obj, boolean z10) {
        while (true) {
            Object l4 = hVar.l(i10);
            if (l4 == null) {
                if (a(j10) && !z10) {
                    if (hVar.k(i10, null, d.d)) {
                        break;
                    }
                } else if (z10) {
                    if (hVar.k(i10, null, d.f50797j)) {
                        hVar.i();
                        return 4;
                    }
                } else if (obj == null) {
                    return 3;
                } else {
                    if (hVar.k(i10, null, obj)) {
                        return 2;
                    }
                }
            } else if (l4 == d.e) {
                if (hVar.k(i10, l4, d.d)) {
                    break;
                }
            } else {
                ea.a aVar = d.f50798k;
                if (l4 == aVar) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.h) {
                    hVar.n(i10, null);
                    return 5;
                } else if (l4 == d.f50799l) {
                    hVar.n(i10, null);
                    c();
                    return 4;
                } else {
                    hVar.n(i10, null);
                    if (l4 instanceof j) {
                        l4 = ((j) l4).f50809a;
                    }
                    if (m(l4, lVar)) {
                        hVar.o(i10, d.f50796i);
                        return 0;
                    }
                    if (hVar.f50808f.getAndSet((i10 * 2) + 1, aVar) != aVar) {
                        hVar.m(i10, true);
                    }
                    return 5;
                }
            }
        }
        return 1;
    }

    public final void q(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        b bVar = this;
        if (!bVar.j()) {
            while (true) {
                atomicLongFieldUpdater = d;
                if (atomicLongFieldUpdater.get(bVar) > j10) {
                    break;
                }
                bVar = this;
            }
            int i10 = d.f50793c;
            int i11 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
                if (i11 < i10) {
                    long j11 = atomicLongFieldUpdater.get(bVar);
                    if (j11 != (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) || j11 != atomicLongFieldUpdater.get(bVar)) {
                        i11++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j12 = atomicLongFieldUpdater2.get(bVar);
                        if (atomicLongFieldUpdater2.compareAndSet(bVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        }
                        bVar = this;
                    }
                    while (true) {
                        long j13 = atomicLongFieldUpdater.get(bVar);
                        long j14 = atomicLongFieldUpdater2.get(bVar);
                        long j15 = j14 & 4611686018427387903L;
                        if ((j14 & 4611686018427387904L) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (j13 == j15 && j13 == atomicLongFieldUpdater.get(bVar)) {
                            break;
                        } else if (!z10) {
                            bVar = this;
                            atomicLongFieldUpdater2.compareAndSet(bVar, j14, 4611686018427387904L + j15);
                        } else {
                            bVar = this;
                        }
                    }
                    while (true) {
                        long j16 = atomicLongFieldUpdater2.get(bVar);
                        if (atomicLongFieldUpdater2.compareAndSet(bVar, j16, j16 & 4611686018427387903L)) {
                            return;
                        }
                        bVar = this;
                    }
                }
            }
        }
    }

    public final java.lang.String toString() {
        throw new UnsupportedOperationException("Method not decompiled: vd.b.toString():java.lang.String");
    }
}
