package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class si1 implements org.telegram.ui.Components.d91 {
    public final WallpapersListActivity f37802a;

    public si1(WallpapersListActivity wallpapersListActivity) {
        this.f37802a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        od1 od1Var = new od1(new zi1(file, file, ""), bitmap, false);
        od1Var.c1(0L);
        this.f37802a.presentFragment(od1Var, z10);
    }

    @Override
    public final void a() {
    }
}
