package org.telegram.ui;

import java.util.ArrayList;
public final class yk extends pq0 {
    public final ArrayList f52134a;
    public final boolean[] f52135b;
    public final cn f52136c;

    public yk(cn cnVar, ArrayList arrayList, boolean[] zArr) {
        this.f52136c = cnVar;
        this.f52134a = arrayList;
        this.f52135b = zArr;
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
        ArrayList arrayList = this.f52134a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f52135b[size]) {
                arrayList.remove(size);
            }
        }
        this.f52136c.Jb(i10, arrayList, z9, z10);
    }

    @Override
    public final boolean x(int i7) {
        return this.f52135b[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
