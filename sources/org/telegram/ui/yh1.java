package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class yh1 implements org.telegram.ui.Components.ba1 {
    public final WallpapersListActivity f46026a;

    public yh1(WallpapersListActivity wallpapersListActivity) {
        this.f46026a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        vc1 vc1Var = new vc1(new ei1(file, file, ""), bitmap, false);
        vc1Var.d1(0L);
        this.f46026a.presentFragment(vc1Var, z10);
    }

    @Override
    public final void a() {
    }
}
