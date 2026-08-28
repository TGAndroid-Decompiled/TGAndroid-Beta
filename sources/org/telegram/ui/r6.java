package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f42274a;
    public int f42275b;
    public long f42276c;
    public final SparseArray d = new SparseArray();

    public r6(long j10) {
        this.f42274a = j10;
    }

    public final void a(hh.a aVar, int i9) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i9, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i9, s6Var);
        }
        long j10 = aVar.f10782c;
        s6Var.f42566a += j10;
        this.f42276c += j10;
        this.f42275b++;
        s6Var.f42567b.add(aVar);
    }

    public final void b(hh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f42567b.remove(aVar)) {
            long j10 = s6Var.f42566a;
            long j11 = aVar.f10782c;
            s6Var.f42566a = j10 - j11;
            this.f42276c -= j11;
            this.f42275b--;
        }
    }
}
