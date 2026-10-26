package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class wh1 implements org.telegram.ui.Components.aa1 {
    public final WallpapersListActivity f45497a;

    public wh1(WallpapersListActivity wallpapersListActivity) {
        this.f45497a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        tc1 tc1Var = new tc1(new ci1(file, file, ""), bitmap, false);
        tc1Var.d1(0L);
        this.f45497a.presentFragment(tc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
