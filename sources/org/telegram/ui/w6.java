package org.telegram.ui;

import android.util.SparseArray;
public final class w6 {
    public long f40870a;
    public int f40871b;
    public long f40872c;
    public final SparseArray d = new SparseArray();

    public w6(long j10) {
        this.f40870a = j10;
    }

    public final void a(ai.b bVar, int i10) {
        SparseArray sparseArray = this.d;
        x6 x6Var = (x6) sparseArray.get(i10, null);
        if (x6Var == null) {
            x6Var = new x6();
            sparseArray.put(i10, x6Var);
        }
        long j10 = bVar.f921c;
        x6Var.f41444a += j10;
        this.f40872c += j10;
        this.f40871b++;
        x6Var.f41445b.add(bVar);
    }

    public final void b(ai.b bVar) {
        x6 x6Var = (x6) this.d.get(bVar.d, null);
        if (x6Var != null && x6Var.f41445b.remove(bVar)) {
            long j10 = x6Var.f41444a;
            long j11 = bVar.f921c;
            x6Var.f41444a = j10 - j11;
            this.f40872c -= j11;
            this.f40871b--;
        }
    }
}
