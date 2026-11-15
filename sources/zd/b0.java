package zd;

import a8.ba;
import a8.ma;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
public abstract class b0 {
    public static final aa.b0 f61252a = new aa.b0("RESUME_TOKEN", 1);
    public static final aa.b0 f61253b = new aa.b0("REMOVED_TASK", 1);
    public static final aa.b0 f61254c = new aa.b0("CLOSED_EMPTY", 1);
    public static final aa.b0 d = new aa.b0("COMPLETING_ALREADY", 1);
    public static final aa.b0 f61255e = new aa.b0("COMPLETING_WAITING_CHILDREN", 1);
    public static final aa.b0 f61256f = new aa.b0("COMPLETING_RETRY", 1);
    public static final aa.b0 f61257g = new aa.b0("TOO_LATE_TO_CANCEL", 1);
    public static final aa.b0 h = new aa.b0("SEALED", 1);
    public static final n0 f61258i = new n0(false);
    public static final n0 f61259j = new n0(true);

    public static t a() {
        ?? n1Var = new n1(true);
        n1Var.y(null);
        return n1Var;
    }

    public static final ee.c b(id.h hVar) {
        if (hVar.get(y.f61340b) == null) {
            hVar = hVar.plus(new c1());
        }
        return new ee.c(hVar);
    }

