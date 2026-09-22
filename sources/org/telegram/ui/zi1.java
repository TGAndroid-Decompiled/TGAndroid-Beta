package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class zi1 implements org.telegram.ui.Components.f91 {
    public final WallpapersListActivity f40245a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.f40245a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        xd1 xd1Var = new xd1(new gj1(file, file, ""), bitmap, false);
        xd1Var.c1(0L);
        this.f40245a.presentFragment(xd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
