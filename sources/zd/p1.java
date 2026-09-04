package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class p1 extends ee.b {
    public final k1 f51583b;
    public v1 f51584c;
    public final u1 d;
    public final a1 f51585e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.f51585e = a1Var;
        this.f51583b = k1Var;
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
        k1 k1Var = this.f51583b;
        if (z10) {
            a1Var = k1Var;
        } else {
            a1Var = this.f51584c;
        }
        if (a1Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.k.f9079a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, a1Var)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                v1 v1Var = this.f51584c;
                kotlin.jvm.internal.i.b(v1Var);
                k1Var.e(v1Var);
            }
        }
    }

    @Override
    public final d9.f c(Object obj) {
        ee.k kVar = (ee.k) obj;
        if (this.d.u() == this.f51585e) {
            return null;
        }
        return ee.a.f9063e;
    }
}
