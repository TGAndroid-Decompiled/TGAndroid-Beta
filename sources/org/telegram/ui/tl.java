package org.telegram.ui;

import java.util.ArrayList;
public final class tl extends xr0 {
    public final ArrayList f41664a;
    public final boolean[] f41665b;
    public final un f41666c;

    public tl(un unVar, ArrayList arrayList, boolean[] zArr) {
        this.f41666c = unVar;
        this.f41664a = arrayList;
        this.f41665b = zArr;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.messenger.lc j(int i10) {
        return null;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.f41664a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f41665b[size]) {
                arrayList.remove(size);
            }
        }
        this.f41666c.Bb(i11, arrayList, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f41665b[i10];
    }

    @Override
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        return i10;
    }
}
