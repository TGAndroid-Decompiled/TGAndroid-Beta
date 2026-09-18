package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xi1 implements org.telegram.ui.ActionBar.a2, ud1 {
    public final WallpapersListActivity f39501a;

    public xi1(WallpapersListActivity wallpapersListActivity) {
        this.f39501a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31862i0;
        this.f39501a.removeSelfFromStack();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f39501a);
    }
}
