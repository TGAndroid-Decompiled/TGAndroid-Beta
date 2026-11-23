package org.telegram.ui;

import java.util.ArrayList;
public final class xk extends oq0 {
    public final ArrayList f53986a;
    public final boolean[] f53987b;
    public final bn f53988c;

    public xk(bn bnVar, ArrayList arrayList, boolean[] zArr) {
        this.f53988c = bnVar;
        this.f53986a = arrayList;
        this.f53987b = zArr;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        return null;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.f53986a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f53987b[size]) {
                arrayList.remove(size);
            }
        }
        this.f53988c.Kb(i10, arrayList, z10, z11);
    }

    @Override
    public final boolean x(int i7) {
        return this.f53987b[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.d20 d20Var) {
        return i7;
    }
}
