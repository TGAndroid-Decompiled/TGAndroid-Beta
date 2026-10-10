package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f41325a;
    public int f41326b;
    public long f41327c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f41325a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f54740c;
        s6Var.f41631a += j3;
        this.f41327c += j3;
        this.f41326b++;
        s6Var.f41632b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f41632b.remove(aVar)) {
            long j3 = s6Var.f41631a;
            long j10 = aVar.f54740c;
            s6Var.f41631a = j3 - j10;
            this.f41327c -= j10;
            this.f41326b--;
        }
    }
}
