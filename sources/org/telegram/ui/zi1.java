package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class zi1 implements org.telegram.ui.Components.o81 {
    public final WallpapersListActivity f40220a;

    public zi1(WallpapersListActivity wallpapersListActivity) {
        this.f40220a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        vd1 vd1Var = new vd1(new gj1(file, file, ""), bitmap, false);
        vd1Var.c1(0L);
        this.f40220a.presentFragment(vd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
