package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class e1 extends ee.j implements l0, x0 {
    public n1 d;

    @Override
    public final o1 b() {
        return null;
    }

    @Override
    public final void dispose() {
        n1 h = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.f60099a;
            Object obj = atomicReferenceFieldUpdater.get(h);
            if (obj instanceof e1) {
                if (obj == this) {
                    n0 n0Var = b0.f60050j;
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
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ee.j.f10781a;
                    Object obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (!(obj2 instanceof ee.o)) {
                        if (obj2 == this) {
                            ee.j jVar = (ee.j) obj2;
                            return;
                        }
                        kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        ee.j jVar2 = (ee.j) obj2;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = ee.j.f10783c;
                        ee.o oVar = (ee.o) atomicReferenceFieldUpdater3.get(jVar2);
                        if (oVar == null) {
                            oVar = new ee.o(jVar2);
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
