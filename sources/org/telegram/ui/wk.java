package org.telegram.ui;

import java.util.ArrayList;
public final class wk extends mq0 {
    public final ArrayList f52922a;
    public final boolean[] f52923b;
    public final an f52924c;

    public wk(an anVar, ArrayList arrayList, boolean[] zArr) {
        this.f52924c = anVar;
        this.f52922a = arrayList;
        this.f52923b = zArr;
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
        ArrayList arrayList = this.f52922a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f52923b[size]) {
                arrayList.remove(size);
            }
        }
        this.f52924c.Kb(i10, arrayList, z10, z11);
    }

    @Override
    public final boolean x(int i7) {
        return this.f52923b[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        return i7;
    }
}
