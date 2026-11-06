package org.telegram.ui;

import android.util.SparseArray;
public final class s6 {
    public long f49640a;
    public int f49641b;
    public long f49642c;
    public final SparseArray d = new SparseArray();

    public s6(long j3) {
        this.f49640a = j3;
    }

    public final void a(ci.b bVar, int i7) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i7, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i7, t6Var);
        }
        long j3 = bVar.f6419c;
        t6Var.f49925a += j3;
        this.f49642c += j3;
        this.f49641b++;
        t6Var.f49926b.add(bVar);
    }

    public final void b(ci.b bVar) {
        t6 t6Var = (t6) this.d.get(bVar.d, null);
        if (t6Var != null && t6Var.f49926b.remove(bVar)) {
            long j3 = t6Var.f49925a;
            long j10 = bVar.f6419c;
            t6Var.f49925a = j3 - j10;
            this.f49642c -= j10;
            this.f49641b--;
        }
    }
}
