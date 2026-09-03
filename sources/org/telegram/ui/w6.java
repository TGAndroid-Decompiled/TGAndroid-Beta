package org.telegram.ui;

import android.util.SparseArray;
public final class w6 {
    public long f39277a;
    public int f39278b;
    public long f39279c;
    public final SparseArray d = new SparseArray();

    public w6(long j10) {
        this.f39277a = j10;
    }

    public final void a(mh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        x6 x6Var = (x6) sparseArray.get(i10, null);
        if (x6Var == null) {
            x6Var = new x6();
            sparseArray.put(i10, x6Var);
        }
        long j10 = aVar.f14159c;
        x6Var.f39846a += j10;
        this.f39279c += j10;
        this.f39278b++;
        x6Var.f39847b.add(aVar);
    }

    public final void b(mh.a aVar) {
        x6 x6Var = (x6) this.d.get(aVar.d, null);
        if (x6Var != null && x6Var.f39847b.remove(aVar)) {
            long j10 = x6Var.f39846a;
            long j11 = aVar.f14159c;
            x6Var.f39846a = j10 - j11;
            this.f39279c -= j11;
            this.f39278b--;
        }
    }
}
