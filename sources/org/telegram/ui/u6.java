package org.telegram.ui;

import android.util.SparseArray;
public final class u6 {
    public long f38128a;
    public int f38129b;
    public long f38130c;
    public final SparseArray d = new SparseArray();

    public u6(long j3) {
        this.f38128a = j3;
    }

    public final void a(zh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        v6 v6Var = (v6) sparseArray.get(i10, null);
        if (v6Var == null) {
            v6Var = new v6();
            sparseArray.put(i10, v6Var);
        }
        long j3 = aVar.f49512c;
        v6Var.f38456a += j3;
        this.f38130c += j3;
        this.f38129b++;
        v6Var.f38457b.add(aVar);
    }

    public final void b(zh.a aVar) {
        v6 v6Var = (v6) this.d.get(aVar.d, null);
        if (v6Var != null && v6Var.f38457b.remove(aVar)) {
            long j3 = v6Var.f38456a;
            long j10 = aVar.f49512c;
            v6Var.f38456a = j3 - j10;
            this.f38130c -= j10;
            this.f38129b--;
        }
    }
}
