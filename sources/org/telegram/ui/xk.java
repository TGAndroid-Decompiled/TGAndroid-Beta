package org.telegram.ui;

import java.util.ArrayList;
public final class xk extends pq0 {
    public final ArrayList f53816a;
    public final boolean[] f53817b;
    public final bn f53818c;

    public xk(bn bnVar, ArrayList arrayList, boolean[] zArr) {
        this.f53818c = bnVar;
        this.f53816a = arrayList;
        this.f53817b = zArr;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return null;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.f53816a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f53817b[size]) {
                arrayList.remove(size);
            }
        }
        this.f53818c.Kb(i10, arrayList, z10, z11);
    }

    @Override
    public final boolean x(int i7) {
        return this.f53817b[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.f20 f20Var) {
        return i7;
    }
}
