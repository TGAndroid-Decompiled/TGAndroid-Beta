package org.telegram.ui;

import android.util.SparseArray;
public final class w6 {
    public long f44525a;
    public int f44526b;
    public long f44527c;
    public final SparseArray d = new SparseArray();

    public w6(long j10) {
        this.f44525a = j10;
    }

    public final void a(ci.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        x6 x6Var = (x6) sparseArray.get(i10, null);
        if (x6Var == null) {
            x6Var = new x6();
            sparseArray.put(i10, x6Var);
        }
        long j10 = aVar.f6366c;
        x6Var.f45602a += j10;
        this.f44527c += j10;
        this.f44526b++;
        x6Var.f45603b.add(aVar);
    }

    public final void b(ci.a aVar) {
        x6 x6Var = (x6) this.d.get(aVar.d, null);
        if (x6Var != null && x6Var.f45603b.remove(aVar)) {
            long j10 = x6Var.f45602a;
            long j11 = aVar.f6366c;
            x6Var.f45602a = j10 - j11;
            this.f44527c -= j11;
            this.f44526b--;
        }
    }
}
