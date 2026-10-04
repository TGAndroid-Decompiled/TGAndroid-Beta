package org.telegram.ui;

import android.util.SparseArray;
public final class u6 {
    public long f41066a;
    public int f41067b;
    public long f41068c;
    public final SparseArray d = new SparseArray();

    public u6(long j3) {
        this.f41066a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        v6 v6Var = (v6) sparseArray.get(i10, null);
        if (v6Var == null) {
            v6Var = new v6();
            sparseArray.put(i10, v6Var);
        }
        long j3 = aVar.f53553c;
        v6Var.f41565a += j3;
        this.f41068c += j3;
        this.f41067b++;
        v6Var.f41566b.add(aVar);
    }

    public final void b(zh.a aVar) {
        v6 v6Var = (v6) this.d.get(aVar.d, null);
        if (v6Var != null && v6Var.f41566b.remove(aVar)) {
            long j3 = v6Var.f41565a;
            long j10 = aVar.f53553c;
            v6Var.f41565a = j3 - j10;
            this.f41068c -= j10;
            this.f41067b--;
        }
    }
}
