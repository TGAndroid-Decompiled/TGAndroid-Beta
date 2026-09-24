package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f37174a;
    public int f37175b;
    public long f37176c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f37174a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f49455c;
        s6Var.f37584a += j3;
        this.f37176c += j3;
        this.f37175b++;
        s6Var.f37585b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f37585b.remove(aVar)) {
            long j3 = s6Var.f37584a;
            long j10 = aVar.f49455c;
            s6Var.f37584a = j3 - j10;
            this.f37176c -= j10;
            this.f37175b--;
        }
    }
}
