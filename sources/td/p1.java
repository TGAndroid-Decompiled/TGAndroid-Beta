package td;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class p1 extends yd.b {
    public final k1 f48651b;
    public v1 f48652c;
    public final u1 d;
    public final a1 e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.e = a1Var;
        this.f48651b = k1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        boolean z10;
        yd.k kVar;
        yd.k kVar2 = (yd.k) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yd.k kVar3 = this.f48651b;
        if (z10) {
            kVar = kVar3;
        } else {
            kVar = this.f48652c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.k.f54407a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z10) {
                yd.k kVar4 = this.f48652c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar3.e(kVar4);
            }
        }
    }

    @Override
    public final ea.a c(Object obj) {
        yd.k kVar = (yd.k) obj;
        if (this.d.u() == this.e) {
            return null;
        }
        return yd.a.e;
    }
}
