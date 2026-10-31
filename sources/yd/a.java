package yd;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.a0;
import td.b0;
import td.c2;
import td.d2;
import td.e0;
import td.f1;
import td.h2;
import td.w0;
public abstract class a {
    public static final ea.a f54391a = new ea.a("NO_DECISION");
    public static final ea.a f54392b = new ea.a("CLOSED");
    public static final ea.a f54393c = new ea.a("UNDEFINED");
    public static final ea.a d = new ea.a("REUSABLE_CLAIMED");
    public static final ea.a e = new ea.a("CONDITION_FALSE");
    public static final ea.a f54394f = new ea.a("NO_THREAD_ELEMENTS");

    public static final Object a(t tVar, long j10, ld.p pVar) {
        while (true) {
            if (tVar.f54419c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f54397a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            ea.a aVar = f54392b;
            if (obj == aVar) {
                return aVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f54419c + 1), tVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        break;
                    }
                }
                if (tVar.d()) {
                    tVar.e();
                }
            }
            tVar = tVar2;
        }
    }

    public static final t b(Object obj) {
        if (obj != f54392b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(cd.h hVar, Throwable th2) {
        Throwable runtimeException;
        for (ud.b bVar : f.f54400a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    i8.d.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            i8.d.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        if (obj == f54392b) {
            return true;
        }
        return false;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(cd.h hVar, Object obj) {
        if (obj != f54394f) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                c2[] c2VarArr = yVar.f54427b;
                int length = c2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                c2 c2Var = c2VarArr[length];
                kotlin.jvm.internal.i.b(null);
                Object obj2 = yVar.f54426a[length];
                throw null;
            }
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.i.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a1.g.y(fold);
            throw null;
        }
    }

    public static final void g(Object obj, cd.c cVar) {
        Object vVar;
        h2 h2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            a0 a0Var = hVar.d;
            ed.c cVar2 = hVar.e;
            Throwable a2 = ad.g.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new td.v(a2, false);
            }
            cVar2.getContext();
            if (a0Var.d()) {
                hVar.f54403f = vVar;
                hVar.f48637c = 1;
                a0Var.c(cVar2.getContext(), hVar);
                return;
            }
            w0 a10 = d2.a();
            if (a10.f48675c >= 4294967296L) {
                hVar.f54403f = vVar;
                hVar.f48637c = 1;
                bd.g gVar = a10.e;
                if (gVar == null) {
                    gVar = new bd.g();
                    a10.e = gVar;
                }
                gVar.addLast(hVar);
                return;
            }
            a10.h(true);
            try {
                f1 f1Var = (f1) cVar2.getContext().get(b0.f48601b);
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationException = f1Var.getCancellationException();
                    hVar.b(vVar, cancellationException);
                    hVar.resumeWith(l9.b.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    cd.h context = cVar2.getContext();
                    Object k10 = k(context, obj2);
                    if (k10 != f54394f) {
                        h2Var = e0.v(cVar2, context, k10);
                    } else {
                        h2Var = null;
                    }
                    cVar2.resumeWith(obj);
                    if (h2Var == null || h2Var.M()) {
                        f(context, k10);
                    }
                }
                do {
                } while (a10.j());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        cVar.resumeWith(obj);
    }

    public static final long i(java.lang.String r22, long r23, long r25, long r27) {
        throw new UnsupportedOperationException("Method not decompiled: yd.a.i(java.lang.String, long, long, long):long");
    }

    public static int j(int i10, int i11, String str) {
        int i12;
        if ((i11 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = 2097150;
        }
        return (int) i(str, i10, 1, i12);
    }

    public static final Object k(cd.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.f54422c);
            kotlin.jvm.internal.i.b(obj);
        }
        if (obj == 0) {
            return f54394f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.e);
        }
        a1.g.y(obj);
        throw null;
    }
}
