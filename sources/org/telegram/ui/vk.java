package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class vk extends mq0 {
    public final Bitmap f52240a;
    public final ArrayList f52241b;
    public final an f52242c;

    public vk(an anVar, Bitmap bitmap, ArrayList arrayList) {
        this.f52242c = anVar;
        this.f52240a = bitmap;
        this.f52241b = arrayList;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return new org.telegram.messenger.ic(this.f52240a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f52242c.u((org.telegram.messenger.ff) this.f52241b.get(0), g20Var, z10, i10, 0, z11, 0L);
    }
}
