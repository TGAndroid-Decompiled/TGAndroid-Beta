package td;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class k1 extends yd.k implements d1, o0, a1 {
    public u1 d;

    @Override
    public final v1 c() {
        return null;
    }

    @Override
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1 i10 = i();
        while (true) {
            Object u10 = i10.u();
            if (u10 instanceof k1) {
                if (u10 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u1.f48668a;
                    q0 q0Var = e0.f48618j;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(i10, u10, q0Var)) {
                        if (atomicReferenceFieldUpdater2.get(i10) != u10) {
                            break;
                        }
                    }
                    return;
                }
                return;
            } else if (!(u10 instanceof a1) || ((a1) u10).c() == null) {
                return;
            } else {
                while (true) {
                    Object f7 = f();
                    if (!(f7 instanceof yd.q)) {
                        if (f7 == this) {
                            yd.k kVar = (yd.k) f7;
                            return;
                        }
                        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        yd.k kVar2 = (yd.k) f7;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = yd.k.f54409c;
                        yd.q qVar = (yd.q) atomicReferenceFieldUpdater3.get(kVar2);
                        if (qVar == null) {
                            qVar = new yd.q(kVar2);
                            atomicReferenceFieldUpdater3.set(kVar2, qVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = yd.k.f54407a;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, f7, qVar)) {
                                kVar2.d();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == f7);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public f1 getParent() {
        return i();
    }

    public final u1 i() {
        u1 u1Var = this.d;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.i.h("job");
        throw null;
    }

    @Override
    public final boolean isActive() {
        return true;
    }

    @Override
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this) + "[job@" + e0.k(i()) + ']';
    }
}
