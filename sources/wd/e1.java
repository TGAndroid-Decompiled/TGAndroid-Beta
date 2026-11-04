package wd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class e1 extends be.j implements l0, x0 {
    public n1 d;

    @Override
    public final o1 b() {
        return null;
    }

    @Override
    public final void dispose() {
        n1 h = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.f57519a;
            Object obj = atomicReferenceFieldUpdater.get(h);
            if (obj instanceof e1) {
                if (obj == this) {
                    n0 n0Var = b0.f57470j;
                    while (!atomicReferenceFieldUpdater.compareAndSet(h, obj, n0Var)) {
                        if (atomicReferenceFieldUpdater.get(h) != obj) {
                            break;
                        }
                    }
                    return;
                }
                return;
            } else if (!(obj instanceof x0) || ((x0) obj).b() == null) {
                return;
            } else {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = be.j.f3269a;
                    Object obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (!(obj2 instanceof be.o)) {
                        if (obj2 == this) {
                            be.j jVar = (be.j) obj2;
                            return;
                        }
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        be.j jVar2 = (be.j) obj2;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = be.j.f3271c;
                        be.o oVar = (be.o) atomicReferenceFieldUpdater3.get(jVar2);
                        if (oVar == null) {
                            oVar = new be.o(jVar2);
                            atomicReferenceFieldUpdater3.set(jVar2, oVar);
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                break;
                            }
                        }
                        jVar2.d();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public a1 getParent() {
        return h();
    }

    public final n1 h() {
        n1 n1Var = this.d;
        if (n1Var != null) {
            return n1Var;
        }
        kotlin.jvm.internal.j.h("job");
        throw null;
    }

    public abstract boolean i();

    @Override
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th2);

    @Override
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.j(this) + "[job@" + b0.j(h()) + ']';
    }
}
