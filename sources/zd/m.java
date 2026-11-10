package zd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class m extends i0 implements l, kd.d, c2 {
    public static final AtomicIntegerFieldUpdater f60099f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f60100n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final id.c d;
    public final id.h f60101e;

    public m(int i7, id.c cVar) {
        super(i7);
        this.d = cVar;
        this.f60101e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f60050a;
    }

    public static Object E(q1 q1Var, Object obj, int i7, rd.q qVar) {
        k kVar;
        if (obj instanceof v) {
            return obj;
        }
        if (i7 != 1 && i7 != 2) {
            return obj;
        }
        if (qVar == null && !(q1Var instanceof k)) {
            return obj;
        }
        if (q1Var instanceof k) {
            kVar = (k) q1Var;
        } else {
            kVar = null;
        }
        return new u(obj, kVar, qVar, (Throwable) null, 16);
    }

    public static void y(q1 q1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + q1Var + ", already has " + obj).toString());
    }

    public final void A() {
        ee.f fVar;
        id.c cVar = this.d;
        Throwable th2 = null;
        if (cVar instanceof ee.f) {
            fVar = (ee.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.f10779n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                com.google.android.gms.internal.clearcut.e eVar = ee.a.f10770c;
                if (obj == eVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, eVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != eVar) {
                            break;
                        }
                    }
                    break loop0;
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th2 != null) {
                o();
                n(th2);
            }
        }
    }

    public final void B(Object obj, rd.q qVar) {
        C(obj, this.f60088c, qVar);
    }

    public final void C(Object obj, int i7, rd.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object E = E((q1) obj2, obj, i7, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i7);
                return;
            }
            if (obj2 instanceof n) {
                n nVar = (n) obj2;
                if (n.f60105c.compareAndSet(nVar, 0, 1)) {
                    if (qVar != null) {
                        l(qVar, nVar.f60128a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(x xVar) {
        ee.f fVar;
        x xVar2;
        int i7;
        id.c cVar = this.d;
        if (cVar instanceof ee.f) {
            fVar = (ee.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            xVar2 = fVar.d;
        } else {
            xVar2 = null;
        }
        if (xVar2 == xVar) {
            i7 = 4;
        } else {
            i7 = this.f60088c;
        }
        C(gd.k.f13831a, i7, null);
    }

    public final com.google.android.gms.internal.clearcut.e F(Object obj, rd.q qVar) {
        com.google.android.gms.internal.clearcut.e eVar = b0.f60051a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object E = E((q1) obj2, obj, this.f60088c, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                return eVar;
            }
            return null;
        }
    }

    @Override
    public final void a(ee.r rVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f60099f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i7));
        v(rVar);
    }

    @Override
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q1)) {
                if (!(obj instanceof v)) {
                    if (obj instanceof u) {
                        u uVar = (u) obj;
                        if (uVar.f60126e == null) {
                            u a10 = u.a(uVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            k kVar = uVar.f60124b;
                            if (kVar != null) {
                                k(kVar, cancellationException);
                            }
                            rd.q qVar = uVar.f60125c;
                            if (qVar != null) {
                                l(qVar, cancellationException, uVar.f60123a);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    u uVar2 = new u(obj, (k) null, (rd.q) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override
    public final id.c c() {
        return this.d;
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e d(Object obj, rd.q qVar) {
        return F(obj, qVar);
    }

    @Override
    public final void f(Object obj) {
        p(this.f60088c);
    }

    @Override
    public final Throwable g(Object obj) {
        Throwable g10 = super.g(obj);
        if (g10 != null) {
            return g10;
        }
        return null;
    }

    @Override
    public final kd.d getCallerFrame() {
        id.c cVar = this.d;
        if (cVar instanceof kd.d) {
            return (kd.d) cVar;
        }
        return null;
    }

    @Override
    public final id.h getContext() {
        return this.f60101e;
    }

    @Override
    public final Object h(Object obj) {
        if (obj instanceof u) {
            return ((u) obj).f60123a;
        }
        return obj;
    }

    @Override
    public final Object j() {
        return h.get(this);
    }

    public final void k(k kVar, Throwable th2) {
        try {
            kVar.a(th2);
        } catch (Throwable th3) {
            b0.m(this.f60101e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l(rd.q qVar, Throwable th2, Object obj) {
        id.h hVar = this.f60101e;
        try {
            qVar.b(th2, obj, hVar);
        } catch (Throwable th3) {
            b0.m(hVar, new RuntimeException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void m(ee.r rVar, Throwable th2) {
        id.h hVar = this.f60101e;
        int i7 = f60099f.get(this) & 536870911;
        if (i7 != 536870911) {
            try {
                rVar.h(i7, hVar);
                return;
            } catch (Throwable th3) {
                b0.m(hVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean n(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z9 = false;
            if (!(obj instanceof q1)) {
                return false;
            }
            if ((obj instanceof k) || (obj instanceof ee.r)) {
                z9 = true;
            }
            n nVar = new n(this, th2, z9);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            q1 q1Var = (q1) obj;
            if (q1Var instanceof k) {
                k((k) obj, th2);
            } else if (q1Var instanceof ee.r) {
                m((ee.r) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.f60088c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f60100n;
        l0 l0Var = (l0) atomicReferenceFieldUpdater.get(this);
        if (l0Var == null) {
            return;
        }
        l0Var.dispose();
        atomicReferenceFieldUpdater.set(this, p1.f60113a);
    }

    public final void p(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z9;
        boolean z10;
        do {
            atomicIntegerFieldUpdater = f60099f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    boolean z11 = false;
                    if (i7 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    id.c cVar = this.d;
                    if (!z9 && (cVar instanceof ee.f)) {
                        if (i7 != 1 && i7 != 2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i12 = this.f60088c;
                        if (i12 == 1 || i12 == 2) {
                            z11 = true;
                        }
                        if (z10 == z11) {
                            ee.f fVar = (ee.f) cVar;
                            x xVar = fVar.d;
                            id.h context = fVar.f10780e.getContext();
                            if (xVar.d(context)) {
                                xVar.c(context, this);
                                return;
                            }
                            t0 a10 = v1.a();
                            if (a10.f60121c >= 4294967296L) {
                                hd.d dVar = a10.f60122e;
                                if (dVar == null) {
                                    dVar = new hd.d();
                                    a10.f60122e = dVar;
                                }
                                dVar.addLast(this);
                                return;
                            }
                            a10.i(true);
                            try {
                                b0.t(this, cVar, true);
                                do {
                                } while (a10.k());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    b0.t(this, cVar, z9);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(n1 n1Var) {
        return n1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        a1 a1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f60099f;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i10 = i7 >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (x10) {
                        A();
                    }
                    Object obj = h.get(this);
                    if (!(obj instanceof v)) {
                        int i11 = this.f60088c;
                        if ((i11 == 1 || i11 == 2) && (a1Var = (a1) this.f60101e.get(y.f60139b)) != null && !a1Var.isActive()) {
                            CancellationException cancellationException = a1Var.getCancellationException();
                            b(cancellationException);
                            throw cancellationException;
                        }
                        return h(obj);
                    }
                    throw ((v) obj).f60128a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((l0) f60100n.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return jd.a.f16646a;
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a10 = gd.g.a(obj);
        if (a10 != null) {
            obj = new v(a10, false);
        }
        C(obj, this.f60088c, null);
    }

    public final void s() {
        l0 t6 = t();
        if (t6 != null && !(h.get(this) instanceof q1)) {
            t6.dispose();
            f60100n.set(this, p1.f60113a);
        }
    }

    public final l0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a1 a1Var = (a1) this.f60101e.get(y.f60139b);
        if (a1Var == null) {
            return null;
        }
        l0 n10 = b0.n(a1Var, true, new o(this, 0));
        do {
            atomicReferenceFieldUpdater = f60100n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(b0.v(this.d));
        sb2.append("){");
        Object obj = h.get(this);
        if (obj instanceof q1) {
            str = "Active";
        } else if (obj instanceof n) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(b0.j(this));
        return sb2.toString();
    }

    public final void u(rd.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(zd.q1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: zd.m.v(zd.q1):void");
    }

    public final boolean w() {
        return h.get(this) instanceof q1;
    }

    public final boolean x() {
        if (this.f60088c == 2) {
            id.c cVar = this.d;
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (ee.f.f10779n.get((ee.f) cVar) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
