package org.telegram.ui;

import android.util.SparseArray;
public final class u6 {
    public long f41727a;
    public int f41728b;
    public long f41729c;
    public final SparseArray d = new SparseArray();

    public u6(long j10) {
        this.f41727a = j10;
    }

    public final void a(nh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        v6 v6Var = (v6) sparseArray.get(i10, null);
        if (v6Var == null) {
            v6Var = new v6();
            sparseArray.put(i10, v6Var);
        }
        long j10 = aVar.f16247c;
        v6Var.f42014a += j10;
        this.f41729c += j10;
        this.f41728b++;
        v6Var.f42015b.add(aVar);
    }

    public final void b(nh.a aVar) {
        v6 v6Var = (v6) this.d.get(aVar.d, null);
        if (v6Var != null && v6Var.f42015b.remove(aVar)) {
            long j10 = v6Var.f42014a;
            long j11 = aVar.f16247c;
            v6Var.f42014a = j10 - j11;
            this.f41729c -= j11;
            this.f41728b--;
        }
    }
}
