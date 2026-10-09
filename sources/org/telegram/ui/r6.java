package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f41279a;
    public int f41280b;
    public long f41281c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f41279a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f54694c;
        s6Var.f41585a += j3;
        this.f41281c += j3;
        this.f41280b++;
        s6Var.f41586b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f41586b.remove(aVar)) {
            long j3 = s6Var.f41585a;
            long j10 = aVar.f54694c;
            s6Var.f41585a = j3 - j10;
            this.f41281c -= j10;
            this.f41280b--;
        }
    }
}
