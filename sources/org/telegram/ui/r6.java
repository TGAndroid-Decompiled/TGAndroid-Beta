package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f41281a;
    public int f41282b;
    public long f41283c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f41281a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f54696c;
        s6Var.f41587a += j3;
        this.f41283c += j3;
        this.f41282b++;
        s6Var.f41588b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f41588b.remove(aVar)) {
            long j3 = s6Var.f41587a;
            long j10 = aVar.f54696c;
            s6Var.f41587a = j3 - j10;
            this.f41283c -= j10;
            this.f41282b--;
        }
    }
}
