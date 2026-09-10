package zd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.h7;
import v7.i7;
import v7.s7;
import v7.u7;
public abstract class e0 {
    public static final ee.v f48000a = new ee.v("RESUME_TOKEN", 0);
    public static final ee.v f48001b = new ee.v("REMOVED_TASK", 0);
    public static final ee.v f48002c = new ee.v("CLOSED_EMPTY", 0);
    public static final ee.v d = new ee.v("COMPLETING_ALREADY", 0);
    public static final ee.v e = new ee.v("COMPLETING_WAITING_CHILDREN", 0);
    public static final ee.v f48003f = new ee.v("COMPLETING_RETRY", 0);
    public static final ee.v f48004g = new ee.v("TOO_LATE_TO_CANCEL", 0);
    public static final ee.v h = new ee.v("SEALED", 0);
    public static final q0 f48005i = new q0(false);
    public static final q0 f48006j = new q0(true);

    public static t a() {
        ?? u1Var = new u1(true);
        u1Var.x(null);
        return u1Var;
    }

    public static final ee.e b(id.h hVar) {
        if (hVar.get(b0.f47988b) == null) {
            hVar = hVar.plus(new i1());
        }
        return new ee.e(hVar);
    }

    public static i0 c(c0 c0Var, rd.p pVar) {
        d0 d0Var = d0.f47995a;
        id.h i10 = i(c0Var.c(), id.i.f10565a, true);
        ge.e eVar = m0.f48027a;
        if (i10 != eVar && i10.get(id.d.f10564a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f47995a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(h0[] h0VarArr, kd.j jVar) {
        if (h0VarArr.length == 0) {
            return hd.o.f9308a;
        }
        e eVar = new e(h0VarArr);
        m mVar = new m(1, w7.g.b(jVar));
        mVar.s();
        int length = h0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0 h0Var = h0VarArr[i10];
            h0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f47991f = n(h0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f47990n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof x1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f11861a;
        return r10;
    }

    public static final void e(id.h hVar, CancellationException cancellationException) {
        f1 f1Var = (f1) hVar.get(b0.f47988b);
        if (f1Var != null) {
            f1Var.cancel(cancellationException);
        }
    }

    public static final Object f(rd.p pVar, id.c cVar) {
        ee.s sVar = new ee.s(cVar, cVar.getContext());
        Object a2 = i7.a(sVar, sVar, pVar);
        jd.a aVar = jd.a.f11861a;
        return a2;
    }

    public static final Object g(long j3, kd.c cVar) {
        if (j3 > 0) {
            m mVar = new m(1, w7.g.b(cVar));
            mVar.s();
            if (j3 < Long.MAX_VALUE) {
                j(mVar.e).b(j3, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == jd.a.f11861a) {
                return r10;
            }
        }
        return gd.i.f8748a;
    }

    public static final void h(id.h hVar) {
        f1 f1Var = (f1) hVar.get(b0.f47988b);
        if (f1Var != null && !f1Var.isActive()) {
            throw f1Var.getCancellationException();
        }
    }

    public static final id.h i(id.h hVar, id.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        id.i iVar = id.i.f10565a;
        id.h hVar3 = (id.h) hVar.fold(iVar, xVar2);
        id.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, x.f48063c);
        }
        return hVar3.plus(hVar4);
    }

    public static final j0 j(id.h hVar) {
        j0 j0Var;
        id.f fVar = hVar.get(id.d.f10564a);
        if (fVar instanceof j0) {
            j0Var = (j0) fVar;
        } else {
            j0Var = null;
        }
        if (j0Var == null) {
            return g0.f48016a;
        }
        return j0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(id.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof ee.h)) {
            return new m(1, cVar);
        }
        ee.h hVar = (ee.h) cVar;
        ee.v vVar = ee.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.h.f7482n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vVar);
                mVar2 = null;
                break;
            } else if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            } else if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if ((obj2 instanceof u) && ((u) obj2).d != null) {
                mVar2.o();
            } else {
                m.f48025f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f47986a);
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
            ae.b bVar = (ae.b) hVar.get(b0.f47987a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                ee.a.c(hVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                s7.a(runtimeException, th2);
                th2 = runtimeException;
            }
            ee.a.c(hVar, th2);
        }
    }

    public static o0 n(f1 f1Var, boolean z10, k1 k1Var, int i10) {
        boolean z11 = false;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if (f1Var instanceof u1) {
            return ((u1) f1Var).y(z10, z11, k1Var);
        }
        return f1Var.invokeOnCompletion(z10, z11, new kotlin.jvm.internal.g(1, k1Var, d1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final java.lang.Object o(java.util.Collection r4, kd.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: zd.e0.o(java.util.Collection, kd.c):java.lang.Object");
    }

    public static final java.lang.Object p(zd.f1[] r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: zd.e0.p(zd.f1[], kd.c):java.lang.Object");
    }

    public static z1 q(c0 c0Var, rd.p pVar) {
        d0 d0Var = d0.f47995a;
        id.h i10 = i(c0Var.c(), id.i.f10565a, true);
        ge.e eVar = m0.f48027a;
        if (i10 != eVar && i10.get(id.d.f10564a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f47995a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof v) {
            return u7.a(((v) obj).f48057a);
        }
        return obj;
    }

    public static final void s(m mVar, id.c cVar, boolean z10) {
        Object h10;
        g2 g2Var;
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        if (g10 != null) {
            h10 = u7.a(g10);
        } else {
            h10 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            ee.h hVar = (ee.h) cVar;
            kd.c cVar2 = hVar.e;
            Object obj2 = hVar.h;
            id.h context = cVar2.getContext();
            Object k10 = ee.a.k(context, obj2);
            if (k10 != ee.a.f7474f) {
                g2Var = v(cVar2, context, k10);
            } else {
                g2Var = null;
            }
            try {
                cVar2.resumeWith(h10);
                if (g2Var != null && !g2Var.M()) {
                    return;
                }
                ee.a.f(context, k10);
                return;
            } catch (Throwable th2) {
                if (g2Var == null || g2Var.M()) {
                    ee.a.f(context, k10);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h10);
    }

    public static final String t(id.c cVar) {
        Object a2;
        if (cVar instanceof ee.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = u7.a(th2);
        }
        if (gd.f.a(a2) != null) {
            a2 = cVar.getClass().getName() + '@' + k(cVar);
        }
        return (String) a2;
    }

    public static final Object u(Object obj) {
        b1 b1Var;
        a1 a1Var;
        if (obj instanceof b1) {
            b1Var = (b1) obj;
        } else {
            b1Var = null;
        }
        if (b1Var != null && (a1Var = b1Var.f47989a) != null) {
            return a1Var;
        }
        return obj;
    }

    public static final g2 v(id.c cVar, id.h hVar, Object obj) {
        g2 g2Var = null;
        if ((cVar instanceof kd.d) && hVar.get(h2.f48018a) != null) {
            kd.d dVar = (kd.d) cVar;
            while (true) {
                if (!(dVar instanceof k0) && (dVar = dVar.getCallerFrame()) != null) {
                    if (dVar instanceof g2) {
                        g2Var = (g2) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (g2Var != null) {
                g2Var.N(hVar, obj);
            }
        }
        return g2Var;
    }

    public static final Object w(id.h hVar, rd.p pVar, id.c cVar) {
        id.h i10;
        Object u10;
        id.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue()) {
            i10 = context.plus(hVar);
        } else {
            i10 = i(context, hVar, false);
        }
        h(i10);
        if (i10 == context) {
            ee.s sVar = new ee.s(cVar, i10);
            u10 = i7.a(sVar, sVar, pVar);
        } else {
            id.d dVar = id.d.f10564a;
            if (kotlin.jvm.internal.i.a(i10.get(dVar), context.get(dVar))) {
                g2 g2Var = new g2(cVar, i10);
                id.h hVar2 = g2Var.f47984c;
                Object k10 = ee.a.k(hVar2, null);
                try {
                    Object a2 = i7.a(g2Var, g2Var, pVar);
                    ee.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    ee.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                ee.s sVar2 = new ee.s(cVar, i10);
                h7.a(pVar, sVar2, sVar2);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k0.e;
                while (true) {
                    int i11 = atomicIntegerFieldUpdater.get(sVar2);
                    if (i11 != 0) {
                        if (i11 == 2) {
                            u10 = u(sVar2.u());
                            if (u10 instanceof v) {
                                throw ((v) u10).f48057a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(sVar2, 0, 1)) {
                        u10 = jd.a.f11861a;
                        break;
                    }
                }
            }
        }
        jd.a aVar = jd.a.f11861a;
        return u10;
    }

    public static final Object x(long j3, rd.p pVar, id.c cVar) {
        Object vVar;
        Object B;
        if (j3 > 0) {
            e2 e2Var = new e2(j3, cVar);
            n(e2Var, false, new p0(j(e2Var.d.getContext()).a(e2Var.e, e2Var, e2Var.f47984c), 0), 3);
            try {
                kotlin.jvm.internal.s.a(2, pVar);
                vVar = pVar.invoke(e2Var, e2Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = jd.a.f11861a;
            if (vVar != obj && (B = e2Var.B(vVar)) != e) {
                if (B instanceof v) {
                    Throwable th3 = ((v) B).f48057a;
                    if ((th3 instanceof d2) && ((d2) th3).f47997a == e2Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f48057a;
                        }
                    } else {
                        throw th3;
                    }
                } else {
                    vVar = u(B);
                }
                return vVar;
            }
            return obj;
        }
        throw new d2("Timed out immediately", null);
    }
}
