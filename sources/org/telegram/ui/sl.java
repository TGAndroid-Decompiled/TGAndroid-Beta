package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class sl extends xr0 {
    public final Bitmap f41385a;
    public final ArrayList f41386b;
    public final un f41387c;

    public sl(un unVar, Bitmap bitmap, ArrayList arrayList) {
        this.f41387c = unVar;
        this.f41385a = bitmap;
        this.f41386b = arrayList;
    }

    @Override
    public final org.telegram.messenger.lc j(int i10) {
        return new org.telegram.messenger.lc(this.f41385a, null, 0);
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        this.f41387c.u((org.telegram.messenger.ff) this.f41386b.get(0), y20Var, z10, i11, 0, z11, 0L);
    }
}
