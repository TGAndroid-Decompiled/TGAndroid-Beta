package org.telegram.ui;

import android.util.SparseArray;
public final class u6 {
    public long f41072a;
    public int f41073b;
    public long f41074c;
    public final SparseArray d = new SparseArray();

    public u6(long j3) {
        this.f41072a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        v6 v6Var = (v6) sparseArray.get(i10, null);
        if (v6Var == null) {
            v6Var = new v6();
            sparseArray.put(i10, v6Var);
        }
        long j3 = aVar.f53558c;
        v6Var.f41572a += j3;
        this.f41074c += j3;
        this.f41073b++;
        v6Var.f41573b.add(aVar);
    }

    public final void b(zh.a aVar) {
        v6 v6Var = (v6) this.d.get(aVar.d, null);
        if (v6Var != null && v6Var.f41573b.remove(aVar)) {
            long j3 = v6Var.f41572a;
            long j10 = aVar.f53558c;
            v6Var.f41572a = j3 - j10;
            this.f41074c -= j10;
            this.f41073b--;
        }
    }
}
