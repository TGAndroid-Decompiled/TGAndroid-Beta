package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f37186a;
    public int f37187b;
    public long f37188c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f37186a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f49466c;
        s6Var.f37599a += j3;
        this.f37188c += j3;
        this.f37187b++;
        s6Var.f37600b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f37600b.remove(aVar)) {
            long j3 = s6Var.f37599a;
            long j10 = aVar.f49466c;
            s6Var.f37599a = j3 - j10;
            this.f37188c -= j10;
            this.f37187b--;
        }
    }
}
