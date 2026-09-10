package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class p1 extends ee.b {
    public final k1 f48037b;
    public v1 f48038c;
    public final u1 d;
    public final a1 e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.e = a1Var;
        this.f48037b = k1Var;
    }

    @Override
    public final void b(Object obj, Object obj2) {
        boolean z10;
        a1 a1Var;
        ee.k kVar = (ee.k) obj;
        if (obj2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k1 k1Var = this.f48037b;
        if (z10) {
            a1Var = k1Var;
        } else {
            a1Var = this.f48038c;
        }
        if (a1Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.k.f7487a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, a1Var)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                v1 v1Var = this.f48038c;
                kotlin.jvm.internal.i.b(v1Var);
                k1Var.e(v1Var);
            }
        }
    }

    @Override
    public final ee.v c(Object obj) {
        ee.k kVar = (ee.k) obj;
        if (this.d.u() == this.e) {
            return null;
        }
        return ee.a.e;
    }
}
