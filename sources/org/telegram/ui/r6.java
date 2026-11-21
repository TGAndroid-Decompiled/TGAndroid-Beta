package org.telegram.ui;

import android.util.SparseArray;
public final class r6 {
    public long f51460a;
    public int f51461b;
    public long f51462c;
    public final SparseArray d = new SparseArray();

    public r6(long j3) {
        this.f51460a = j3;
    }

    public final void a(ei.b bVar, int i7) {
        SparseArray sparseArray = this.d;
        s6 s6Var = (s6) sparseArray.get(i7, null);
        if (s6Var == null) {
            s6Var = new s6();
            sparseArray.put(i7, s6Var);
        }
        long j3 = bVar.f10994c;
        s6Var.f51942a += j3;
        this.f51462c += j3;
        this.f51461b++;
        s6Var.f51943b.add(bVar);
    }

    public final void b(ei.b bVar) {
        s6 s6Var = (s6) this.d.get(bVar.d, null);
        if (s6Var != null && s6Var.f51943b.remove(bVar)) {
            long j3 = s6Var.f51942a;
            long j10 = bVar.f10994c;
            s6Var.f51942a = j3 - j10;
            this.f51462c -= j10;
            this.f51461b--;
        }
    }
}
