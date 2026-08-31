package qd;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k7.o7;
import k7.q7;
import ld.a0;
import ld.b0;
import ld.b2;
import ld.c2;
import ld.e0;
import ld.f1;
import ld.g2;
import ld.w0;
public abstract class a {
    public static final com.google.android.gms.internal.clearcut.e f44788a = new com.google.android.gms.internal.clearcut.e("NO_DECISION", 2);
    public static final com.google.android.gms.internal.clearcut.e f44789b = new com.google.android.gms.internal.clearcut.e("CLOSED", 2);
    public static final com.google.android.gms.internal.clearcut.e f44790c = new com.google.android.gms.internal.clearcut.e("UNDEFINED", 2);
    public static final com.google.android.gms.internal.clearcut.e d = new com.google.android.gms.internal.clearcut.e("REUSABLE_CLAIMED", 2);
    public static final com.google.android.gms.internal.clearcut.e f44791e = new com.google.android.gms.internal.clearcut.e("CONDITION_FALSE", 2);
    public static final com.google.android.gms.internal.clearcut.e f44792f = new com.google.android.gms.internal.clearcut.e("NO_THREAD_ELEMENTS", 2);

    public static final Object a(t tVar, long j10, dd.p pVar) {
        while (true) {
            if (tVar.f44820c >= j10 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f44795a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            com.google.android.gms.internal.clearcut.e eVar = f44789b;
            if (obj == eVar) {
                return eVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f44820c + 1), tVar);
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
        if (obj != f44789b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(Throwable th2, uc.h hVar) {
        Throwable runtimeException;
        for (md.b bVar : f.f44798a) {
            try {
                bVar.c(th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    o7.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            o7.a(th2, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static final boolean d(Object obj) {
        if (obj == f44789b) {
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

    public static final void f(uc.h hVar, Object obj) {
        if (obj != f44792f) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                b2[] b2VarArr = yVar.f44829b;
                int length = b2VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                b2 b2Var = b2VarArr[length];
                kotlin.jvm.internal.j.b(null);
                Object obj2 = yVar.f44828a[length];
                throw null;
            }
            Object fold = hVar.fold(null, w.d);
            kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            android.support.v4.media.a.v(fold);
            throw null;
        }
    }

    public static final void g(Object obj, uc.c cVar) {
        Object vVar;
        g2 g2Var;
        if (cVar instanceof h) {
            h hVar = (h) cVar;
            a0 a0Var = hVar.d;
            wc.c cVar2 = hVar.f44801e;
            Throwable a2 = sc.f.a(obj);
            if (a2 == null) {
                vVar = obj;
            } else {
                vVar = new ld.v(a2, false);
            }
            cVar2.getContext();
            if (a0Var.e()) {
                hVar.f44802f = vVar;
                hVar.f12326c = 1;
                a0Var.c(cVar2.getContext(), hVar);
                return;
            }
            w0 a10 = c2.a();
            if (a10.f12372c >= 4294967296L) {
                hVar.f44802f = vVar;
                hVar.f12326c = 1;
                tc.e eVar = a10.f12373e;
                if (eVar == null) {
                    eVar = new tc.e();
                    a10.f12373e = eVar;
                }
                eVar.addLast(hVar);
                return;
            }
            a10.h(true);
            try {
                f1 f1Var = (f1) cVar2.getContext().get(b0.f12283b);
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationException = f1Var.getCancellationException();
                    hVar.c(vVar, cancellationException);
                    hVar.resumeWith(q7.a(cancellationException));
                } else {
                    Object obj2 = hVar.h;
                    uc.h context = cVar2.getContext();
                    Object k10 = k(context, obj2);
                    if (k10 != f44792f) {
                        g2Var = e0.v(cVar2, context, k10);
                    } else {
                        g2Var = null;
                    }
                    cVar2.resumeWith(obj);
                    if (g2Var == null || g2Var.M()) {
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

    public static final long i(java.lang.String r21, long r22, long r24, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: qd.a.i(java.lang.String, long, long, long):long");
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

    public static final Object k(uc.h hVar, Object obj) {
        if (obj == null) {
            obj = hVar.fold(0, w.f44823c);
            kotlin.jvm.internal.j.b(obj);
        }
        if (obj == 0) {
            return f44792f;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), w.f44824e);
        }
        android.support.v4.media.a.v(obj);
        throw null;
    }
}
