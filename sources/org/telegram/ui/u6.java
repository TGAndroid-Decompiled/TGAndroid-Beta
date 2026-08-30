package org.telegram.ui;

import android.util.SparseArray;
public final class u6 {
    public long f38849a;
    public int f38850b;
    public long f38851c;
    public final SparseArray d = new SparseArray();

    public u6(long j10) {
        this.f38849a = j10;
    }

    public final void a(mh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        v6 v6Var = (v6) sparseArray.get(i10, null);
        if (v6Var == null) {
            v6Var = new v6();
            sparseArray.put(i10, v6Var);
        }
        long j10 = aVar.f14171c;
        v6Var.f39085a += j10;
        this.f38851c += j10;
        this.f38850b++;
        v6Var.f39086b.add(aVar);
    }

    public final void b(mh.a aVar) {
        v6 v6Var = (v6) this.d.get(aVar.d, null);
        if (v6Var != null && v6Var.f39086b.remove(aVar)) {
            long j10 = v6Var.f39085a;
            long j11 = aVar.f14171c;
            v6Var.f39085a = j10 - j11;
            this.f38851c -= j11;
            this.f38850b--;
        }
    }
}
