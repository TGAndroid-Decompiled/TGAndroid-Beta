package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class uh1 implements org.telegram.ui.Components.f81 {
    public final WallpapersListActivity f43270a;

    public uh1(WallpapersListActivity wallpapersListActivity) {
        this.f43270a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        qc1 qc1Var = new qc1(new ai1(file, file, ""), bitmap, false);
        qc1Var.c1(0L);
        this.f43270a.presentFragment(qc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
