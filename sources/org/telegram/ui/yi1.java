package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yi1 implements org.telegram.ui.ActionBar.a2, wd1 {
    public final WallpapersListActivity f39949a;

    public yi1(WallpapersListActivity wallpapersListActivity) {
        this.f39949a = wallpapersListActivity;
    }

    @Override
    public void a(TLRPC.TL_wallPaper tL_wallPaper) {
        int[][] iArr = WallpapersListActivity.f31902i0;
        this.f39949a.removeSelfFromStack();
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        WallpapersListActivity.U(this.f39949a);
    }
}
