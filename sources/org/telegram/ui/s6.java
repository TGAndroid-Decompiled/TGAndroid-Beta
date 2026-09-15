package org.telegram.ui;

import android.util.SparseArray;
public final class s6 {
    public long f37257a;
    public int f37258b;
    public long f37259c;
    public final SparseArray d = new SparseArray();

    public s6(long j3) {
        this.f37257a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i10, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i10, t6Var);
        }
        long j3 = aVar.f49196c;
        t6Var.f37563a += j3;
        this.f37259c += j3;
        this.f37258b++;
        t6Var.f37564b.add(aVar);
    }

    public final void b(zh.a aVar) {
        t6 t6Var = (t6) this.d.get(aVar.d, null);
        if (t6Var != null && t6Var.f37564b.remove(aVar)) {
            long j3 = t6Var.f37563a;
            long j10 = aVar.f49196c;
            t6Var.f37563a = j3 - j10;
            this.f37259c -= j10;
            this.f37258b--;
        }
    }
}
