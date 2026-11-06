package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class vk extends mq0 {
    public final Bitmap f50739a;
    public final ArrayList f50740b;
    public final an f50741c;

    public vk(an anVar, Bitmap bitmap, ArrayList arrayList) {
        this.f50741c = anVar;
        this.f50739a = bitmap;
        this.f50740b = arrayList;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        return new org.telegram.messenger.jc(this.f50739a, null, 0);
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.f50741c.u((org.telegram.messenger.gf) this.f50740b.get(0), j20Var, z9, i10, 0, z10, 0L);
    }
}
