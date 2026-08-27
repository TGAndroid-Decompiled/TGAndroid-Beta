package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;

public final class rh1 implements org.telegram.ui.Components.v71 {

    public final WallpapersListActivity f41941a;

    public rh1(WallpapersListActivity wallpapersListActivity) {
        this.f41941a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        nc1 nc1Var = new nc1(new xh1(file, file, ""), bitmap, false);
        nc1Var.c1(0L);
        this.f41941a.presentFragment(nc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
