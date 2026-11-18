package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f51511a;
    public int f51512b;
    public long f51513c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f51511a = j3;
    }

    public final void a(ei.b bVar, int i7) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i7, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i7, s6Var);
        }
        long j3 = bVar.f10968c;
        s6Var.f51913a += j3;
        this.f51513c += j3;
        this.f51512b++;
        s6Var.f51914b.add(bVar);
    }

    public final void b(ei.b bVar) {
        s6 s6Var = (s6) this.d.get(bVar.d, null);
        if (s6Var != null && s6Var.f51914b.remove(bVar)) {
            long j3 = s6Var.f51913a;
            long j10 = bVar.f10968c;
            s6Var.f51913a = j3 - j10;
            this.f51513c -= j10;
            this.f51512b--;
        }
    }
}