    public static f0 c(z zVar, rd.p pVar) {
        a0 a0Var = a0.f61247a;
        id.h r10 = r(zVar, id.i.f15913a);
        a0 a0Var2 = a0.f61247a;
        ?? aVar = new a(r10, true);
        aVar.S(a0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(e0[] e0VarArr, kd.j jVar) {
        if (e0VarArr.length == 0) {
            return hd.n.f13831a;
        }
        e eVar = new e(e0VarArr);
        m mVar = new m(1, c8.v0.b(jVar));
        mVar.s();
        int length = e0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i7 = 0; i7 < length; i7++) {
            e0 e0Var = e0VarArr[i7];
            e0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f61264f = n(e0Var, true, cVar);
            cVarArr[i7] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar2 = cVarArr[i10];
            cVar2.getClass();
            c.f61262n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof q1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f16999a;
        return r10;
    }

    public static final Object e(rd.p pVar, id.c cVar) {
        ee.q qVar = new ee.q(cVar, cVar.getContext());
        Object a10 = ba.a(qVar, qVar, pVar);
        jd.a aVar = jd.a.f16999a;
        return a10;
    }

    public static final Object f(long j3, kd.c cVar) {
        if (j3 > 0) {
            m mVar = new m(1, c8.v0.b(cVar));
            mVar.s();
            if (j3 < Long.MAX_VALUE) {
                i(mVar.f61302e).b(j3, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == jd.a.f16999a) {
                return r10;
            }
        }
        return gd.k.f13173a;
    }

    public static final void g(id.h hVar) {
        a1 a1Var = (a1) hVar.get(y.f61340b);
        if (a1Var != null && !a1Var.isActive()) {
            throw a1Var.getCancellationException();
        }
    }

    public static final id.h h(id.h hVar, id.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.fold(bool, new b1.e(10))).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, new b1.e(10))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        b1.e eVar = new b1.e(11);
        id.i iVar = id.i.f15913a;
        id.h hVar3 = (id.h) hVar.fold(iVar, eVar);
        id.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, new b1.e(12));
        }
        return hVar3.plus(hVar4);
    }

    public static final g0 i(id.h hVar) {
        g0 g0Var;
        id.f fVar = hVar.get(id.d.f15912a);
        if (fVar instanceof g0) {
            g0Var = (g0) fVar;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            return d0.f61269a;
        }
        return g0Var;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final a1 k(id.h hVar) {
        a1 a1Var = (a1) hVar.get(y.f61340b);
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final m l(id.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof ee.f)) {
            return new m(1, cVar);
        }
        ee.f fVar = (ee.f) cVar;
        aa.b0 b0Var = ee.a.f10601c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.f10610n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, b0Var);
                mVar2 = null;
                break;
            } else if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, b0Var)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            } else if (obj != b0Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if ((obj2 instanceof u) && ((u) obj2).d != null) {
                mVar2.o();
            } else {
                m.f61300f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f61251a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(id.h hVar, Throwable th2) {
        try {
            ae.b bVar = (ae.b) hVar.get(y.f61339a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                ee.a.d(hVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                ma.a(runtimeException, th2);
                th2 = runtimeException;
            }
            ee.a.d(hVar, th2);
        }
    }

    public static final l0 n(a1 a1Var, boolean z10, e1 e1Var) {
        if (a1Var instanceof n1) {
            return ((n1) a1Var).z(z10, e1Var);
        }
        return a1Var.invokeOnCompletion(e1Var.i(), z10, new kotlin.jvm.internal.h(1, e1Var, e1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final java.lang.Object o(java.util.Collection r4, kd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: zd.b0.o(java.util.Collection, kd.c):java.lang.Object");
    }

    public static final java.lang.Object p(zd.a1[] r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: zd.b0.p(zd.a1[], kd.c):java.lang.Object");
    }

    public static s1 q(z zVar, rd.p pVar) {
        a0 a0Var = a0.f61247a;
        id.h r10 = r(zVar, id.i.f15913a);
        a0 a0Var2 = a0.f61247a;
        ?? aVar = new a(r10, true);
        aVar.S(a0Var, aVar, pVar);
        return aVar;
    }

    public static final id.h r(z zVar, id.h hVar) {
        id.h h7 = h(zVar.c(), hVar, true);
        ge.e eVar = j0.f61292a;
        if (h7 != eVar && h7.get(id.d.f15912a) == null) {
            return h7.plus(eVar);
        }
        return h7;
    }

    public static final Object s(Object obj) {
        if (obj instanceof v) {
            return af.b.b(((v) obj).f61329a);
        }
        return obj;
    }

    public static final void t(m mVar, id.c cVar, boolean z10) {
        Object h7;
        a2 a2Var;
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        if (g10 != null) {
            h7 = af.b.b(g10);
        } else {
            h7 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            ee.f fVar = (ee.f) cVar;
            kd.c cVar2 = fVar.f10611e;
            Object obj2 = fVar.h;
            id.h context = cVar2.getContext();
            Object l10 = ee.a.l(context, obj2);
            if (l10 != ee.a.d) {
                a2Var = x(cVar2, context, l10);
            } else {
                a2Var = null;
            }
            try {
                cVar2.resumeWith(h7);
                if (a2Var != null && !a2Var.T()) {
                    return;
                }
                ee.a.g(context, l10);
                return;
            } catch (Throwable th2) {
                if (a2Var == null || a2Var.T()) {
                    ee.a.g(context, l10);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h7);
    }

    public static Object u(rd.p pVar) {
        long j3;
        v vVar;
        Thread currentThread = Thread.currentThread();
        t0 a10 = v1.a();
        id.h h7 = h(id.i.f15913a, a10, true);
        ge.e eVar = j0.f61292a;
        if (h7 != eVar && h7.get(id.d.f15912a) == null) {
            h7 = h7.plus(eVar);
        }
        h hVar = new h(h7, currentThread, a10);
        hVar.S(a0.f61247a, hVar, pVar);
        t0 t0Var = hVar.f61283e;
        if (t0Var != null) {
            int i7 = t0.f61321f;
            t0Var.i(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (t0Var != null) {
                    j3 = t0Var.j();
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (!hVar.A()) {
                    LockSupport.parkNanos(hVar, j3);
                } else {
                    if (t0Var != null) {
                        int i10 = t0.f61321f;
                        t0Var.g(false);
                    }
                    Object w10 = w(n1.f61308a.get(hVar));
                    if (w10 instanceof v) {
                        vVar = (v) w10;
                    } else {
                        vVar = null;
                    }
                    if (vVar == null) {
                        return w10;
                    }
                    throw vVar.f61329a;
                }
            } catch (Throwable th2) {
                if (t0Var != null) {
                    int i11 = t0.f61321f;
                    t0Var.g(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar.j(interruptedException);
        throw interruptedException;
    }

    public static final String v(id.c cVar) {
        Object b10;
        if (cVar instanceof ee.f) {
            return ((ee.f) cVar).toString();
        }
        try {
            b10 = cVar + '@' + j(cVar);
        } catch (Throwable th2) {
            b10 = af.b.b(th2);
        }
        if (gd.g.a(b10) != null) {
            b10 = cVar.getClass().getName() + '@' + j(cVar);
        }
        return (String) b10;
    }

    public static final Object w(Object obj) {
        y0 y0Var;
        x0 x0Var;
        if (obj instanceof y0) {
            y0Var = (y0) obj;
        } else {
            y0Var = null;
        }
        if (y0Var != null && (x0Var = y0Var.f61341a) != null) {
            return x0Var;
        }
        return obj;
    }

    public static final a2 x(id.c cVar, id.h hVar, Object obj) {
        a2 a2Var = null;
        if ((cVar instanceof kd.d) && hVar.get(b2.f61261a) != null) {
            kd.d dVar = (kd.d) cVar;
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

    public static final Object y(id.h hVar, rd.p pVar, id.c cVar) {
        id.h h7;
        Object w10;
        id.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, new b1.e(10))).booleanValue()) {
            h7 = context.plus(hVar);
        } else {
            h7 = h(context, hVar, false);
        }
        g(h7);
        if (h7 == context) {
            ee.q qVar = new ee.q(cVar, h7);
            w10 = ba.a(qVar, qVar, pVar);
        } else {
            id.d dVar = id.d.f15912a;
            if (kotlin.jvm.internal.j.a(h7.get(dVar), context.get(dVar))) {
                a2 a2Var = new a2(cVar, h7);
                id.h hVar2 = a2Var.f61246c;
                Object l10 = ee.a.l(hVar2, null);
                try {
                    Object a10 = ba.a(a2Var, a2Var, pVar);
                    ee.a.g(hVar2, l10);
                    w10 = a10;
                } catch (Throwable th2) {
                    ee.a.g(hVar2, l10);
                    throw th2;
                }
            } else {
                ee.q qVar2 = new ee.q(cVar, h7);
                try {
                    ee.a.h(c8.v0.b(c8.v0.a(qVar2, qVar2, pVar)), gd.k.f13173a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.f61284e;
                    while (true) {
                        int i7 = atomicIntegerFieldUpdater.get(qVar2);
                        if (i7 != 0) {
                            if (i7 == 2) {
                                w10 = w(n1.f61308a.get(qVar2));
                                if (w10 instanceof v) {
                                    throw ((v) w10).f61329a;
                                }
                            } else {
                                throw new IllegalStateException("Already suspended");
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(qVar2, 0, 1)) {
                            w10 = jd.a.f16999a;
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    qVar2.resumeWith(af.b.b(th3));
                    throw th3;
                }
            }
        }
        jd.a aVar = jd.a.f16999a;
        return w10;
    }

    public static final Object z(long j3, rd.p pVar, id.c cVar) {
        Object vVar;
        Object D;
        if (j3 > 0) {
            y1 y1Var = new y1(j3, cVar);
            n(y1Var, true, new m0(i(y1Var.d.getContext()).a(y1Var.f61342e, y1Var, y1Var.f61246c), 0));
            try {
                kotlin.jvm.internal.u.a(2, pVar);
                vVar = pVar.invoke(y1Var, y1Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = jd.a.f16999a;
            if (vVar != obj && (D = y1Var.D(vVar)) != f61255e) {
                if (D instanceof v) {
                    Throwable th3 = ((v) D).f61329a;
                    if ((th3 instanceof x1) && ((x1) th3).f61338a == y1Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f61329a;
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
