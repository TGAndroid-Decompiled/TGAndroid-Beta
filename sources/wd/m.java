package wd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class m extends i0 implements l, hd.d, c2 {
    public static final AtomicIntegerFieldUpdater f57511f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f57512n = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final fd.c d;
    public final fd.h f57513e;

    public m(int i3, fd.c cVar) {
        super(i3);
        this.d = cVar;
        this.f57513e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f57462a;
    }

    public static Object E(q1 q1Var, Object obj, int i3, od.q qVar) {
        k kVar;
        if (obj instanceof v) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
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
        be.f fVar;
        fd.c cVar = this.d;
        Throwable th2 = null;
        if (cVar instanceof be.f) {
            fVar = (be.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.f.f3262n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                be.t tVar = be.a.f3253c;
                if (obj == tVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
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

    public final void B(Object obj, od.q qVar) {
        C(obj, this.f57500c, qVar);
    }

    public final void C(Object obj, int i3, od.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object E = E((q1) obj2, obj, i3, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                p(i3);
                return;
            }
            if (obj2 instanceof n) {
                n nVar = (n) obj2;
                if (n.f57517c.compareAndSet(nVar, 0, 1)) {
                    if (qVar != null) {
                        l(qVar, nVar.f57540a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void D(x xVar) {
        be.f fVar;
        x xVar2;
        int i3;
        fd.c cVar = this.d;
        if (cVar instanceof be.f) {
            fVar = (be.f) cVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            xVar2 = fVar.d;
        } else {
            xVar2 = null;
        }
        if (xVar2 == xVar) {
            i3 = 4;
        } else {
            i3 = this.f57500c;
        }
        C(dd.k.f8801a, i3, null);
    }

    public final be.t F(Object obj, od.q qVar) {
        be.t tVar = b0.f57463a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object E = E((q1) obj2, obj, this.f57500c, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    o();
                }
                return tVar;
            }
            return null;
        }
    }

    @Override
    public final void a(be.r rVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f57511f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i3));
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
                        if (uVar.f57538e == null) {
                            u a10 = u.a(uVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            k kVar = uVar.f57536b;
                            if (kVar != null) {
                                k(kVar, cancellationException);
                            }
                            od.q qVar = uVar.f57537c;
                            if (qVar != null) {
                                l(qVar, cancellationException, uVar.f57535a);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    u uVar2 = new u(obj, (k) null, (od.q) null, cancellationException2, 14);
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
    public final fd.c c() {
        return this.d;
    }

    @Override
    public final void e(Object obj) {
        p(this.f57500c);
    }

    @Override
    public final be.t f(Object obj, od.q qVar) {
        return F(obj, qVar);
    }

    @Override
    public final Throwable g(Object obj) {
        Throwable g7 = super.g(obj);
        if (g7 != null) {
            return g7;
        }
        return null;
    }

    @Override
    public final hd.d getCallerFrame() {
        fd.c cVar = this.d;
        if (cVar instanceof hd.d) {
            return (hd.d) cVar;
        }
        return null;
    }

    @Override
    public final fd.h getContext() {
        return this.f57513e;
    }

    @Override
    public final Object h(Object obj) {
        if (obj instanceof u) {
            return ((u) obj).f57535a;
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
            b0.m(this.f57513e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l(od.q qVar, Throwable th2, Object obj) {
        fd.h hVar = this.f57513e;
        try {
            qVar.a(th2, obj, hVar);
        } catch (Throwable th3) {
            b0.m(hVar, new RuntimeException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void m(be.r rVar, Throwable th2) {
        fd.h hVar = this.f57513e;
        int i3 = f57511f.get(this) & 536870911;
        if (i3 != 536870911) {
            try {
                rVar.h(i3, hVar);
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
            boolean z10 = false;
            if (!(obj instanceof q1)) {
                return false;
            }
            if ((obj instanceof k) || (obj instanceof be.r)) {
                z10 = true;
            }
            n nVar = new n(this, th2, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            q1 q1Var = (q1) obj;
            if (q1Var instanceof k) {
                k((k) obj, th2);
            } else if (q1Var instanceof be.r) {
                m((be.r) obj, th2);
            }
            if (!x()) {
                o();
            }
            p(this.f57500c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57512n;
        l0 l0Var = (l0) atomicReferenceFieldUpdater.get(this);
        if (l0Var == null) {
            return;
        }
        l0Var.dispose();
        atomicReferenceFieldUpdater.set(this, p1.f57525a);
    }

    public final void p(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z10;
        boolean z11;
        do {
            atomicIntegerFieldUpdater = f57511f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    boolean z12 = false;
                    if (i3 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fd.c cVar = this.d;
                    if (!z10 && (cVar instanceof be.f)) {
                        if (i3 != 1 && i3 != 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        int i12 = this.f57500c;
                        if (i12 == 1 || i12 == 2) {
                            z12 = true;
                        }
                        if (z11 == z12) {
                            be.f fVar = (be.f) cVar;
                            x xVar = fVar.d;
                            fd.h context = fVar.f3263e.getContext();
                            if (xVar.e(context)) {
                                xVar.c(context, this);
                                return;
                            }
                            t0 a10 = v1.a();
                            if (a10.f57533c >= 4294967296L) {
                                ed.e eVar = a10.f57534e;
                                if (eVar == null) {
                                    eVar = new ed.e();
                                    a10.f57534e = eVar;
                                }
                                eVar.addLast(this);
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
                    b0.t(this, cVar, z10);
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
        int i3;
        a1 a1Var;
        boolean x10 = x();
        do {
            atomicIntegerFieldUpdater = f57511f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i10 = i3 >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (x10) {
                        A();
                    }
                    Object obj = h.get(this);
                    if (!(obj instanceof v)) {
                        int i11 = this.f57500c;
                        if ((i11 == 1 || i11 == 2) && (a1Var = (a1) this.f57513e.get(y.f57551b)) != null && !a1Var.isActive()) {
                            CancellationException cancellationException = a1Var.getCancellationException();
                            b(cancellationException);
                            throw cancellationException;
                        }
                        return h(obj);
                    }
                    throw ((v) obj).f57540a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((l0) f57512n.get(this)) == null) {
            t();
        }
        if (x10) {
            A();
        }
        return gd.a.f12241a;
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a10 = dd.g.a(obj);
        if (a10 != null) {
            obj = new v(a10, false);
        }
        C(obj, this.f57500c, null);
    }

    public final void s() {
        l0 t10 = t();
        if (t10 != null && !(h.get(this) instanceof q1)) {
            t10.dispose();
            f57512n.set(this, p1.f57525a);
        }
    }

    public final l0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a1 a1Var = (a1) this.f57513e.get(y.f57551b);
        if (a1Var == null) {
            return null;
        }
        l0 n4 = b0.n(a1Var, true, new o(this, 0));
        do {
            atomicReferenceFieldUpdater = f57512n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n4;
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

    public final void u(od.l lVar) {
        v(new j(lVar, 1));
    }

    public final void v(wd.q1 r8) {
        throw new UnsupportedOperationException("Method not decompiled: wd.m.v(wd.q1):void");
    }

    public final boolean w() {
        return h.get(this) instanceof q1;
    }

    public final boolean x() {
        if (this.f57500c == 2) {
            fd.c cVar = this.d;
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (be.f.f3262n.get((be.f) cVar) != null) {
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
