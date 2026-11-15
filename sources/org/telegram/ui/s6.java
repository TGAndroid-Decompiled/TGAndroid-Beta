package org.telegram.ui;

import android.util.SparseArray;
public final class s6 {
    public long f51112a;
    public int f51113b;
    public long f51114c;
    public final SparseArray d = new SparseArray();

    public s6(long j3) {
        this.f51112a = j3;
    }

    public final void a(ei.b bVar, int i7) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i7, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i7, t6Var);
        }
        long j3 = bVar.f10648c;
        t6Var.f51389a += j3;
        this.f51114c += j3;
        this.f51113b++;
        t6Var.f51390b.add(bVar);
    }

    public final void b(ei.b bVar) {
        t6 t6Var = (t6) this.d.get(bVar.d, null);
        if (t6Var != null && t6Var.f51390b.remove(bVar)) {
            long j3 = t6Var.f51389a;
            long j10 = bVar.f10648c;
            t6Var.f51389a = j3 - j10;
            this.f51114c -= j10;
            this.f51113b--;
        }
    }
}
