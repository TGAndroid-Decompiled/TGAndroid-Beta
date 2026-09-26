package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f37185a;
    public int f37186b;
    public long f37187c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f37185a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f49465c;
        s6Var.f37598a += j3;
        this.f37187c += j3;
        this.f37186b++;
        s6Var.f37599b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f37599b.remove(aVar)) {
            long j3 = s6Var.f37598a;
            long j10 = aVar.f49465c;
            s6Var.f37598a = j3 - j10;
            this.f37187c -= j10;
            this.f37186b--;
        }
    }
}
