package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class uh1 implements org.telegram.ui.Components.r91 {
    public final WallpapersListActivity f42449a;

    public uh1(WallpapersListActivity wallpapersListActivity) {
        this.f42449a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        qc1 qc1Var = new qc1(new ai1(file, file, ""), bitmap, false);
        qc1Var.c1(0L);
        this.f42449a.presentFragment(qc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
