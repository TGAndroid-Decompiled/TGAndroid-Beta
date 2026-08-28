package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class sh1 implements org.telegram.ui.Components.t71 {
    public final WallpapersListActivity f42701a;

    public sh1(WallpapersListActivity wallpapersListActivity) {
        this.f42701a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        oc1 oc1Var = new oc1(new yh1(file, file, ""), bitmap, false);
        oc1Var.c1(0L);
        this.f42701a.presentFragment(oc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
