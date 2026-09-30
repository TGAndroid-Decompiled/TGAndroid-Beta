package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f37288a;
    public int f37289b;
    public long f37290c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f37288a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f49574c;
        s6Var.f37695a += j3;
        this.f37290c += j3;
        this.f37289b++;
        s6Var.f37696b.add(aVar);
    }

    public final void b(zh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f37696b.remove(aVar)) {
            long j3 = s6Var.f37695a;
            long j10 = aVar.f49574c;
            s6Var.f37695a = j3 - j10;
            this.f37290c -= j10;
            this.f37289b--;
        }
    }
}
