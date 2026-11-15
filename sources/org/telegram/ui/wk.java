package org.telegram.ui;

import java.util.ArrayList;
public final class wk extends mq0 {
    public final ArrayList f52925a;
    public final boolean[] f52926b;
    public final an f52927c;

    public wk(an anVar, ArrayList arrayList, boolean[] zArr) {
        this.f52927c = anVar;
        this.f52925a = arrayList;
        this.f52926b = zArr;
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
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.f52925a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f52926b[size]) {
                arrayList.remove(size);
            }
        }
        this.f52927c.Kb(i10, arrayList, z10, z11);
    }

    @Override
    public final boolean x(int i7) {
        return this.f52926b[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        return i7;
    }
}
