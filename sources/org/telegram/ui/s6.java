package org.telegram.ui;

import android.util.SparseArray;
public final class s6 {
    public long f40339a;
    public int f40340b;
    public long f40341c;
    public final SparseArray d = new SparseArray();

    public s6(long j3) {
        this.f40339a = j3;
    }

    public final void a(ai.b bVar, int i10) {
        SparseArray sparseArray = this.d;
        t6 t6Var = (t6) sparseArray.get(i10, null);
        if (t6Var == null) {
            t6Var = new t6();
            sparseArray.put(i10, t6Var);
        }
        long j3 = bVar.f752c;
        t6Var.f40659a += j3;
        this.f40341c += j3;
        this.f40340b++;
        t6Var.f40660b.add(bVar);
    }

    public final void b(ai.b bVar) {
        t6 t6Var = (t6) this.d.get(bVar.d, null);
        if (t6Var != null && t6Var.f40660b.remove(bVar)) {
            long j3 = t6Var.f40659a;
            long j10 = bVar.f752c;
            t6Var.f40659a = j3 - j10;
            this.f40341c -= j10;
            this.f40340b--;
        }
    }
}
