package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
public final class rk extends eq0 {
    public final Bitmap f49237a;
    public final ArrayList f49238b;
    public final wm f49239c;

    public rk(wm wmVar, Bitmap bitmap, ArrayList arrayList) {
        this.f49239c = wmVar;
        this.f49237a = bitmap;
        this.f49238b = arrayList;
    }

    @Override
    public final org.telegram.messenger.cc j(int i3) {
        return new org.telegram.messenger.cc(this.f49237a, null, 0);
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f49239c.u((org.telegram.messenger.ye) this.f49238b.get(0), b20Var, z10, i10, 0, z11, 0L);
    }
}
