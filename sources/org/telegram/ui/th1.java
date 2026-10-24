package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class th1 implements org.telegram.ui.Components.r91 {
    public final WallpapersListActivity f42068a;

    public th1(WallpapersListActivity wallpapersListActivity) {
        this.f42068a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        pc1 pc1Var = new pc1(new zh1(file, file, ""), bitmap, false);
        pc1Var.c1(0L);
        this.f42068a.presentFragment(pc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
