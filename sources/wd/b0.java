package wd;

import b8.gb;
import b8.ib;
import b8.jc;
import b8.u9;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class b0 {
    public static final be.t f57463a = new be.t("RESUME_TOKEN", 0);
    public static final be.t f57464b = new be.t("REMOVED_TASK", 0);
    public static final be.t f57465c = new be.t("CLOSED_EMPTY", 0);
    public static final be.t d = new be.t("COMPLETING_ALREADY", 0);
    public static final be.t f57466e = new be.t("COMPLETING_WAITING_CHILDREN", 0);
    public static final be.t f57467f = new be.t("COMPLETING_RETRY", 0);
    public static final be.t f57468g = new be.t("TOO_LATE_TO_CANCEL", 0);
    public static final be.t h = new be.t("SEALED", 0);
    public static final n0 f57469i = new n0(false);
    public static final n0 f57470j = new n0(true);

    public static t a() {
        ?? n1Var = new n1(true);
        n1Var.y(null);
        return n1Var;
    }

    public static final be.c b(fd.h hVar) {
        if (hVar.get(y.f57551b) == null) {
            hVar = hVar.plus(new c1());
        }
        return new be.c(hVar);
    }

    public static f0 c(z zVar, od.p pVar) {
        a0 a0Var = a0.f57458a;
        fd.h r5 = r(zVar, fd.i.f11567a);
        a0 a0Var2 = a0.f57458a;
        ?? aVar = new a(r5, true);
        aVar.S(a0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(e0[] e0VarArr, hd.j jVar) {
        if (e0VarArr.length == 0) {
            return ed.o.f9953a;
        }
        e eVar = new e(e0VarArr);
        m mVar = new m(1, jc.b(jVar));
        mVar.s();
        int length = e0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i3 = 0; i3 < length; i3++) {
            e0 e0Var = e0VarArr[i3];
            e0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f57475f = n(e0Var, true, cVar);
            cVarArr[i3] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar2 = cVarArr[i10];
            cVar2.getClass();
            c.f57473n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof q1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r5 = mVar.r();
        gd.a aVar = gd.a.f12241a;
        return r5;
    }

    public static final Object e(od.p pVar, fd.c cVar) {
        be.q qVar = new be.q(cVar, cVar.getContext());
        Object a10 = u9.a(qVar, qVar, pVar);
        gd.a aVar = gd.a.f12241a;
        return a10;
    }

    public static final Object f(long j10, hd.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, jc.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                i(mVar.f57513e).a(j10, mVar);
            }
            Object r5 = mVar.r();
            if (r5 == gd.a.f12241a) {
                return r5;
            }
        }
        return dd.k.f8801a;
    }

    public static final void g(fd.h hVar) {
        a1 a1Var = (a1) hVar.get(y.f57551b);
        if (a1Var != null && !a1Var.isActive()) {
            throw a1Var.getCancellationException();
        }
    }

    public static final fd.h h(fd.h hVar, fd.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.fold(bool, new ae.j(10))).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, new ae.j(10))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        ae.j jVar = new ae.j(11);
        fd.i iVar = fd.i.f11567a;
        fd.h hVar3 = (fd.h) hVar.fold(iVar, jVar);
        fd.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, new ae.j(12));
        }
        return hVar3.plus(hVar4);
    }

    public static final g0 i(fd.h hVar) {
        g0 g0Var;
        fd.f fVar = hVar.get(fd.d.f11566a);
        if (fVar instanceof g0) {
            g0Var = (g0) fVar;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            return d0.f57480a;
        }
        return g0Var;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final a1 k(fd.h hVar) {
        a1 a1Var = (a1) hVar.get(y.f57551b);
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final m l(fd.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof be.f)) {
            return new m(1, cVar);
        }
        be.f fVar = (be.f) cVar;
        be.t tVar = be.a.f3253c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.f.f3262n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, tVar);
                mVar2 = null;
                break;
            } else if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            } else if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if ((obj2 instanceof u) && ((u) obj2).d != null) {
                mVar2.o();
            } else {
                m.f57511f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f57462a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(fd.h hVar, Throwable th2) {
        try {
            xd.b bVar = (xd.b) hVar.get(y.f57550a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                be.a.d(hVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                gb.a(runtimeException, th2);
                th2 = runtimeException;
            }
            be.a.d(hVar, th2);
        }
    }

    public static final l0 n(a1 a1Var, boolean z10, e1 e1Var) {
        if (a1Var instanceof n1) {
            return ((n1) a1Var).z(z10, e1Var);
        }
        return a1Var.invokeOnCompletion(e1Var.i(), z10, new kotlin.jvm.internal.h(1, e1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final java.lang.Object o(java.util.Collection r4, hd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: wd.b0.o(java.util.Collection, hd.c):java.lang.Object");
    }

    public static final java.lang.Object p(wd.a1[] r6, hd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: wd.b0.p(wd.a1[], hd.c):java.lang.Object");
    }

    public static s1 q(z zVar, od.p pVar) {
        a0 a0Var = a0.f57458a;
        fd.h r5 = r(zVar, fd.i.f11567a);
        a0 a0Var2 = a0.f57458a;
        ?? aVar = new a(r5, true);
        aVar.S(a0Var, aVar, pVar);
        return aVar;
    }

    public static final fd.h r(z zVar, fd.h hVar) {
        fd.h h7 = h(zVar.c(), hVar, true);
        de.e eVar = j0.f57503a;
        if (h7 != eVar && h7.get(fd.d.f11566a) == null) {
            return h7.plus(eVar);
        }
        return h7;
    }

    public static final Object s(Object obj) {
        if (obj instanceof v) {
            return ib.a(((v) obj).f57540a);
        }
        return obj;
    }

    public static final void t(m mVar, fd.c cVar, boolean z10) {
        Object h7;
        a2 a2Var;
        Object obj = m.h.get(mVar);
        Throwable g7 = mVar.g(obj);
        if (g7 != null) {
            h7 = ib.a(g7);
        } else {
            h7 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            be.f fVar = (be.f) cVar;
            hd.c cVar2 = fVar.f3263e;
            Object obj2 = fVar.h;
            fd.h context = cVar2.getContext();
            Object l10 = be.a.l(context, obj2);
            if (l10 != be.a.d) {
                a2Var = x(cVar2, context, l10);
            } else {
                a2Var = null;
            }
            try {
                cVar2.resumeWith(h7);
                if (a2Var != null && !a2Var.T()) {
                    return;
                }
                be.a.g(context, l10);
                return;
            } catch (Throwable th2) {
                if (a2Var == null || a2Var.T()) {
                    be.a.g(context, l10);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h7);
    }

    public static Object u(od.p pVar) {
        long j10;
        v vVar;
        Thread currentThread = Thread.currentThread();
        t0 a10 = v1.a();
        fd.h h7 = h(fd.i.f11567a, a10, true);
        de.e eVar = j0.f57503a;
        if (h7 != eVar && h7.get(fd.d.f11566a) == null) {
            h7 = h7.plus(eVar);
        }
        h hVar = new h(h7, currentThread, a10);
        hVar.S(a0.f57458a, hVar, pVar);
        t0 t0Var = hVar.f57494e;
        if (t0Var != null) {
            int i3 = t0.f57532f;
            t0Var.i(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (t0Var != null) {
                    j10 = t0Var.j();
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (!hVar.A()) {
                    LockSupport.parkNanos(hVar, j10);
                } else {
                    if (t0Var != null) {
                        int i10 = t0.f57532f;
                        t0Var.g(false);
                    }
                    Object w10 = w(n1.f57519a.get(hVar));
                    if (w10 instanceof v) {
                        vVar = (v) w10;
                    } else {
                        vVar = null;
                    }
                    if (vVar == null) {
                        return w10;
                    }
                    throw vVar.f57540a;
                }
            } catch (Throwable th2) {
                if (t0Var != null) {
                    int i11 = t0.f57532f;
                    t0Var.g(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar.j(interruptedException);
        throw interruptedException;
    }

    public static final String v(fd.c cVar) {
        Object a10;
        if (cVar instanceof be.f) {
            return ((be.f) cVar).toString();
        }
        try {
            a10 = cVar + '@' + j(cVar);
        } catch (Throwable th2) {
            a10 = ib.a(th2);
        }
        if (dd.g.a(a10) != null) {
            a10 = cVar.getClass().getName() + '@' + j(cVar);
        }
        return (String) a10;
    }

    public static final Object w(Object obj) {
        y0 y0Var;
        x0 x0Var;
        if (obj instanceof y0) {
            y0Var = (y0) obj;
        } else {
            y0Var = null;
        }
        if (y0Var != null && (x0Var = y0Var.f57552a) != null) {
            return x0Var;
        }
        return obj;
    }

    public static final a2 x(fd.c cVar, fd.h hVar, Object obj) {
        a2 a2Var = null;
        if ((cVar instanceof hd.d) && hVar.get(b2.f57472a) != null) {
            hd.d dVar = (hd.d) cVar;
            while (true) {
                if (!(dVar instanceof h0) && (dVar = dVar.getCallerFrame()) != null) {
                    if (dVar instanceof a2) {
                        a2Var = (a2) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (a2Var != null) {
                a2Var.U(hVar, obj);
            }
        }
        return a2Var;
    }

    public static final Object y(fd.h hVar, od.p pVar, fd.c cVar) {
        fd.h h7;
        Object w10;
        fd.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, new ae.j(10))).booleanValue()) {
            h7 = context.plus(hVar);
        } else {
            h7 = h(context, hVar, false);
        }
        g(h7);
        if (h7 == context) {
            be.q qVar = new be.q(cVar, h7);
            w10 = u9.a(qVar, qVar, pVar);
        } else {
            fd.d dVar = fd.d.f11566a;
            if (kotlin.jvm.internal.j.a(h7.get(dVar), context.get(dVar))) {
                a2 a2Var = new a2(cVar, h7);
                fd.h hVar2 = a2Var.f57457c;
                Object l10 = be.a.l(hVar2, null);
                try {
                    Object a10 = u9.a(a2Var, a2Var, pVar);
                    be.a.g(hVar2, l10);
                    w10 = a10;
                } catch (Throwable th2) {
                    be.a.g(hVar2, l10);
                    throw th2;
                }
            } else {
                be.q qVar2 = new be.q(cVar, h7);
                try {
                    be.a.h(jc.b(jc.a(qVar2, qVar2, pVar)), dd.k.f8801a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.f57495e;
                    while (true) {
                        int i3 = atomicIntegerFieldUpdater.get(qVar2);
                        if (i3 != 0) {
                            if (i3 == 2) {
                                w10 = w(n1.f57519a.get(qVar2));
                                if (w10 instanceof v) {
                                    throw ((v) w10).f57540a;
                                }
                            } else {
                                throw new IllegalStateException("Already suspended");
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(qVar2, 0, 1)) {
                            w10 = gd.a.f12241a;
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    qVar2.resumeWith(ib.a(th3));
                    throw th3;
                }
            }
        }
        gd.a aVar = gd.a.f12241a;
        return w10;
    }

    public static final Object z(long j10, od.p pVar, fd.c cVar) {
        Object vVar;
        Object D;
        if (j10 > 0) {
            y1 y1Var = new y1(j10, cVar);
            n(y1Var, true, new m0(i(y1Var.d.getContext()).b(y1Var.f57553e, y1Var, y1Var.f57457c), 0));
            try {
                kotlin.jvm.internal.u.a(2, pVar);
                vVar = pVar.invoke(y1Var, y1Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = gd.a.f12241a;
            if (vVar != obj && (D = y1Var.D(vVar)) != f57466e) {
                if (D instanceof v) {
                    Throwable th3 = ((v) D).f57540a;
                    if ((th3 instanceof x1) && ((x1) th3).f57549a == y1Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f57540a;
                        }
                    } else {
                        throw th3;
                    }
                } else {
                    vVar = w(D);
                }
                return vVar;
            }
            return obj;
        }
        throw new x1("Timed out immediately", null);
    }
}
