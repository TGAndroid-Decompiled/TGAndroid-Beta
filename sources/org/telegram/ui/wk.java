package org.telegram.ui;

import java.util.ArrayList;
public final class wk extends mq0 {
    public final ArrayList f51446a;
    public final boolean[] f51447b;
    public final an f51448c;

    public wk(an anVar, ArrayList arrayList, boolean[] zArr) {
        this.f51448c = anVar;
        this.f51446a = arrayList;
        this.f51447b = zArr;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        return null;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ArrayList arrayList = this.f51446a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f51447b[size]) {
                arrayList.remove(size);
            }
        }
        this.f51448c.Gb(i10, arrayList, z9, z10);
    }

    @Override
    public final boolean x(int i7) {
        return this.f51447b[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
