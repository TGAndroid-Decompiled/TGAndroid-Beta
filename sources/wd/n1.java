package wd;

import b8.cc;
import b8.gb;
import b8.jc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class n1 implements a1, r, r1 {
    public static final AtomicReferenceFieldUpdater f57519a = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater f57520b = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public n1(boolean z10) {
        n0 n0Var;
        if (z10) {
            n0Var = b0.f57470j;
        } else {
            n0Var = b0.f57469i;
        }
        this._state$volatile = n0Var;
    }

    public static q F(be.j jVar) {
        while (jVar.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.j.f3270b;
            be.j d = jVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (be.j) obj;
                    if (!jVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = d;
            }
        }
        while (true) {
            jVar = jVar.f();
            if (!jVar.g()) {
                if (jVar instanceof q) {
                    return (q) jVar;
                }
                if (jVar instanceof o1) {
                    return null;
                }
            }
        }
    }

    public static String M(Object obj) {
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            if (h1Var.d()) {
                return "Cancelling";
            }
            if (h1.f57496b.get(h1Var) == 0) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof x0) {
            if (((x0) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof v) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public static CancellationException N(n1 n1Var, Throwable th2) {
        CancellationException cancellationException;
        n1Var.getClass();
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            return new b1(n1Var.m(), th2, n1Var);
        }
        return cancellationException;
    }

    public final boolean A() {
        return !(f57519a.get(this) instanceof x0);
    }

    public boolean B() {
        return this instanceof h;
    }

    public final boolean C(Object obj) {
        Object O;
        do {
            O = O(f57519a.get(this), obj);
            if (O == b0.d) {
                return false;
            }
            if (O == b0.f57466e) {
                return true;
            }
        } while (O == b0.f57467f);
        g(O);
        return true;
    }

    public final Object D(Object obj) {
        Object O;
        v vVar;
        do {
            O = O(f57519a.get(this), obj);
            if (O == b0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof v) {
                    vVar = (v) obj;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    th2 = vVar.f57540a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (O == b0.f57467f);
        return O;
    }

    public String E() {
        return getClass().getSimpleName();
    }

    public final void G(o1 o1Var, Throwable th2) {
        o1Var.c(new be.h(4), 4);
        Object obj = be.j.f3269a.get(o1Var);
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        be.j jVar = (be.j) obj;
        ?? r12 = 0;
        while (!jVar.equals(o1Var)) {
            if ((jVar instanceof e1) && ((e1) jVar).i()) {
                try {
                    ((e1) jVar).j(th2);
                } catch (Throwable th3) {
                    if (r12 != 0) {
                        gb.a(r12, th3);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + jVar + " for " + ((Object) this), th3);
                    }
                }
            }
            jVar = jVar.f();
            r12 = r12;
        }
        if (r12 != 0) {
            x(r12);
        }
        l(th2);
    }

    public final void J(n0 n0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? jVar = new be.j();
        w0 w0Var = jVar;
        if (!n0Var.f57518a) {
            w0Var = new w0(jVar);
        }
        do {
            atomicReferenceFieldUpdater = f57519a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n0Var, w0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n0Var);
    }

    public final void K(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        be.j jVar = new be.j();
        e1Var.getClass();
        be.j.f3270b.set(jVar, e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = be.j.f3269a;
        atomicReferenceFieldUpdater2.set(jVar, e1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(e1Var) == e1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(e1Var, e1Var, jVar)) {
                    if (atomicReferenceFieldUpdater2.get(e1Var) != e1Var) {
                        break;
                    }
                }
                jVar.e(e1Var);
                break loop0;
            }
            break;
        }
        be.j f10 = e1Var.f();
        do {
            atomicReferenceFieldUpdater = f57519a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, e1Var, f10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == e1Var);
    }

    public final int L(Object obj) {
        boolean z10 = obj instanceof n0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57519a;
        if (z10) {
            if (!((n0) obj).f57518a) {
                n0 n0Var = b0.f57470j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                return 1;
            }
            return 0;
        } else if (obj instanceof w0) {
            o1 o1Var = ((w0) obj).f57545a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final Object O(Object obj, Object obj2) {
        y0 y0Var;
        h1 h1Var;
        boolean z10;
        v vVar;
        if (!(obj instanceof x0)) {
            return b0.d;
        }
        if (((obj instanceof n0) || (obj instanceof e1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            x0 x0Var = (x0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57519a;
            if (obj2 instanceof x0) {
                y0Var = new y0((x0) obj2);
            } else {
                y0Var = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, x0Var, y0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                    return b0.f57467f;
                }
            }
            H(obj2);
            o(x0Var, obj2);
            return obj2;
        }
        x0 x0Var2 = (x0) obj;
        o1 v = v(x0Var2);
        if (v == null) {
            return b0.f57467f;
        }
        Throwable th2 = null;
        if (x0Var2 instanceof h1) {
            h1Var = (h1) x0Var2;
        } else {
            h1Var = null;
        }
        if (h1Var == null) {
            h1Var = new h1(v, null);
        }
        synchronized (h1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h1.f57496b;
            if (atomicIntegerFieldUpdater.get(h1Var) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return b0.d;
            }
            atomicIntegerFieldUpdater.set(h1Var, 1);
            if (h1Var != x0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f57519a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, x0Var2, h1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != x0Var2) {
                        return b0.f57467f;
                    }
                }
            }
            boolean d = h1Var.d();
            if (obj2 instanceof v) {
                vVar = (v) obj2;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                h1Var.a(vVar.f57540a);
            }
            Throwable c2 = h1Var.c();
            if (!d) {
                th2 = c2;
            }
            if (th2 != null) {
                G(v, th2);
            }
            q F = F(v);
            if (F != null && P(h1Var, F, obj2)) {
                return b0.f57466e;
            }
            v.c(new be.h(2), 2);
            q F2 = F(v);
            if (F2 != null && P(h1Var, F2, obj2)) {
                return b0.f57466e;
            }
            return q(h1Var, obj2);
        }
    }

    public final boolean P(h1 h1Var, q qVar, Object obj) {
        while (b0.n(qVar.f57526e, false, new g1(this, h1Var, qVar, obj)) == p1.f57525a) {
            qVar = F(qVar);
            if (qVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final p attachChild(r rVar) {
        v vVar;
        v vVar2;
        q qVar = new q(rVar);
        qVar.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57519a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (n0Var.f57518a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                J(n0Var);
            } else {
                boolean z10 = obj instanceof x0;
                p1 p1Var = p1.f57525a;
                Throwable th2 = null;
                if (z10) {
                    o1 b10 = ((x0) obj).b();
                    if (b10 == null) {
                        K((e1) obj);
                    } else if (!b10.c(qVar, 7)) {
                        boolean c2 = b10.c(qVar, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof h1) {
                            th2 = ((h1) obj2).c();
                        } else {
                            if (obj2 instanceof v) {
                                vVar2 = (v) obj2;
                            } else {
                                vVar2 = null;
                            }
                            if (vVar2 != null) {
                                th2 = vVar2.f57540a;
                            }
                        }
                        qVar.j(th2);
                        if (c2) {
                            break loop0;
                        }
                        return p1Var;
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof v) {
                        vVar = (v) obj3;
                    } else {
                        vVar = null;
                    }
                    if (vVar != null) {
                        th2 = vVar.f57540a;
                    }
                    qVar.j(th2);
                    return p1Var;
                }
            }
        }
        return qVar;
    }

    @Override
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new b1(m(), null, this);
        }
        k(cancellationException);
    }

    @Override
    public final Object fold(Object obj, od.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override
    public final fd.f get(fd.g gVar) {
        return cc.a(this, gVar);
    }

    @Override
    public final CancellationException getCancellationException() {
        Object obj = f57519a.get(this);
        CancellationException cancellationException = null;
        if (obj instanceof h1) {
            Throwable c2 = ((h1) obj).c();
            if (c2 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c2 instanceof CancellationException) {
                    cancellationException = (CancellationException) c2;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = m();
                    }
                    return new b1(concat, c2, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(obj instanceof x0)) {
            if (obj instanceof v) {
                return N(this, ((v) obj).f57540a);
            }
            return new b1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override
    public final td.b getChildren() {
        return new td.e(new j1(null, this), 0);
    }

    public Object getCompleted() {
        return r();
    }

    public final Throwable getCompletionExceptionOrNull() {
        v vVar;
        Object obj = f57519a.get(this);
        if (!(obj instanceof x0)) {
            if (obj instanceof v) {
                vVar = (v) obj;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                return null;
            }
            return vVar.f57540a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override
    public final fd.g getKey() {
        return y.f57551b;
    }

    public void h(Object obj) {
        g(obj);
    }

    public final Object i(fd.c cVar) {
        Object obj;
        do {
            obj = f57519a.get(this);
            if (!(obj instanceof x0)) {
                if (!(obj instanceof v)) {
                    return b0.w(obj);
                }
                throw ((v) obj).f57540a;
            }
        } while (L(obj) < 0);
        f1 f1Var = new f1(jc.b(cVar), this);
        f1Var.s();
        f1Var.v(new j(b0.n(this, true, new m0(f1Var, 3)), 2));
        Object r5 = f1Var.r();
        gd.a aVar = gd.a.f12241a;
        return r5;
    }

    @Override
    public final l0 invokeOnCompletion(od.l lVar) {
        return z(true, new m0(lVar, 1));
    }

    @Override
    public boolean isActive() {
        Object obj = f57519a.get(this);
        if ((obj instanceof x0) && ((x0) obj).isActive()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isCancelled() {
        Object obj = f57519a.get(this);
        if (!(obj instanceof v)) {
            if (!(obj instanceof h1) || !((h1) obj).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean j(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: wd.n1.j(java.lang.Object):boolean");
    }

    @Override
    public final Object join(fd.c cVar) {
        Object obj;
        dd.k kVar;
        do {
            obj = f57519a.get(this);
            boolean z10 = obj instanceof x0;
            kVar = dd.k.f8801a;
            if (!z10) {
                b0.g(cVar.getContext());
                return kVar;
            }
        } while (L(obj) < 0);
        m mVar = new m(1, jc.b(cVar));
        mVar.s();
        mVar.v(new j(b0.n(this, true, new o(mVar, 1)), 2));
        Object r5 = mVar.r();
        gd.a aVar = gd.a.f12241a;
        if (r5 != aVar) {
            r5 = kVar;
        }
        if (r5 == aVar) {
            return r5;
        }
        return kVar;
    }

    public void k(CancellationException cancellationException) {
        j(cancellationException);
    }

    public final boolean l(Throwable th2) {
        if (!B()) {
            boolean z10 = th2 instanceof CancellationException;
            p pVar = (p) f57520b.get(this);
            if (pVar != null && pVar != p1.f57525a) {
                if (!pVar.a(th2) && !z10) {
                    return false;
                }
                return true;
            }
            return z10;
        }
        return true;
    }

    public String m() {
        return "Job was cancelled";
    }

    @Override
    public final fd.h minusKey(fd.g gVar) {
        return cc.b(this, gVar);
    }

    public boolean n(Throwable th2) {
        if (!(th2 instanceof CancellationException)) {
            if (j(th2) && t()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void o(x0 x0Var, Object obj) {
        v vVar;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57520b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, p1.f57525a);
        }
        ?? r12 = 0;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th2 = vVar.f57540a;
        } else {
            th2 = null;
        }
        if (x0Var instanceof e1) {
            try {
                ((e1) x0Var).j(th2);
                return;
            } catch (Throwable th3) {
                x(new RuntimeException("Exception in completion handler " + x0Var + " for " + ((Object) this), th3));
                return;
            }
        }
        o1 b10 = x0Var.b();
        if (b10 != null) {
            b10.c(new be.h(1), 1);
            Object obj2 = be.j.f3269a.get(b10);
            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            be.j jVar = (be.j) obj2;
            while (!jVar.equals(b10)) {
                if (jVar instanceof e1) {
                    try {
                        ((e1) jVar).j(th2);
                    } catch (Throwable th4) {
                        if (r12 != 0) {
                            gb.a(r12, th4);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + jVar + " for " + ((Object) this), th4);
                        }
                    }
                }
                jVar = jVar.f();
                r12 = r12;
            }
            if (r12 != 0) {
                x(r12);
            }
        }
    }

    public final Throwable p(Object obj) {
        Throwable th2;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        n1 n1Var = (n1) ((r1) obj);
        Object obj2 = f57519a.get(n1Var);
        CancellationException cancellationException = null;
        if (obj2 instanceof h1) {
            th2 = ((h1) obj2).c();
        } else if (obj2 instanceof v) {
            th2 = ((v) obj2).f57540a;
        } else if (!(obj2 instanceof x0)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new b1("Parent job is ".concat(M(obj2)), th2, n1Var);
        }
        return cancellationException;
    }

    @Override
    public final fd.h plus(fd.h hVar) {
        return cc.c(this, hVar);
    }

    public final Object q(h1 h1Var, Object obj) {
        v vVar;
        Throwable s6;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            th2 = vVar.f57540a;
        }
        synchronized (h1Var) {
            h1Var.d();
            ArrayList e10 = h1Var.e(th2);
            s6 = s(h1Var, e10);
            if (s6 != null && e10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e10.size()));
                int size = e10.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = e10.get(i3);
                    i3++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != s6 && th3 != s6 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        gb.a(s6, th3);
                    }
                }
            }
        }
        if (s6 != null && s6 != th2) {
            obj = new v(s6, false);
        }
        if (s6 != null && (l(s6) || w(s6))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.f57539b.compareAndSet((v) obj, 0, 1);
        }
        H(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57519a;
        if (obj instanceof x0) {
            obj2 = new y0((x0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, h1Var, obj2) && atomicReferenceFieldUpdater.get(this) == h1Var) {
        }
        o(h1Var, obj);
        return obj;
    }

    public final Object r() {
        Object obj = f57519a.get(this);
        if (!(obj instanceof x0)) {
            if (!(obj instanceof v)) {
                return b0.w(obj);
            }
            throw ((v) obj).f57540a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public final Throwable s(h1 h1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!h1Var.d()) {
                return null;
            }
            return new b1(m(), null, this);
        }
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = arrayList.get(i10);
                i10++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof x1) {
            int size2 = arrayList.size();
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i3);
                i3++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof x1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override
    public final boolean start() {
        int L;
        do {
            L = L(f57519a.get(this));
            if (L == 0) {
                return false;
            }
        } while (L != 1);
        return true;
    }

    public boolean t() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(E() + '{' + M(f57519a.get(this)) + '}');
        sb2.append('@');
        sb2.append(b0.j(this));
        return sb2.toString();
    }

    public boolean u() {
        return this instanceof t;
    }

    public final o1 v(x0 x0Var) {
        o1 b10 = x0Var.b();
        if (b10 == null) {
            if (x0Var instanceof n0) {
                return new be.j();
            }
            if (x0Var instanceof e1) {
                K((e1) x0Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + x0Var).toString());
        }
        return b10;
    }

    public boolean w(Throwable th2) {
        return false;
    }

    public final void y(a1 a1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57520b;
        p1 p1Var = p1.f57525a;
        if (a1Var == null) {
            atomicReferenceFieldUpdater.set(this, p1Var);
            return;
        }
        a1Var.start();
        p attachChild = a1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (A()) {
            attachChild.dispose();
            atomicReferenceFieldUpdater.set(this, p1Var);
        }
    }

    public final l0 z(boolean z10, e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p1 p1Var;
        boolean z11;
        Throwable th2;
        v vVar;
        boolean c2;
        h1 h1Var;
        Throwable th3;
        e1Var.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f57519a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof n0;
            p1Var = p1.f57525a;
            z11 = true;
            th2 = null;
            if (z12) {
                n0 n0Var = (n0) obj;
                if (n0Var.f57518a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                J(n0Var);
            } else if (obj instanceof x0) {
                x0 x0Var = (x0) obj;
                o1 b10 = x0Var.b();
                if (b10 == null) {
                    K((e1) obj);
                } else {
                    if (e1Var.i()) {
                        if (x0Var instanceof h1) {
                            h1Var = (h1) x0Var;
                        } else {
                            h1Var = null;
                        }
                        if (h1Var != null) {
                            th3 = h1Var.c();
                        } else {
                            th3 = null;
                        }
                        if (th3 == null) {
                            c2 = b10.c(e1Var, 5);
                        } else if (z10) {
                            e1Var.j(th3);
                            return p1Var;
                        }
                    } else {
                        c2 = b10.c(e1Var, 1);
                    }
                    if (c2) {
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (z11) {
            return e1Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof v) {
                vVar = (v) obj2;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                th2 = vVar.f57540a;
            }
            e1Var.j(th2);
        }
        return p1Var;
    }

    @Override
    public final l0 invokeOnCompletion(boolean z10, boolean z11, od.l lVar) {
        e1 m0Var;
        if (z10) {
            m0Var = new z0(lVar);
        } else {
            m0Var = new m0(lVar, 1);
        }
        return z(z11, m0Var);
    }

    public void I() {
    }

    public void H(Object obj) {
    }

    public void g(Object obj) {
    }

    public void x(androidx.car.app.j jVar) {
        throw jVar;
    }
}
