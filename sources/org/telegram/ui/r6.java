package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f37187a;
    public int f37188b;
    public long f37189c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f37187a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f49467c;
        s6Var.f37600a += j3;
        this.f37189c += j3;
        this.f37188b++;
        s6Var.f37601b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f37601b.remove(aVar)) {
            long j3 = s6Var.f37600a;
            long j10 = aVar.f49467c;
            s6Var.f37600a = j3 - j10;
            this.f37189c -= j10;
            this.f37188b--;
        }
    }
}
