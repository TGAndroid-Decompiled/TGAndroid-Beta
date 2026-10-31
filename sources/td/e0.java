package td;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.w6;
import w7.w9;
import w7.x9;
public abstract class e0 {
    public static final ea.a f48612a = new ea.a("RESUME_TOKEN");
    public static final ea.a f48613b = new ea.a("REMOVED_TASK");
    public static final ea.a f48614c = new ea.a("CLOSED_EMPTY");
    public static final ea.a d = new ea.a("COMPLETING_ALREADY");
    public static final ea.a e = new ea.a("COMPLETING_WAITING_CHILDREN");
    public static final ea.a f48615f = new ea.a("COMPLETING_RETRY");
    public static final ea.a f48616g = new ea.a("TOO_LATE_TO_CANCEL");
    public static final ea.a h = new ea.a("SEALED");
    public static final q0 f48617i = new q0(false);
    public static final q0 f48618j = new q0(true);

    public static t a() {
        ?? u1Var = new u1(true);
        u1Var.x(null);
        return u1Var;
    }

    public static final yd.e b(cd.h hVar) {
        if (hVar.get(b0.f48601b) == null) {
            hVar = hVar.plus(new i1());
        }
        return new yd.e(hVar);
    }

    public static i0 c(c0 c0Var, ld.p pVar) {
        d0 d0Var = d0.f48607a;
        cd.h i10 = i(c0Var.c(), cd.i.f4123a, true);
        ae.e eVar = m0.f48641a;
        if (i10 != eVar && i10.get(cd.d.f4122a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f48607a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object d(h0[] h0VarArr, ed.j jVar) {
        if (h0VarArr.length == 0) {
            return bd.q.f2660a;
        }
        e eVar = new e(h0VarArr);
        m mVar = new m(1, w6.b(jVar));
        mVar.s();
        int length = h0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0 h0Var = h0VarArr[i10];
            h0Var.start();
            c cVar = new c(eVar, mVar);
            cVar.f48604f = n(h0Var, false, cVar, 3);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f48603n.set(cVar2, dVar);
        }
        if (!(m.h.get(mVar) instanceof x1)) {
            dVar.b();
        } else {
            mVar.v(dVar);
        }
        Object r10 = mVar.r();
        dd.a aVar = dd.a.f5864a;
        return r10;
    }

    public static final void e(cd.h hVar, CancellationException cancellationException) {
        f1 f1Var = (f1) hVar.get(b0.f48601b);
        if (f1Var != null) {
            f1Var.cancel(cancellationException);
        }
    }

    public static final Object f(ld.p pVar, cd.c cVar) {
        yd.s sVar = new yd.s(cVar, cVar.getContext());
        Object a2 = x9.a(sVar, sVar, pVar);
        dd.a aVar = dd.a.f5864a;
        return a2;
    }

    public static final Object g(long j10, ed.c cVar) {
        if (j10 > 0) {
            m mVar = new m(1, w6.b(cVar));
            mVar.s();
            if (j10 < Long.MAX_VALUE) {
                j(mVar.e).a(j10, mVar);
            }
            Object r10 = mVar.r();
            if (r10 == dd.a.f5864a) {
                return r10;
            }
        }
        return ad.j.f401a;
    }

    public static final void h(cd.h hVar) {
        f1 f1Var = (f1) hVar.get(b0.f48601b);
        if (f1Var != null && !f1Var.isActive()) {
            throw f1Var.getCancellationException();
        }
    }

    public static final cd.h i(cd.h hVar, cd.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        x xVar = x.d;
        boolean booleanValue = ((Boolean) hVar.fold(bool, xVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.fold(bool, xVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.plus(hVar2);
        }
        x xVar2 = new x(2, 2);
        cd.i iVar = cd.i.f4123a;
        cd.h hVar3 = (cd.h) hVar.fold(iVar, xVar2);
        cd.h hVar4 = hVar2;
        if (booleanValue2) {
            hVar4 = hVar2.fold(iVar, x.f48677c);
        }
        return hVar3.plus(hVar4);
    }

    public static final j0 j(cd.h hVar) {
        j0 j0Var;
        cd.f fVar = hVar.get(cd.d.f4122a);
        if (fVar instanceof j0) {
            j0Var = (j0) fVar;
        } else {
            j0Var = null;
        }
        if (j0Var == null) {
            return g0.f48629a;
        }
        return j0Var;
    }

    public static final String k(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final m l(cd.c cVar) {
        m mVar;
        m mVar2;
        if (!(cVar instanceof yd.h)) {
            return new m(1, cVar);
        }
        yd.h hVar = (yd.h) cVar;
        ea.a aVar = yd.a.d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.h.f54402n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                mVar2 = null;
                break;
            } else if (obj instanceof m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                mVar2 = (m) obj;
                break loop0;
            } else if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if ((obj2 instanceof u) && ((u) obj2).d != null) {
                mVar2.o();
            } else {
                m.f48639f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f48599a);
                mVar = mVar2;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, cVar);
    }

    public static final void m(cd.h hVar, Throwable th2) {
        try {
            ud.b bVar = (ud.b) hVar.get(b0.f48600a);
            if (bVar != null) {
                bVar.c(th2);
            } else {
                yd.a.c(hVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                i8.d.a(runtimeException, th2);
                th2 = runtimeException;
            }
            yd.a.c(hVar, th2);
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

    public static final java.lang.Object o(java.util.Collection r4, ed.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: td.e0.o(java.util.Collection, ed.c):java.lang.Object");
    }

    public static final java.lang.Object p(td.f1[] r6, ed.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: td.e0.p(td.f1[], ed.c):java.lang.Object");
    }

    public static a2 q(c0 c0Var, ld.p pVar) {
        d0 d0Var = d0.f48607a;
        cd.h i10 = i(c0Var.c(), cd.i.f4123a, true);
        ae.e eVar = m0.f48641a;
        if (i10 != eVar && i10.get(cd.d.f4122a) == null) {
            i10 = i10.plus(eVar);
        }
        d0 d0Var2 = d0.f48607a;
        ?? aVar = new a(i10, true);
        aVar.L(d0Var, aVar, pVar);
        return aVar;
    }

    public static final Object r(Object obj) {
        if (obj instanceof v) {
            return l9.b.a(((v) obj).f48671a);
        }
        return obj;
    }

    public static final void s(m mVar, cd.c cVar, boolean z10) {
        Object h10;
        h2 h2Var;
        Object obj = m.h.get(mVar);
        Throwable g10 = mVar.g(obj);
        if (g10 != null) {
            h10 = l9.b.a(g10);
        } else {
            h10 = mVar.h(obj);
        }
        if (z10) {
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            yd.h hVar = (yd.h) cVar;
            ed.c cVar2 = hVar.e;
            Object obj2 = hVar.h;
            cd.h context = cVar2.getContext();
            Object k10 = yd.a.k(context, obj2);
            if (k10 != yd.a.f54394f) {
                h2Var = v(cVar2, context, k10);
            } else {
                h2Var = null;
            }
            try {
                cVar2.resumeWith(h10);
                if (h2Var != null && !h2Var.M()) {
                    return;
                }
                yd.a.f(context, k10);
                return;
            } catch (Throwable th2) {
                if (h2Var == null || h2Var.M()) {
                    yd.a.f(context, k10);
                }
                throw th2;
            }
        }
        cVar.resumeWith(h10);
    }

    public static final String t(cd.c cVar) {
        Object a2;
        if (cVar instanceof yd.h) {
            return cVar.toString();
        }
        try {
            a2 = cVar + '@' + k(cVar);
        } catch (Throwable th2) {
            a2 = l9.b.a(th2);
        }
        if (ad.g.a(a2) != null) {
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
        if (b1Var != null && (a1Var = b1Var.f48602a) != null) {
            return a1Var;
        }
        return obj;
    }

    public static final h2 v(cd.c cVar, cd.h hVar, Object obj) {
        h2 h2Var = null;
        if ((cVar instanceof ed.d) && hVar.get(i2.f48634a) != null) {
            ed.d dVar = (ed.d) cVar;
            while (true) {
                if (!(dVar instanceof k0) && (dVar = dVar.getCallerFrame()) != null) {
                    if (dVar instanceof h2) {
                        h2Var = (h2) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (h2Var != null) {
                h2Var.N(hVar, obj);
            }
        }
        return h2Var;
    }

    public static final Object w(cd.h hVar, ld.p pVar, cd.c cVar) {
        cd.h i10;
        Object u10;
        cd.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, x.d)).booleanValue()) {
            i10 = context.plus(hVar);
        } else {
            i10 = i(context, hVar, false);
        }
        h(i10);
        if (i10 == context) {
            yd.s sVar = new yd.s(cVar, i10);
            u10 = x9.a(sVar, sVar, pVar);
        } else {
            cd.d dVar = cd.d.f4122a;
            if (kotlin.jvm.internal.i.a(i10.get(dVar), context.get(dVar))) {
                h2 h2Var = new h2(cVar, i10);
                cd.h hVar2 = h2Var.f48597c;
                Object k10 = yd.a.k(hVar2, null);
                try {
                    Object a2 = x9.a(h2Var, h2Var, pVar);
                    yd.a.f(hVar2, k10);
                    u10 = a2;
                } catch (Throwable th2) {
                    yd.a.f(hVar2, k10);
                    throw th2;
                }
            } else {
                yd.s sVar2 = new yd.s(cVar, i10);
                w9.a(pVar, sVar2, sVar2);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k0.e;
                while (true) {
                    int i11 = atomicIntegerFieldUpdater.get(sVar2);
                    if (i11 != 0) {
                        if (i11 == 2) {
                            u10 = u(sVar2.u());
                            if (u10 instanceof v) {
                                throw ((v) u10).f48671a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(sVar2, 0, 1)) {
                        u10 = dd.a.f5864a;
                        break;
                    }
                }
            }
        }
        dd.a aVar = dd.a.f5864a;
        return u10;
    }

    public static final Object x(long j10, ld.p pVar, cd.c cVar) {
        Object vVar;
        Object B;
        if (j10 > 0) {
            f2 f2Var = new f2(j10, cVar);
            n(f2Var, false, new p0(j(f2Var.d.getContext()).b(f2Var.e, f2Var, f2Var.f48597c), 0), 3);
            try {
                kotlin.jvm.internal.s.a(2, pVar);
                vVar = pVar.invoke(f2Var, f2Var);
            } catch (Throwable th2) {
                vVar = new v(th2, false);
            }
            Object obj = dd.a.f5864a;
            if (vVar != obj && (B = f2Var.B(vVar)) != e) {
                if (B instanceof v) {
                    Throwable th3 = ((v) B).f48671a;
                    if ((th3 instanceof e2) && ((e2) th3).f48620a == f2Var) {
                        if (vVar instanceof v) {
                            throw ((v) vVar).f48671a;
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
        throw new e2("Timed out immediately", null);
    }
}
