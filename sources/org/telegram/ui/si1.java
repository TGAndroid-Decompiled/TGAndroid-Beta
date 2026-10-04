package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
public final class si1 implements org.telegram.ui.Components.m91 {
    public final WallpapersListActivity f40495a;

    public si1(WallpapersListActivity wallpapersListActivity) {
        this.f40495a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z10) {
        rd1 rd1Var = new rd1(new zi1(file, file, ""), bitmap, false);
        rd1Var.c1(0L);
        this.f40495a.presentFragment(rd1Var, z10);
    }

    @Override
    public final void a() {
    }
}
