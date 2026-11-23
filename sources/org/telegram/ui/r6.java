package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f51464a;
    public int f51465b;
    public long f51466c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f51464a = j3;
    }

    public final void a(ei.b bVar, int i7) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i7, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i7, s6Var);
        }
        long j3 = bVar.f10997c;
        s6Var.f51946a += j3;
        this.f51466c += j3;
        this.f51465b++;
        s6Var.f51947b.add(bVar);
    }

    public final void b(ei.b bVar) {
        s6 s6Var = (s6) this.d.get(bVar.d, null);
        if (s6Var != null && s6Var.f51947b.remove(bVar)) {
            long j3 = s6Var.f51946a;
            long j10 = bVar.f10997c;
            s6Var.f51946a = j3 - j10;
            this.f51466c -= j10;
            this.f51465b--;
        }
    }
}
