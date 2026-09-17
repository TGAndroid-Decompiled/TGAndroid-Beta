package org.telegram.ui;

import android.util.SparseArray;
public final class t6 {
    public long f37667a;
    public int f37668b;
    public long f37669c;
    public final SparseArray d = new SparseArray();

    public t6(long j3) {
        this.f37667a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        u6 u6Var = (u6) sparseArray.get(i10, null);
        if (u6Var == null) {
            u6Var = new u6();
            sparseArray.put(i10, u6Var);
        }
        long j3 = aVar.f49219c;
        u6Var.f37943a += j3;
        this.f37669c += j3;
        this.f37668b++;
        u6Var.f37944b.add(aVar);
    }

    public final void b(zh.a aVar) {
        u6 u6Var = (u6) this.d.get(aVar.d, null);
        if (u6Var != null && u6Var.f37944b.remove(aVar)) {
            long j3 = u6Var.f37943a;
            long j10 = aVar.f49219c;
            u6Var.f37943a = j3 - j10;
            this.f37669c -= j10;
            this.f37668b--;
        }
    }
}
