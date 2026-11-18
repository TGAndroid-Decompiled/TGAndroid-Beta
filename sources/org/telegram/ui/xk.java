package org.telegram.ui;

import java.util.ArrayList;
public final class xk extends oq0 {
    public final ArrayList f53873a;
    public final boolean[] f53874b;
    public final bn f53875c;

    public xk(bn bnVar, ArrayList arrayList, boolean[] zArr) {
        this.f53875c = bnVar;
        this.f53873a = arrayList;
        this.f53874b = zArr;
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
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.f53873a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f53874b[size]) {
                arrayList.remove(size);
            }
        }
        this.f53875c.Kb(i10, arrayList, z10, z11);
    }

    @Override
    public final boolean x(int i7) {
        return this.f53874b[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.e20 e20Var) {
        return i7;
    }
}
