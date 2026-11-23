package org.telegram.ui;

import android.util.SparseArray;
public final class s6 {
    public long f51980a;
    public int f51981b;
    public long f51982c;
    public final SparseArray d = new SparseArray();

    public s6(long j3) {
        this.f51980a = j3;
    }

    public final void a(ei.b bVar, int i7) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i7, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i7, t6Var);
        }
        long j3 = bVar.f10958c;
        t6Var.f52263a += j3;
        this.f51982c += j3;
        this.f51981b++;
        t6Var.f52264b.add(bVar);
    }

    public final void b(ei.b bVar) {
        t6 t6Var = (t6) this.d.get(bVar.d, null);
        if (t6Var != null && t6Var.f52264b.remove(bVar)) {
            long j3 = t6Var.f52263a;
            long j10 = bVar.f10958c;
            t6Var.f52263a = j3 - j10;
            this.f51982c -= j10;
            this.f51981b--;
        }
    }
}
