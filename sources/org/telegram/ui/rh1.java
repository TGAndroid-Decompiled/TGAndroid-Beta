package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rh1 implements org.telegram.ui.ActionBar.b2, nc1 {
    public final WallpapersListActivity f42434a;

    public rh1(WallpapersListActivity wallpapersListActivity) {
        this.f42434a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f36296g0;
        this.f42434a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        WallpapersListActivity.T(this.f42434a);
    }
}
