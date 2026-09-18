package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class yi1 implements org.telegram.ui.Components.d91 {
    public final WallpapersListActivity f39835a;

    public yi1(WallpapersListActivity wallpapersListActivity) {
        this.f39835a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        vd1 vd1Var = new vd1(new fj1(file, file, ""), bitmap, false);
        vd1Var.c1(0L);
        this.f39835a.presentFragment(vd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
