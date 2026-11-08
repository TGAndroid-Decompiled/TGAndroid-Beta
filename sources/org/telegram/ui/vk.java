package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class vk extends nq0 {
    public final Bitmap f50692a;
    public final ArrayList f50693b;
    public final an f50694c;

    public vk(an anVar, Bitmap bitmap, ArrayList arrayList) {
        this.f50694c = anVar;
        this.f50692a = bitmap;
        this.f50693b = arrayList;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        return new org.telegram.messenger.jc(this.f50692a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.f50694c.u((org.telegram.messenger.gf) this.f50693b.get(0), j20Var, z9, i10, 0, z10, 0L);
    }
}
