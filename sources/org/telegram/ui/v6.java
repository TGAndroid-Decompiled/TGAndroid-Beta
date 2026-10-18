package org.telegram.ui;

import android.util.SparseArray;
public final class v6 {
    public long f42108a;
    public int f42109b;
    public long f42110c;
    public final SparseArray d = new SparseArray();

    public v6(long j10) {
        this.f42108a = j10;
    }

    public final void a(bi.b bVar, int i10) {
        SparseArray sparseArray = this.d;
        w6 w6Var = (w6) sparseArray.get(i10, null);
        if (w6Var == null) {
            w6Var = new w6();
            sparseArray.put(i10, w6Var);
        }
        long j10 = bVar.f4430c;
        w6Var.f42362a += j10;
        this.f42110c += j10;
        this.f42109b++;
        w6Var.f42363b.add(bVar);
    }

    public final void b(bi.b bVar) {
        w6 w6Var = (w6) this.d.get(bVar.d, null);
        if (w6Var != null && w6Var.f42363b.remove(bVar)) {
            long j10 = w6Var.f42362a;
            long j11 = bVar.f4430c;
            w6Var.f42362a = j10 - j11;
            this.f42110c -= j11;
            this.f42109b--;
        }
    }
}
