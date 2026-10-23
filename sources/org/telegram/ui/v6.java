package org.telegram.ui;

import android.util.SparseArray;
public final class v6 {
    public long f42118a;
    public int f42119b;
    public long f42120c;
    public final SparseArray d = new SparseArray();

    public v6(long j10) {
        this.f42118a = j10;
    }

    public final void a(bi.b bVar, int i10) {
        SparseArray sparseArray = this.d;
        w6 w6Var = (w6) sparseArray.get(i10, null);
        if (w6Var == null) {
            w6Var = new w6();
            sparseArray.put(i10, w6Var);
        }
        long j10 = bVar.f4426c;
        w6Var.f42481a += j10;
        this.f42120c += j10;
        this.f42119b++;
        w6Var.f42482b.add(bVar);
    }

    public final void b(bi.b bVar) {
        w6 w6Var = (w6) this.d.get(bVar.d, null);
        if (w6Var != null && w6Var.f42482b.remove(bVar)) {
            long j10 = w6Var.f42481a;
            long j11 = bVar.f4426c;
            w6Var.f42481a = j10 - j11;
            this.f42120c -= j11;
            this.f42119b--;
        }
    }
}
