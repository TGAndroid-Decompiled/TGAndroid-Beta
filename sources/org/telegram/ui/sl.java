package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class sl extends yr0 {
    public final Bitmap f41536a;
    public final ArrayList f41537b;
    public final un f41538c;

    public sl(un unVar, Bitmap bitmap, ArrayList arrayList) {
        this.f41538c = unVar;
        this.f41536a = bitmap;
        this.f41537b = arrayList;
    }

    @Override
    public final org.telegram.messenger.kc j(int i10) {
        return new org.telegram.messenger.kc(this.f41536a, null, 0);
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        this.f41538c.t((org.telegram.messenger.ef) this.f41537b.get(0), x20Var, z10, i11, 0, z11, 0L);
    }
}
