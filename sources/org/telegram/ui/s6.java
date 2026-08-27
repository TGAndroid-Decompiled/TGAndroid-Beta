package org.telegram.ui;

import android.util.SparseArray;

public final class s6 {

    public long f42522a;

    public int f42523b;

    public long f42524c;
    public final SparseArray d = new SparseArray();

    public s6(long j10) {
        this.f42522a = j10;
    }

    public final void a(ih.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i10, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i10, t6Var);
        }
        long j10 = aVar.f11478c;
        t6Var.f42787a += j10;
        this.f42524c += j10;
        this.f42523b++;
        t6Var.f42788b.add(aVar);
    }

    public final void b(ih.a aVar) {
        t6 t6Var = (t6) this.d.get(aVar.d, null);
        if (t6Var != null && t6Var.f42788b.remove(aVar)) {
            long j10 = t6Var.f42787a;
            long j11 = aVar.f11478c;
            t6Var.f42787a = j10 - j11;
            this.f42524c -= j11;
            this.f42523b--;
        }
    }
}
