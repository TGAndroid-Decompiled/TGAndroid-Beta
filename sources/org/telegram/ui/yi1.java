package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yi1 implements org.telegram.ui.ActionBar.b2, wd1 {
    public final WallpapersListActivity f39929a;

    public yi1(WallpapersListActivity wallpapersListActivity) {
        this.f39929a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31635i0;
        this.f39929a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        WallpapersListActivity.U(this.f39929a);
    }
}
