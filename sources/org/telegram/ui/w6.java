package org.telegram.ui;

import android.util.SparseArray;
public final class w6 {
    public long f41163a;
    public int f41164b;
    public long f41165c;
    public final SparseArray d = new SparseArray();

    public w6(long j10) {
        this.f41163a = j10;
    }

    public final void a(ai.b bVar, int i10) {
        SparseArray sparseArray = this.d;
        x6 x6Var = (x6) sparseArray.get(i10, null);
        if (x6Var == null) {
            x6Var = new x6();
            sparseArray.put(i10, x6Var);
        }
        long j10 = bVar.f917c;
        x6Var.f41760a += j10;
        this.f41165c += j10;
        this.f41164b++;
        x6Var.f41761b.add(bVar);
    }

    public final void b(ai.b bVar) {
        x6 x6Var = (x6) this.d.get(bVar.d, null);
        if (x6Var != null && x6Var.f41761b.remove(bVar)) {
            long j10 = x6Var.f41760a;
            long j11 = bVar.f917c;
            x6Var.f41760a = j10 - j11;
            this.f41165c -= j11;
            this.f41164b--;
        }
    }
}
