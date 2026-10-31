package org.telegram.ui;

import android.util.SparseArray;
public final class s6 {
    public long f41380a;
    public int f41381b;
    public long f41382c;
    public final SparseArray d = new SparseArray();

    public s6(long j10) {
        this.f41380a = j10;
    }

    public final void a(sh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i10, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i10, t6Var);
        }
        long j10 = aVar.f48494c;
        t6Var.f41741a += j10;
        this.f41382c += j10;
        this.f41381b++;
        t6Var.f41742b.add(aVar);
    }

    public final void b(sh.a aVar) {
        t6 t6Var = (t6) this.d.get(aVar.d, null);
        if (t6Var != null && t6Var.f41742b.remove(aVar)) {
            long j10 = t6Var.f41741a;
            long j11 = aVar.f48494c;
            t6Var.f41741a = j10 - j11;
            this.f41382c -= j11;
            this.f41381b--;
        }
    }
}
