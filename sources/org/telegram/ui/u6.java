package org.telegram.ui;

import android.util.SparseArray;
public final class u6 {
    public long f42373a;
    public int f42374b;
    public long f42375c;
    public final SparseArray d = new SparseArray();

    public u6(long j3) {
        this.f42373a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        v6 v6Var = (v6) sparseArray.get(i10, null);
        if (v6Var == null) {
            v6Var = new v6();
            sparseArray.put(i10, v6Var);
        }
        long j3 = aVar.f54928c;
        v6Var.f42690a += j3;
        this.f42375c += j3;
        this.f42374b++;
        v6Var.f42691b.add(aVar);
    }

    public final void b(zh.a aVar) {
        v6 v6Var = (v6) this.d.get(aVar.d, null);
        if (v6Var != null && v6Var.f42691b.remove(aVar)) {
            long j3 = v6Var.f42690a;
            long j10 = aVar.f54928c;
            v6Var.f42690a = j3 - j10;
            this.f42375c -= j10;
            this.f42374b--;
        }
    }
}
