package org.telegram.ui;

import android.util.SparseArray;
public final class s6 {
    public long f41231a;
    public int f41232b;
    public long f41233c;
    public final SparseArray d = new SparseArray();

    public s6(long j10) {
        this.f41231a = j10;
    }

    public final void a(sh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i10, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i10, t6Var);
        }
        long j10 = aVar.f48505c;
        t6Var.f41549a += j10;
        this.f41233c += j10;
        this.f41232b++;
        t6Var.f41550b.add(aVar);
    }

    public final void b(sh.a aVar) {
        t6 t6Var = (t6) this.d.get(aVar.d, null);
        if (t6Var != null && t6Var.f41550b.remove(aVar)) {
            long j10 = t6Var.f41549a;
            long j11 = aVar.f48505c;
            t6Var.f41549a = j10 - j11;
            this.f41233c -= j11;
            this.f41232b--;
        }
    }
}
