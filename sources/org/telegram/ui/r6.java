package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f36238a;
    public int f36239b;
    public long f36240c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f36238a = j3;
    }

    public final void a(yh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i10, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i10, s6Var);
        }
        long j3 = aVar.f47169c;
        s6Var.f36559a += j3;
        this.f36240c += j3;
        this.f36239b++;
        s6Var.f36560b.add(aVar);
    }

    public final void b(yh.a aVar) {
        s6 s6Var = (s6) this.d.get(aVar.d, null);
        if (s6Var != null && s6Var.f36560b.remove(aVar)) {
            long j3 = s6Var.f36559a;
            long j10 = aVar.f47169c;
            s6Var.f36559a = j3 - j10;
            this.f36240c -= j10;
            this.f36239b--;
        }
    }
}
