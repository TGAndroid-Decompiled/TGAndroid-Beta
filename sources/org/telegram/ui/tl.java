package org.telegram.ui;

import java.util.ArrayList;
public final class tl extends yr0 {
    public final ArrayList f41856a;
    public final boolean[] f41857b;
    public final un f41858c;

    public tl(un unVar, ArrayList arrayList, boolean[] zArr) {
        this.f41858c = unVar;
        this.f41856a = arrayList;
        this.f41857b = zArr;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final org.telegram.messenger.kc j(int i10) {
        return null;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.f41856a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f41857b[size]) {
                arrayList.remove(size);
            }
        }
        this.f41858c.wb(i11, arrayList, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f41857b[i10];
    }

    @Override
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        return i10;
    }
}
