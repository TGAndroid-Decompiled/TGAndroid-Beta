package org.telegram.ui;

import android.util.SparseArray;
public final class t6 {
    public long f49713a;
    public int f49714b;
    public long f49715c;
    public final SparseArray d = new SparseArray();

    public t6(long j10) {
        this.f49713a = j10;
    }

    public final void a(di.b bVar, int i3) {
        SparseArray sparseArray = this.d;
        u6 u6Var = (u6) sparseArray.get(i3, null);
        if (u6Var == null) {
            u6Var = new u6();
            sparseArray.put(i3, u6Var);
        }
        long j10 = bVar.f9182c;
        u6Var.f49985a += j10;
        this.f49715c += j10;
        this.f49714b++;
        u6Var.f49986b.add(bVar);
    }

    public final void b(di.b bVar) {
        u6 u6Var = (u6) this.d.get(bVar.d, null);
        if (u6Var != null && u6Var.f49986b.remove(bVar)) {
            long j10 = u6Var.f49985a;
            long j11 = bVar.f9182c;
            u6Var.f49985a = j10 - j11;
            this.f49715c -= j11;
            this.f49714b--;
        }
    }
}
