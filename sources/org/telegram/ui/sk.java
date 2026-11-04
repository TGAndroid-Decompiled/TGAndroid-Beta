package org.telegram.ui;

import java.util.ArrayList;
public final class sk extends eq0 {
    public final ArrayList f49526a;
    public final boolean[] f49527b;
    public final wm f49528c;

    public sk(wm wmVar, ArrayList arrayList, boolean[] zArr) {
        this.f49528c = wmVar;
        this.f49526a = arrayList;
        this.f49527b = zArr;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.messenger.cc j(int i3) {
        return null;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.f49526a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f49527b[size]) {
                arrayList.remove(size);
            }
        }
        this.f49528c.Gb(i10, arrayList, z10, z11);
    }

    @Override
    public final boolean x(int i3) {
        return this.f49527b[i3];
    }

    @Override
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        return i3;
    }
}
